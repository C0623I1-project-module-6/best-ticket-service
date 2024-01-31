ALTER TABLE organizers
    ADD COLUMN business_code VARCHAR(50) UNIQUE ,
    ADD COLUMN date_range    VARCHAR(20) ,
    ADD COLUMN issued_by     VARCHAR(50);