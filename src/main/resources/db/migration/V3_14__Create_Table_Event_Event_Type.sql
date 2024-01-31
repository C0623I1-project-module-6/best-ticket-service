
ALTER TABLE events
DROP COLUMN address;

ALTER TABLE events
DROP FOREIGN KEY events_ibfk_1;

DROP INDEX event_type_id ON events;
CREATE TABLE IF NOT EXISTS event_event_types
(
    event_id        BINARY(16)       NOT NULL,
    event_type_id   BINARY(16)       NOT NULL,
    is_deleted      BIT DEFAULT b'0' NULL,

    CONSTRAINT pk_event_event_types PRIMARY KEY (event_id, event_type_id),

    CONSTRAINT fk_event_event_type_event
    FOREIGN KEY (event_id)
    REFERENCES events (id),

    CONSTRAINT fk_event_event_type_event_type
    FOREIGN KEY (event_type_id)
    REFERENCES event_types (id)
    );

CREATE INDEX index_event_event_types_event
    ON event_event_types (event_id);

CREATE INDEX index_event_event_types_event_types
    ON event_event_types (event_type_id);


