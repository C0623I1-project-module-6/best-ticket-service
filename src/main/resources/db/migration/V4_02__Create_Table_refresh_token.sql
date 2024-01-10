CREATE TABLE IF NOT EXISTS refresh_tokens
(
    id          BINARY(16),
    refresh_token       VARCHAR(255),
    expiry_date VARCHAR(255),
    user_id     BINARY(16),
    FOREIGN KEY (user_id) REFERENCES users (id)
);