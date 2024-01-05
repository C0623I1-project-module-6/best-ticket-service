
ALTER TABLE events
DROP FOREIGN KEY events_ibfk_1;

DROP INDEX event_type_id ON events;
CREATE TABLE IF NOT EXISTS event_event_type
(
    id              binary(16)       NOT NULL PRIMARY KEY,
    event_id        binary(16)       NOT NULL,
    event_type_id   binary(16)       NOT NULL,
    is_deleted      bit DEFAULT b'0' NULL,

    CONSTRAINT fk_event_event_type_event
    FOREIGN KEY (event_id)
    REFERENCES events (id),

    CONSTRAINT fk_event_event_type_event_type
    FOREIGN KEY (event_type_id)
    REFERENCES event_types (id)
    );

CREATE INDEX index_event_event_type_event
    ON event_event_type (event_id);

CREATE INDEX index_event_event_type_event_type
    ON event_event_type (event_type_id);