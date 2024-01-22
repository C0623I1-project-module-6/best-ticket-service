DELETE FROM ticket_types;

INSERT INTO ticket_types (id, name, is_deleted, price) values(UUID_TO_BIN(UUID()),'VIP',false,270000);
INSERT INTO ticket_types (id, name, is_deleted, price) values(UUID_TO_BIN(UUID()),'THƯỜNG',false,220000);
INSERT INTO ticket_types (id, name, is_deleted, price) values(UUID_TO_BIN(UUID()),'LẦU',false,170000);