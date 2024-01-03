ALTER TABLE ticket_types
DROP COLUMN price;

ALTER TABLE tickets
ADD COLUMN price double,
ADD COLUMN quantity int;


ALTER TABLE tickets
ADD COLUMN event_id BINARY(16),
    ADD CONSTRAINT event_id FOREIGN KEY (event_id) REFERENCES events(id);

ALTER TABLE tickets
    ADD COLUMN status VARCHAR(45);