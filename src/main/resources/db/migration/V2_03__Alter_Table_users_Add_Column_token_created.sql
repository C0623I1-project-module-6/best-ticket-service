ALTER TABLE users
    ADD COLUMN remember_token VARCHAR(200),
    ADD COLUMN created VARCHAR(255),
    ADD COLUMN is_activated BIT DEFAULT 1,
DROP
COLUMN phone_number;

