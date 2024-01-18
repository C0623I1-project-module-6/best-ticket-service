INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email,
                        organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Tedie Pero',
       '36987-1091',
       '3-400 - Precast Concrete',
       '2023-01-09',
       'Apt 693',
       '3927180971',
       'tpero0@bigcartel.com',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;

INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Albert Christmas',
       '0409-7334',
       '13-280 - Hazardous Material Remediation',
       '2023-06-23',
       'PO Box 78811',
       '4652257791',
       'achristmas1@sphinn.com',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Ring Bickerton',
       '60429-281',
       '2-932 - PLants and Bulbs',
       '2023-10-30',
       '3rd Floor',
       '6433244076',
       'rbickerton2@about.com',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Jim Lindup',
       '67172-012',
       '1-010 - Project Manager',
       '2023-02-21',
       'Apt 488',
       '4808347717',
       'jlindup3@hao123.com',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Luisa Mussen',
       '63629-1369',
       '11-850 - Navigation Equipment',
       '2023-05-09',
       'PO Box 8694',
       '7219841213',
       'lmussen4@icio.us',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Smitty Mashal',
       '0409-4166',
       '17-010 - Contingency',
       '2023-05-15',
       '15th Floor',
       '1660260574',
       'smashal5@com.com',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Natassia Fibbitts',
       '68788-9116',
       '1-518 - Temporary Water',
       '2023-06-25',
       'PO Box 78247',
       '6934746147',
       'nfibbitts6@jiathis.com',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Kele Brereton',
       '65044-1301',
       '7-800 - Fire and Smoke Protection',
       '2023-04-11',
       '16th Floor',
       '5379644023',
       'kbrereton7@people.com.cn',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Jemie Netley',
       '53441-630',
       '2-621 - Foundatation Drainage Piping',
       '2023-09-28',
       'Suite 25',
       '4168154548',
       'jnetley8@uol.com.br',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
INSERT INTO organizers (id, name, tax_code, id_card, date_range, issued_by, phone_number, email, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Fredrick Laydel',
       '55154-9525',
       '5-900 - Metal Restoration and Cleaning',
       '2023-12-31',
       'PO Box 97501',
       '4355033546',
       'flaydel9@princeton.edu',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;

insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Mydeo',
       '5817318180',
       'ctorbet0@dagondesign.com',
       '43772-0037',
       '2023-09-20',
       'Room 1305',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Podcat',
       '7823653052',
       'vluddy1@army.mil',
       '37808-556',
       '2023-04-08',
       'PO Box 19699',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Edgetag',
       '9369117288',
       'gurling2@geocities.jp',
       '0311-0585',
       '2023-03-24',
       'Apt 1148',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Ailane',
       '0071732160',
       'skennermann3@storify.com',
       '54868-3046',
       '2023-06-26',
       'PO Box 61137',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Edgepulse',
       '3761591578',
       'krheubottom4@yelp.com',
       '58414-8726',
       '2023-03-05',
       'Room 1872',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Yacero',
       '2u.id202548',
       'ysharer5@webmd.com',
       '62257-607',
       '2023-03-13',
       'Apt 1656',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Zoonoodle',
       '3268121322',
       'fdraaisma6@google.nl',
       '36987-2451',
       '2023-04-15',
       'Room 1156',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Twimm',
       '9343285922',
       'eload7@taobao.com',
       '0054-0110',
       '2023-10-10',
       'Room 798',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Nlounge',
       '2493931815',
       'bruprich8@webmd.com',
       '43269-890',
       '2023-05-25',
       '16th Floor',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Twitterbridge',
       '8578237471',
       'jayre9@clickbank.net',
       '60986-1003',
       '2023-11-23',
       'Apt 1539',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Skidoo',
       '2842100832',
       'eredshawa@chronoengine.com',
       '45861-014',
       '2023-03-09',
       '7th Floor',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Jayo',
       '1360496572',
       'adhoogeb@globo.com',
       '52125-271',
       '2023-03-16',
       'Suite 76',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Zoomdog',
       '9253863056',
       'kantonellinic@ehow.com',
       '41520-374',
       '2023-01-23',
       'Suite 73',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Digitube',
       '5995408151',
       'asoldand@techcrunch.com',
       '50242-060',
       '2023-09-05',
       'Apt 79',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
insert into organizers (id, name, phone_number, email, business_code, date_range, issued_by, organizer_type_id,
                        user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Mybuzz',
       '9631635678',
       'wruddome@npr.org',
       '54868-5736',
       '2024-03-01',
       '9th Floor',
       ot.id,
       u.id,
       false
FROM users u
         JOIN
     organizer_types ot ON ot.name IN ('Cá nhân', 'Doanh nghiệp-Nhà tổ chức')
         LEFT JOIN
     organizers o ON o.user_id = u.id
WHERE o.user_id IS NULL
ORDER BY RAND()
LIMIT 1;
