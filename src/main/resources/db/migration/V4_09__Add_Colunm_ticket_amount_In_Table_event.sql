ALTER TABLE events
ADD COLUMN ticket_amount INT;

UPDATE events
SET ticket_amount = 100
where ticket_amount IS NULL;

UPDATE tickets
SET description = 'description'
where description IS NULL