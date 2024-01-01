CREATE TABLE individuals
(
    id                 BINARY(36) PRIMARY KEY,
    full_name          VARCHAR(50),
    id_card            VARCHAR(50),
    phone_number       VARCHAR(15),
    email              VARCHAR(255),
    is_delete          BIT DEFAULT 0,
    user_individual_id BINARY(36),
    FOREIGN KEY (user_individual_id) REFERENCES users (id)
);