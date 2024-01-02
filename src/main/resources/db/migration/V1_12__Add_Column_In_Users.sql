ALTER TABLE users
    ADD COLUMN phone_number varchar(15) NOT NULL UNIQUE ,
    ADD COLUMN email varchar(255) NOT NULL  UNIQUE;
