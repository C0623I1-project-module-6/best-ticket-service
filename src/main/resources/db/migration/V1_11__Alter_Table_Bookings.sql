ALTER TABLE bookings
    ADD COLUMN individual_id BINARY(16),
    ADD CONSTRAINT individual_id FOREIGN KEY (individual_id) REFERENCES individuals (id);
ALTER TABLE bookings
    CHANGE COLUMN organizer_id enterprise_id BINARY(16);
