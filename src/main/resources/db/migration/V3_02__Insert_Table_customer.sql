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



insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Christan McPherson',
       'Female',
       '7236945382',
       '17/03/2005',
       '5571263369',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Jefferson Guillard',
       'Male',
       '9719591056',
       '06/04/2001',
       '9707441356',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Obie Degnen',
       'Male',
       '6690764370',
       '23/08/1983',
       '1377345734',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Leupold Erlam',
       'Male',
       '6369901156',
       '19/03/1989',
       '3108196847',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Edlin Guerra',
       'Male',
       '7283374477',
       '09/08/1974',
       '9837288779',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Garvey Karpeev',
       'Male',
       '2609522991',
       '19/12/2005',
       '4513365218',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Olly Moffett',
       'Male',
       '2896296840',
       '18/07/1997',
       '2812245204',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Reggy Dumphries',
       'Male',
       '3919293959',
       '16/01/1976',
       '7429419208',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Pollyanna Dacks',
       'Female',
       '0673036766',
       '24/01/1980',
       '8616470948',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Irene Deniscke',
       'Female',
       '2040529071',
       '20/02/2005',
       '9191675154',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Dieter Brodeur',
       'Male',
       '9332790280',
       '27/01/1987',
       '7268161980',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Desmond Fullbrook',
       'Genderqueer',
       '5953531192',
       '11/09/1977',
       '8584192107',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Lyda Furzer',
       'Female',
       '9240613412',
       '05/08/1972',
       '2773251881',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Harriot Brewse',
       'Female',
       '3407428618',
       '15/11/1986',
       '2667643119',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;
insert into customers (id, full_name, gender, id_card, date_of_birth, phone_number, is_deleted, user_id)
SELECT UUID_TO_BIN(UUID()),
       'Broderick McLeish',
       'Male',
       '3585224466',
       '05/02/1983',
       '6374372956',
       false,
       u.id
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM customers c
                 WHERE c.user_id = u.id) LIMIT 1;