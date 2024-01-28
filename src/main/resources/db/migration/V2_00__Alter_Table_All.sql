ALTER TABLE bookings
    DROP FOREIGN KEY individual_id,
    DROP COLUMN individual_id;
ALTER TABLE bookings
    DROP FOREIGN KEY organizer_id,
    DROP COLUMN enterprise_id;


DROP TABLE individuals;
DROP TABLE enterprises;

CREATE TABLE IF NOT EXISTS organizer_types
(
    id        BINARY(16),
    name      VARCHAR(50),
    is_deleted BIT DEFAULT 0
);

CREATE INDEX index_organizer_type_id ON organizer_types (id);

CREATE TABLE IF NOT EXISTS organizers
(
    id                BINARY(16),
    name              VARCHAR(50) ,
    phone_number      VARCHAR(50) UNIQUE,
    email             VARCHAR(255) UNIQUE,
    id_card           VARCHAR(50) UNIQUE,
    tax_code          VARCHAR(50) UNIQUE,
    organizer_type_id BINARY(16),
    user_id           BINARY(16) UNIQUE,
    is_deleted         BIT DEFAULT 0,
    FOREIGN KEY (organizer_type_id) REFERENCES organizer_types (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE INDEX index_organizer_id ON organizers (id);

ALTER TABLE bookings
    ADD COLUMN organizer_id BINARY(16),
    ADD CONSTRAINT organizer_id FOREIGN KEY (organizer_id) REFERENCES organizers (id);

CREATE INDEX index_event_id ON events (id);
ALTER TABLE booking_details
    ADD COLUMN event_id BINARY(16),
    ADD CONSTRAINT event_id FOREIGN KEY (event_id) REFERENCES events (id);

ALTER TABLE customers
    DROP FOREIGN KEY user_customer_id,
    DROP COLUMN user_customer_id;

ALTER TABLE customers
    ADD COLUMN user_id BINARY(16) UNIQUE,
    ADD CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES users (id);

ALTER TABLE customers
    MODIFY date_of_birth VARCHAR(20);