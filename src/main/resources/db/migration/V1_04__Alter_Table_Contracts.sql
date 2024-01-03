ALTER TABLE contracts
    ADD COLUMN customer_id BINARY(36),
    ADD CONSTRAINT customer_id FOREIGN KEY (customer_id) REFERENCES customers(id),
    ADD COLUMN organizer_id binary(36),
    ADD CONSTRAINT organizer_id FOREIGN KEY (organizer_id) REFERENCES organizers (id);