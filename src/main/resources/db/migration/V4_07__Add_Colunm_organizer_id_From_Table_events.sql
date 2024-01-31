ALTER TABLE events
ADD COLUMN organizer_id BINARY(16);

ALTER TABLE events
ADD CONSTRAINT organizer_id FOREIGN KEY (organizer_id)REFERENCES organizers (id);
