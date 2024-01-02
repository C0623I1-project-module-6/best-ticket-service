ALTER TABLE organizer
    ADD COLUMN user_organizer_id binary(36) UNIQUE ,
    ADD CONSTRAINT user_organizer_id FOREIGN KEY (user_organizer_id) REFERENCES users (id);

RENAME
TABLE organizer TO organizers;