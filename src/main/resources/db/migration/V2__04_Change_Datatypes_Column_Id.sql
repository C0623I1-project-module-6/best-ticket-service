ALTER TABLE bank_accounts
    MODIFY COLUMN id BINARY(16),
    MODIFY COLUMN user_id BINARY(16);
ALTER TABLE contract_details
    MODIFY COLUMN id BINARY(16),
    MODIFY COLUMN contract_id BINARY(16);
ALTER TABLE contracts
    MODIFY COLUMN id BINARY(16),
    MODIFY COLUMN customer_id BINARY(16),
    MODIFY COLUMN organizer_id BINARY(16);
ALTER TABLE customers
    MODIFY COLUMN id BINARY(16),
    MODIFY COLUMN user_customer_id BINARY(16);
ALTER TABLE event_times
    MODIFY COLUMN event_id BINARY(16),
    MODIFY COLUMN time_id BINARY(16);
ALTER TABLE event_types
    MODIFY COLUMN id BINARY(16);
ALTER TABLE events
    MODIFY COLUMN id BINARY(16),
    MODIFY COLUMN event_type_id BINARY(16);
ALTER TABLE individuals
    MODIFY COLUMN id BINARY(16),
    MODIFY COLUMN user_individuals_id BINARY(16);
ALTER TABLE organizers
    MODIFY COLUMN id BINARY(16),
    MODIFY COLUMN user_id BINARY(16);
ALTER TABLE roles
    MODIFY COLUMN id BINARY(16);
ALTER TABLE ticket_types
    MODIFY COLUMN id BINARY(16);
ALTER TABLE tickets
    MODIFY COLUMN id BINARY(16),
    MODIFY COLUMN ticket_type_id BINARY(16);
ALTER TABLE times
    MODIFY COLUMN id BINARY(16);
ALTER TABLE user_roles
    MODIFY COLUMN user_id BINARY(16),
    MODIFY COLUMN role_id BINARY(16);
ALTER TABLE users
    MODIFY COLUMN id BINARY(16);

RENAME TABLE organizers TO enterprise;