ALTER TABLE ticket_types
DROP COLUMN price;

ALTER TABLE tickets
ADD COLUMN price double,
ADD COLUMN quantity int;


ALTER TABLE tickets
    ADD COLUMN status VARCHAR(45);

