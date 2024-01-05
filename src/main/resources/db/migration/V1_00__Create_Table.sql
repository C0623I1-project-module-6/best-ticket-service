CREATE TABLE IF NOT EXISTS users
(
    id            BINARY(36) PRIMARY KEY,
    full_name     VARCHAR(50)  NOT NULL,
    gender        VARCHAR(15),
    id_card       VARCHAR(50)  NOT NULL UNIQUE,
    date_of_birth VARCHAR(15),
    phone_number  VARCHAR(15)  NOT NULL UNIQUE,
    email         VARCHAR(255) NOT NULL UNIQUE,
    avatar        VARCHAR(255),
    wallet        VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS roles
(
    id   BINARY(36) PRIMARY KEY,
    `name` VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS user_roles
(
    user_id BINARY(36),
    role_id BINARY(36),
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (role_id) REFERENCES roles (id)
);

CREATE TABLE IF NOT EXISTS bank_accounts
(
    id             BINARY(36) PRIMARY KEY,
    account_name   VARCHAR(50),
    account_number VARCHAR(20),
    bank_name      VARCHAR(100),
    branch         VARCHAR(100),
    user_id        BINARY(36),
    foreign key (user_id) references users (id)
);

CREATE TABLE IF NOT EXISTS bookings
(
    id         BINARY(36) PRIMARY KEY,
    `date`     DATETIME       NOT NULL,
    amount     DECIMAL(10, 2) NOT NULL,
    `status`   VARCHAR(30)    NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS booking_details
(
    id           BINARY(36) PRIMARY KEY,
    booking_id  BINARY(36),
    quantity     INT            NOT NULL,
    ticket_price DECIMAL(10, 2) NOT NULL,
     FOREIGN KEY (booking_id)
        REFERENCES bookings (id)
);


CREATE TABLE IF NOT EXISTS ticket_types
(
    id     BINARY(36) PRIMARY KEY,
    `name` VARCHAR(20),
    price  FLOAT
);

CREATE TABLE IF NOT EXISTS tickets
(
    id                 BINARY(36) PRIMARY KEY,
    ticket_code        VARCHAR(55) UNIQUE NOT NULL,
    seat               VARCHAR(10),
    `time`             DATETIME,
    location           VARCHAR(30),
    promotion          VARCHAR(5),
    barcode            VARCHAR(20),
    ticket_type_id     BINARY(36),
    booking_detail_id BINARY(16),
    FOREIGN KEY (ticket_type_id)
        REFERENCES ticket_types (id),
    FOREIGN KEY (booking_detail_id)
        REFERENCES booking_details (id)
);


CREATE TABLE IF NOT EXISTS customer
(
    id            BINARY(36) PRIMARY KEY,
    full_name     VARCHAR(50)  NOT NULL,
    gender        VARCHAR(15),
    id_card       VARCHAR(50)  NOT NULL UNIQUE,
    date_of_birth VARCHAR(15),
    phone_number  VARCHAR(20)  NOT NULL UNIQUE,
    email         VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS organizer
(
    id           BINARY(36) PRIMARY KEY,
    full_name    VARCHAR(50)  NOT NULL,
    id_card      VARCHAR(50)  NOT NULL UNIQUE,
    phone_number VARCHAR(15)  NOT NULL UNIQUE,
    email        VARCHAR(255) NOT NULL UNIQUE
);