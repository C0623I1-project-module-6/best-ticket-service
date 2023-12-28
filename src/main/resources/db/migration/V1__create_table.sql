create table users
(
    id            binary(16) primary key,
    full_name     varchar(50)  not null,
    gender        varchar(15),
    id_card       varchar(50)  not null unique,
    date_of_birth varchar(15),
    phone_number  varchar(15)  not null unique,
    email         varchar(255) not null unique,
    wallet        varchar(255)
);

create table roles
(
    id   binary(16) primary key,
    name varchar(50)
);

create table user_roles
(
    user_id binary(16),
    role_id binary(16),
    primary key (user_id, role_id),
    foreign key (user_id) references users (id),
    foreign key (role_id) references roles (id)
);

create table bank_accounts
(
    id             binary(16) primary key,
    account_name   varchar(50),
    account_number varchar(20),
    bank_name      varchar(100),
    branch         varchar(100),
    user_id        binary(16),
    foreign key (user_id) references users (id)
);

CREATE TABLE ticket_types
(
    id     binary(16) PRIMARY KEY,
    `name` VARCHAR(20),
    price  FLOAT
);

CREATE TABLE tickets
(
    id             binary(16) PRIMARY KEY,
    ticket_code    VARCHAR(55) UNIQUE NOT NULL,
    seat           VARCHAR(10),
    `time`         DATETIME,
    location       VARCHAR(30),
    promotion      VARCHAR(5),
    barcode        VARCHAR(20),
    is_delete      varchar(10),
    ticket_type_id binary(16),
    FOREIGN KEY (ticket_type_id)
        REFERENCES ticket_types (id)
);

CREATE TABLE contracts
(
    id         BINARY(16) PRIMARY KEY,
    `date`     DATETIME       NOT NULL,
    amount     DECIMAL(10, 2) NOT NULL,
    `status`   VARCHAR(30)    NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


CREATE TABLE contract_details
(
    id           binary(16) PRIMARY KEY,
    contract_id  binary(16),
    ticket_id    binary(16),
    quantity     INT            NOT NULL,
    ticket_price DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (contract_id)
        REFERENCES contracts (id),
    FOREIGN KEY (ticket_id)
        REFERENCES tickets (id)
);

create table customer
(
    id            binary(16) primary key,
    full_name     varchar(50)  not null,
    gender        varchar(15),
    id_card       varchar(50)  not null unique,
    date_of_birth varchar(15),
    phone_number  varchar(15)  not null unique,
    email         varchar(255) not null unique
);

create table organizer
(
    id           binary(16) primary key,
    full_name    varchar(50)  not null,
    id_card      varchar(50)  not null unique,
    phone_number varchar(15)  not null unique,
    email        varchar(255) not null unique
);