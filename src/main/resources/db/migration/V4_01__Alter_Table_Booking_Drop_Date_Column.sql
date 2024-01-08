ALTER TABLE bookings
    DROP COLUMN date;

UPDATE bookings
SET status = CASE
                 WHEN RAND() < 0.33 THEN 'ACTIVE'
                 WHEN RAND() < 0.66 THEN 'PENDING'
                 ELSE 'INACTIVE'
    END;