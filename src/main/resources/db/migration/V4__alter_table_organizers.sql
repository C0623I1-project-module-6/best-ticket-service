ALTER TABLE organizers
    CHANGE COLUMN full_name enterprise_name VARCHAR(50),
    CHANGE COLUMN id_card tax_code VARCHAR(50);

