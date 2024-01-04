ALTER TABLE users
    ADD COLUMN token VARCHAR(200)  ,
    ADD COLUMN created VARCHAR(255),
    ADD COLUMN is_actived BIT DEFAULT 1,
    DROP COLUMN phone_number;

