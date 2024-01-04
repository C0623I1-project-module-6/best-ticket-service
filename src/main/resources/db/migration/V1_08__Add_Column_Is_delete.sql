ALTER TABLE bank_accounts
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE booking_details
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE bookings
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE customers
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE event_times
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE event_types
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE events
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE organizers
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE roles
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE ticket_types
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE tickets
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE times
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE user_roles
    ADD COLUMN is_deleted BIT DEFAULT 0;
ALTER TABLE users
    ADD COLUMN is_deleted BIT DEFAULT 0;