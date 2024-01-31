ALTER TABLE booking_details
    DROP FOREIGN KEY event_id,
    DROP COLUMN event_id;

ALTER TABLE booking_details
    DROP COLUMN quantity,
    DROP COLUMN ticket_price;

ALTER TABLE booking_details
    ADD COLUMN amount DOUBLE;

ALTER TABLE bookings
    CHANGE amount total_amount DOUBLE;
