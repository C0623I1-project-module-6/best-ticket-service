insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Dyna Doornbos',
       'Female',
       '0280-4223-9743',
       '2023-12-11',
       '862-497-4784',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Honey McKibbin',
       'Female',
       '9392-5882-8265',
       '2023-04-10',
       '945-497-7641',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id)LIMIT 1;



insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Lydon Midner',
       'Male',
       '7831-2167-6037',
       '2023-03-02',
       '858-497-4594',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Cherianne Vaney',
       'Female',
       '0077-4301-2899',
       '2023-11-20',
       '832-435-0922',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Morris Hedger',
       'Male',
       '0483-6827-7114',
       '2023-12-04',
       '805-621-5974',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Casie Muschette',
       'Female',
       '8355-5411-4273',
       '2023-03-14',
       '634-604-2772',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Ainsley Foan',
       'Female',
       '7651-0623-7390',
       '2023-07-09',
       '637-232-9471',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Amandie Pidon',
       'Female',
       '9128-3239-0066',
       '2023-03-18',
       '740-349-4450',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Jordan Lawlan',
       'Male',
       '8959-4790-8272',
       '2023-05-29',
       '879-107-1007',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Gabbey Tirrell',
       'Female',
       '6369-6272-6869',
       '2023-09-10',
       '518-178-5875',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;

