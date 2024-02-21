ALTER TABLE customers
    ADD COLUMN receipt_email VARCHAR(255) UNIQUE;

ALTER TABLE organizers
    ADD COLUMN date_range_tax_code VARCHAR(20);
ALTER TABLE organizers
    ADD COLUMN issued_by_tax_code VARCHAR(50);
ALTER TABLE organizers
    ADD COLUMN company_name VARCHAR(100) UNIQUE;
ALTER TABLE organizers
    ADD COLUMN company_email VARCHAR(255) UNIQUE;
ALTER TABLE organizers
    ADD COLUMN company_phone VARCHAR(20) UNIQUE;

ALTER TABLE users
    ADD COLUMN validation_code VARCHAR(255);

ALTER TABLE users
    ADD COLUMN validation_code_expiration VARCHAR(50);