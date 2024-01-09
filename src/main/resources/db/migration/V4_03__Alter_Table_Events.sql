
ALTER TABLE events
ADD COLUMN location_id BINARY(16) NULL;
ALTER TABLE events
ADD FOREIGN KEY (location_id) REFERENCES locations(id);
