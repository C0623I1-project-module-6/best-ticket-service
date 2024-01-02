CREATE TABLE event_types
(
    id   BINARY(36) PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE events
(
    id            BINARY(36) PRIMARY KEY,
    name          VARCHAR(50)  NOT NULL,
    address       VARCHAR(255) NOT NULL,
    event_type_id BINARY(36),
     FOREIGN KEY (event_type_id) REFERENCES event_types (id)
);

CREATE TABLE times
(
    id   BINARY(36) PRIMARY KEY,
    time datetime
);

CREATE TABLE event_times
(
    event_id BINARY(36),
    time_id  BINARY(36),
    PRIMARY KEY (event_id, time_id),
    FOREIGN KEY (event_id) REFERENCES events (id),
    FOREIGN KEY (time_id) REFERENCES times (id)
);