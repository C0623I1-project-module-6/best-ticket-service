CREATE TABLE individuals (
    id BINARY(36) PRIMARY KEY,
    name VARCHAR(50),
    id_card VARCHAR(50),
    phone_number VARCHAR(15),
    email VARCHAR(255),
    is_delete BIT DEFAULT 0,
    user_individuals_id BINARY(36),
    FOREIGN KEY (user_individuals_id) REFERENCES users (id)
);