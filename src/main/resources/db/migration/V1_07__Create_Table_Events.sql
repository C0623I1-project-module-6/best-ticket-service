CREATE TABLE IF NOT EXISTS event_types
(
    id   BINARY(16) PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS events
(
    id            BINARY(16) PRIMARY KEY,
    name          VARCHAR(50)  NOT NULL,
    address       VARCHAR(255) NOT NULL,
    event_type_id BINARY(16),
    FOREIGN KEY (event_type_id) REFERENCES event_types (id)
);

CREATE TABLE IF NOT EXISTS times
(
    id   BINARY(16) PRIMARY KEY,
    time DATETIME
);

CREATE TABLE IF NOT EXISTS event_times
(
    event_id BINARY(16),
    time_id BINARY(16),
    PRIMARY KEY(event_id, time_id),
    INDEX idx_event_id (event_id),
    INDEX idx_time_id (time_id),
    FOREIGN KEY (event_id) REFERENCES events (id),
    FOREIGN KEY (time_id) REFERENCES times (id)
    );