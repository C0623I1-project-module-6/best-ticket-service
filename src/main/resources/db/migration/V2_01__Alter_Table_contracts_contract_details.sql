ALTER TABLE contract_details
    DROP FOREIGN KEY event_id,
    DROP COLUMN event_id;

ALTER TABLE contract_details
    DROP COLUMN quantity,
    DROP COLUMN ticket_price;

ALTER TABLE contract_details
    ADD COLUMN amount double;

ALTER TABLE contracts
    CHANGE amount total_amount double;
