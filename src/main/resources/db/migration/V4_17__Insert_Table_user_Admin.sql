INSERT INTO users(id, avatar, username, password, email)
values (UUID_TO_BIN(UUID()), 'avatar', 'admin', '$2a$12$v3TGEcuTLMRtZwYPlEluvecRq58yf/9jECtbQF1NAmqwSuqWA2qqC
', 'admin@gmail.com');

INSERT INTO user_roles(user_id, role_id)
VALUES ((select id from users where username = 'admin'), (select id
                                                          from roles
                                                          where name = 'ADMIN'));




