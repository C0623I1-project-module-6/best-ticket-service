ALTER TABLE tickets
    DROP COLUMN location,
    DROP COLUMN `time`,
    DROP COLUMN barcode;
ALTER TABLE tickets
    DROP FOREIGN KEY event_id,
    DROP COLUMN event_id;

ALTER TABLE tickets
ADD COLUMN event_time_id BINARY(16),
    ADD CONSTRAINT event_time_id FOREIGN KEY (event_time_id) REFERENCES event_times (event_id) ;