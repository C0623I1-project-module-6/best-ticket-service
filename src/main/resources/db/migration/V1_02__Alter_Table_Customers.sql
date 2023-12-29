ALTER TABLE customer
    ADD COLUMN user_customer_id binary(36),
    ADD CONSTRAINT  user_customer_id FOREIGN KEY (user_customer_id) REFERENCES users (id);

RENAME TABLE customer TO customers;