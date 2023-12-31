ALTER TABLE users
DROP
COLUMN full_name,
    DROP
COLUMN gender,
    DROP
COLUMN date_of_birth,
    DROP
COLUMN phone_number,
    DROP
COLUMN email,
    DROP
COLUMN wallet;

ALTER TABLE users
    ADD COLUMN username VARCHAR(50) NOT NULL UNIQUE ,
    ADD COLUMN password     VARCHAR(255)NOT NULL,
    ADD COLUMN role_id      BINARY(36),
    ADD COLUMN customer_id  BINARY(36),
    ADD COLUMN organizer_id BINARY(36)
;

ALTER TABLE users
    ADD CONSTRAINT role_id FOREIGN KEY (role_id) REFERENCES roles (id),
    ADD CONSTRAINT customer_id FOREIGN KEY (customer_id) REFERENCES customer (id),
    ADD CONSTRAINT organizer_id FOREIGN KEY (organizer_id) REFERENCES organizer (id)
;

ALTER TABLE users
DROP
FOREIGN KEY customer_id,
    DROP
FOREIGN KEY organizer_id,
    DROP
COLUMN customer_id,
    DROP
COLUMN organizer_id;

ALTER TABLE users
DROP
COLUMN id_card;