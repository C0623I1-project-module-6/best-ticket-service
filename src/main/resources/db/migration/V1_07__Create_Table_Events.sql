CREATE TABLE IF NOT EXISTS event_types
(
    id   BINARY(36) PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS events
(
    id            BINARY(36) PRIMARY KEY,
    name          VARCHAR(50)  NOT NULL,
    address       VARCHAR(255) NOT NULL

);

CREATE TABLE IF NOT EXISTS times
(
    id   BINARY(36) PRIMARY KEY,
    time DATETIME
);

CREATE TABLE IF NOT EXISTS event_times
(
    event_id BINARY(36),
    time_id  BINARY(36),
    PRIMARY KEY (event_id, time_id),
    FOREIGN KEY (event_id) REFERENCES events (id),
    FOREIGN KEY (time_id) REFERENCES times (id)
);