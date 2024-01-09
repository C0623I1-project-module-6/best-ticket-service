CREATE TABLE IF NOT EXISTS locations(
    id BINARY(16),
    province VARCHAR(50),
    district VARCHAR(50),
    address VARCHAR(200),
    event_id BINARY(16),
    FOREIGN KEY (event_id) REFERENCES events(id)
    );
ALTER TABLE locations
    ADD INDEX idx_locations_id (id);