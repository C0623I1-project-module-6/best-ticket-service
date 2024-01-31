ALTER TABLE tickets
DROP COLUMN quantity;

ALTER TABLE ticket_types
ADD COLUMN quantity INT;