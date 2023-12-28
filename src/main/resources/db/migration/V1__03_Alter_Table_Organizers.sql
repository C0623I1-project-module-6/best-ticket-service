RENAME TABLE organizer TO organizers;

ALTER TABLE organizers
    ADD COLUMN user_id binary(36),
    ADD CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES users (id);