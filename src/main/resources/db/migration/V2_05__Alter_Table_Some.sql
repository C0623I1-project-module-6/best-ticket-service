ALTER TABLE tickets
DROP
COLUMN location,
    DROP
COLUMN `time`,
    DROP
COLUMN barcode,
        DROP
COLUMN price;



ALTER TABLE ticket_types
    ADD COLUMN price DOUBLE;

ALTER TABLE tickets
    ADD COLUMN event_id BINARY(16),
    ADD COLUMN time_id BINARY(16),
    ADD FOREIGN KEY (event_id) REFERENCES event_times(event_id),
    ADD FOREIGN KEY (time_id) REFERENCES event_times(time_id)
;