insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Billy',
       '601-332-3596',
       'bdavidovici0@gnu.org',
       '3519-2935-6282',
       '6314-4781-5998',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Faber',
       '591-581-7312',
       'fhanscomb1@newsvine.com',
       '7839-7115-1000',
       '3771-8151-3148',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Rene',
       '236-977-2534',
       'rtemperley2@amazon.co.uk',
       '6137-1586-1683',
       '5501-4285-2975',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Jacquenette',
       '373-605-8209',
       'jspiby3@stanford.edu',
       '3718-0816-5930',
       '4339-3119-2212',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Benjamen',
       '416-287-5909',
       'blightwing4@myspace.com',
       '7485-7970-3228',
       '4208-9395-5526',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Ernestine',
       '720-481-7136',
       'edalessio5@instagram.com',
       '9317-4573-4567',
       '0374-2408-2649',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Monah',
       '568-578-6031',
       'mphillis6@accuweather.com',
       '9340-4466-9632',
       '3297-9241-1453',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Blaire',
       '136-325-6190',
       'bgino7@unc.edu',
       '1766-2438-9093',
       '3772-2000-3014',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Cecelia',
       '268-384-5289',
       'cburgen8@nbcnews.com',
       '3492-9114-7832',
       '4121-8021-0800',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Bail',
       '352-288-6972',
       'bkliment9@dion.ne.jp',
       '7114-6741-2437',
       '0441-2744-7016',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Tanitansy',
       '313-375-1704',
       'trichensa@rediff.com',
       '4678-8576-6442',
       '9144-0116-3413',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Ted',
       '895-980-6531',
       'tpointinb@walmart.com',
       '5478-7148-2406',
       '2710-6977-9362',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Samson',
       '103-101-2055',
       'spreec@purevolume.com',
       '7179-2929-6738',
       '4698-3253-3898',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Abraham',
       '751-227-7152',
       'acrebottd@quantcast.com',
       '1883-2365-6857',
       '2860-2169-8095',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Eleanore',
       '695-975-3771',
       'esleightholmee@over-blog.com',
       '7164-4175-6123',
       '9538-6479-6904',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Kaitlyn',
       '593-422-1263',
       'kpydcockf@mac.com',
       '7127-4355-2114',
       '8182-6566-4657',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Kevan',
       '472-889-9341',
       'kverbruggheng@jugem.jp',
       '0127-0375-6908',
       '4091-1614-6094',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Elva',
       '911-378-4580',
       'esandsh@wikimedia.org',
       '9538-1611-7638',
       '7966-1873-4032',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Wendy',
       '236-404-8541',
       'wdunsirei@livejournal.com',
       '9383-2509-0145',
       '0931-5776-8722',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;
insert into organizers (id, `name`, phone_number, email, id_card, tax_code, organizer_type_id, user_id, is_deleted)
SELECT UUID_TO_BIN(UUID()),
       'Coral',
       '391-340-1129',
       'ckinghj@cbsnews.com',
       '7693-0744-9321',
       '5870-4442-8898',
       (select id from organizer_types ORDER BY RAND() LIMIT 1),
       u.id,
       false
FROM users u
WHERE NOT EXISTS(SELECT 1
                 FROM organizers o
                 WHERE o.user_id = u.id)
LIMIT 1;

