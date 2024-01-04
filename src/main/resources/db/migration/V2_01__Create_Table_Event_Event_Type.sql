CREATE TABLE event_event_type
(
    id  binary(16) primary key,
    event_id BINARY(16),
    event_type_id  BINARY(16),
    FOREIGN KEY (event_id) REFERENCES events (id),
    FOREIGN KEY (event_type_id) REFERENCES event_types (id)
);
