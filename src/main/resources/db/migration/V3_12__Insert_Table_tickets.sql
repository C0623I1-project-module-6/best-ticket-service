insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6955-3059-8978', 'T-90', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1231-2470-3040', 'R-90', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1671-8452-7443', 'A-22', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6797-7121-8510', 'M-52', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1113-8047-1872', 'F-78', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7108-6094-3171', 'K-63', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4045-0249-7654', 'P-18', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0629-3462-8263', 'O-66', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4364-5154-0128', 'F-37', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4653-8985-9462', 'A-33', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3113-4192-5145', 'W-69', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7710-2838-6380', 'J-78', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0573-9229-1177', 'G-96', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5813-5631-2647', 'X-93', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2502-1334-0858', 'C-90', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0467-5822-6212', 'D-81', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9524-1018-4424', 'D-49', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8690-9637-2074', 'C-66', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9737-1504-8952', 'M-16', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2500-4990-1690', 'Q-53', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3847-3930-4513', 'L-02', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4511-5846-8492', 'W-31', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3487-7105-1064', 'Z-48', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4478-2208-2878', 'L-46', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2777-5205-3364', 'S-56', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4297-4502-2375', 'O-54', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1195-1659-9800', 'S-89', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6814-7834-5062', 'P-01', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8157-9442-7395', 'Q-46', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5996-8470-8293', 'Y-68', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1135-4860-7630', 'P-23', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3763-7549-2839', 'L-75', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1391-2760-1815', 'S-07', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8355-4742-8717', 'V-06', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9998-8775-6454', 'T-24', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0971-3094-9186', 'D-67', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4041-7138-6536', 'F-37', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8993-7455-5067', 'H-92', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2634-2085-2007', 'S-59', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4222-9923-6962', 'O-03', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5972-9218-7172', 'X-50', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6146-3991-6019', 'V-66', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7880-7182-3456', 'N-21', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8502-2869-8361', 'I-35', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8357-9876-0458', 'U-59', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0769-7215-4142', 'G-80', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8074-6113-6980', 'A-72', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6911-4867-1764', 'C-34', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6244-5597-4968', 'E-19', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1910-6804-1864', 'F-82', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3216-6227-0595', 'N-45', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1228-1753-5982', 'T-75', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4647-4445-4395', 'A-76', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3567-6318-5530', 'W-44', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9728-2361-6446', 'J-87', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8815-5884-1136', 'C-81', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9376-7109-0859', 'G-80', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8725-7627-2811', 'H-84', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2709-9560-4597', 'H-46', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8823-4248-0035', 'B-65', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9490-1590-5611', 'H-72', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3926-9872-7650', 'L-05', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8305-1814-9229', 'X-28', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8043-4691-9520', 'F-75', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1828-3605-2916', 'L-06', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2910-5576-2214', 'L-97', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9767-6825-0997', 'N-25', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5786-1188-4782', 'E-60', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4908-5682-1285', 'D-17', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3479-7413-2843', 'U-36', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1480-3366-4384', 'Y-87', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6413-7773-6047', 'L-22', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9552-1899-0615', 'A-61', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8476-9825-6256', 'H-81', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4552-7939-0764', 'X-92', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2186-2583-4972', 'E-07', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7718-6710-4704', 'F-78', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3517-5882-2177', 'M-92', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0762-7368-3745', 'R-42', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8328-4090-8870', 'I-41', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8746-2680-5240', 'V-54', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1108-0106-3279', 'E-70', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5921-7764-2804', 'G-33', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0118-3367-5834', 'B-02', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3657-4299-0696', 'I-65', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6949-6918-9218', 'M-88', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9075-4601-2609', 'N-77', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3965-8432-3465', 'L-49', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5270-6108-8058', 'K-33', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5709-4900-6463', 'D-13', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7265-3537-7301', 'K-67', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0047-3990-3988', 'Q-77', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7417-7818-4083', 'D-14', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0737-4719-7318', 'W-59', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2015-6812-1897', 'A-22', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2646-4978-1924', 'T-85', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8610-4672-8091', 'D-02', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6660-1023-7399', 'Z-58', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9095-9259-9804', 'U-93', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0948-7926-1870', 'B-00', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4967-6418-6713', 'V-52', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6179-8071-9689', 'Z-59', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4027-5402-3630', 'N-90', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2822-8566-3114', 'V-52', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0003-8515-3207', 'R-74', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4688-8467-4491', 'F-42', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3712-3542-0757', 'B-35', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5888-6373-4587', 'C-01', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5169-2618-8346', 'K-42', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8133-3786-6092', 'J-78', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2919-4165-6700', 'Z-78', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8533-1002-5588', 'Y-69', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9120-8746-7534', 'X-76', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7577-6411-7174', 'Y-20', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4008-5739-3164', 'W-32', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8727-5901-3129', 'H-84', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2882-7461-8788', 'F-17', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0777-1847-3698', 'H-99', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0065-2412-1833', 'L-25', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7466-9481-6332', 'E-63', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3800-8605-1291', 'O-63', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5849-9244-7101', 'Q-12', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8250-4664-9814', 'U-74', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2260-4421-7549', 'T-30', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7321-3384-3476', 'Y-43', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6159-2019-9542', 'D-64', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3820-4219-1210', 'M-03', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6227-3791-9608', 'U-07', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3879-5078-9515', 'W-41', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7733-0973-2226', 'L-02', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2392-2952-7394', 'M-97', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2708-7653-0355', 'V-53', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1348-5117-0042', 'K-24', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6160-5687-0913', 'W-79', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2557-3546-1105', 'H-19', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7669-7992-5345', 'E-25', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9775-7444-8098', 'I-66', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2579-9296-2810', 'F-19', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0462-6618-3286', 'G-36', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3018-8200-3859', 'N-60', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8145-9014-6251', 'H-98', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1883-0085-8518', 'J-00', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3329-6070-3759', 'O-25', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8335-7691-7015', 'J-79', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9367-3637-2008', 'Z-19', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5216-0503-9311', 'W-25', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0430-8611-7270', 'Y-65', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9575-4910-9691', 'I-48', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1689-4741-0307', 'I-95', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9626-2858-1507', 'W-03', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2221-1084-3213', 'B-72', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5983-2783-0836', 'H-42', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8793-7856-3322', 'X-02', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9198-6718-7860', 'S-94', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9914-4576-8775', 'G-60', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0511-7955-8564', 'L-62', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7313-3879-0061', 'S-82', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1433-8072-6162', 'V-01', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4353-8287-5722', 'G-46', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1248-2311-2783', 'R-92', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6405-4225-9175', 'Y-04', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5389-6406-1014', 'U-44', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6816-1631-1476', 'N-19', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2396-9681-4598', 'I-59', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9677-7496-5459', 'S-03', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1731-1108-0695', 'J-56', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4056-0222-7172', 'X-99', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5126-0048-8435', 'T-60', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2572-7221-3589', 'U-53', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4724-3364-3903', 'V-49', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8025-3566-5586', 'S-10', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7032-6817-5301', 'Y-68', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6980-6546-0785', 'U-49', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1123-0352-7768', 'E-35', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4830-4117-1766', 'N-11', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9126-4173-5093', 'B-56', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1442-6257-8045', 'K-37', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0389-4336-3352', 'F-07', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4182-8526-6496', 'W-37', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2292-6445-4621', 'U-71', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9273-1483-1520', 'L-74', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2164-3471-8557', 'G-47', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4426-4383-5918', 'I-23', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6919-5561-7045', 'U-45', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4552-8032-1953', 'F-11', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6524-5218-7331', 'J-71', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8006-1888-6406', 'Q-12', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7327-6801-6826', 'P-51', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5431-2338-4664', 'A-97', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7345-9571-7609', 'U-51', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5639-3501-6490', 'H-91', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2256-9686-7192', 'G-04', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5211-0164-9202', 'T-39', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3799-0546-5930', 'B-21', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5739-3130-5012', 'O-13', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1242-4612-9238', 'H-26', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0873-8133-4696', 'K-72', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5752-8014-1005', 'S-01', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3319-8090-9173', 'C-77', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2286-1914-7860', 'Y-97', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4693-3410-5779', 'K-66', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7690-0026-0429', 'V-69', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3903-2646-1347', 'W-48', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5320-7655-2625', 'P-82', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1269-3276-3425', 'W-84', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2391-0305-1868', 'X-10', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1036-5631-3323', 'H-02', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1935-6269-8232', 'P-51', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8472-0997-0349', 'J-67', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5019-2165-9038', 'L-02', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9514-1040-5937', 'F-86', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6167-2542-6590', 'D-46', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0445-9549-9364', 'J-51', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2360-4538-3438', 'I-68', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0148-5550-9160', 'O-51', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2903-0070-4861', 'P-56', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9152-1700-4567', 'K-61', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0980-3461-2930', 'D-57', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2248-3952-1157', 'K-57', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4569-1940-8774', 'E-22', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8905-8272-9077', 'J-37', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8307-8943-9777', 'I-94', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3227-3833-5152', 'U-56', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6226-2637-9813', 'I-18', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9588-7180-6254', 'N-49', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1772-0250-6785', 'Q-91', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1942-1029-1911', 'Z-44', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0394-6951-4963', 'G-64', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1027-3577-9210', 'P-16', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1833-1476-2699', 'Y-22', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5863-2164-8056', 'C-02', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8400-1399-4881', 'O-95', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9791-0186-2983', 'R-31', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0553-0424-1954', 'V-85', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2099-8139-4719', 'A-03', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8703-6125-1844', 'R-61', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5853-0712-9930', 'Q-58', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8046-4633-7006', 'D-44', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6802-8068-1125', 'X-00', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7979-5600-1005', 'O-91', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8928-6458-4794', 'C-94', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1534-1352-6775', 'J-05', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1848-4504-9146', 'C-98', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3557-6370-8399', 'V-14', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1758-1671-0905', 'A-60', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1116-9110-7513', 'Q-73', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3546-1355-2683', 'I-25', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2037-4574-6633', 'I-42', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9683-5367-7937', 'Y-47', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1823-7546-2601', 'J-98', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7372-9139-2001', 'M-11', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8288-6576-4414', 'A-10', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9200-7060-9771', 'C-75', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5331-4869-7793', 'A-10', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4478-6079-8109', 'F-55', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3839-8189-3886', 'P-31', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8112-9670-1805', 'G-01', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4555-9174-5338', 'J-29', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4072-4497-9733', 'C-38', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6940-7914-0005', 'L-84', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7977-0777-5788', 'S-92', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9644-5610-7658', 'K-03', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3278-1526-4462', 'G-81', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5414-9108-3460', 'L-50', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7211-8737-6839', 'F-24', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4896-1494-8173', 'W-00', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3822-9472-8184', 'C-40', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0687-2814-5638', 'M-86', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5858-4112-8681', 'L-06', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7558-5758-7878', 'R-93', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6770-4111-7839', 'P-11', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7933-5525-5884', 'X-33', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0103-4731-3236', 'Z-26', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3907-9085-5545', 'X-99', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2864-9313-6391', 'H-85', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1234-8123-2267', 'L-36', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0698-7771-9581', 'E-92', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9017-4757-4484', 'O-87', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0675-1786-3158', 'C-02', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3736-9122-3824', 'Z-58', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1888-5114-6553', 'A-22', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8923-7574-9533', 'G-10', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0620-2947-3824', 'J-28', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5054-9044-8449', 'V-84', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3260-1559-6693', 'G-48', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5321-1510-0795', 'I-39', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6332-7310-4086', 'L-33', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3007-3298-2764', 'Q-64', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9628-9175-7929', 'T-24', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7330-7527-5248', 'T-61', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8233-8938-0881', 'B-14', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4411-1408-1846', 'N-52', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6241-4738-2279', 'T-71', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7164-5979-6988', 'C-92', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5805-6162-8917', 'D-12', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7934-3312-9871', 'J-72', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1399-7903-0838', 'K-82', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1337-4437-5826', 'F-10', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5295-5458-6991', 'K-49', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6896-7240-5553', 'G-06', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4280-8957-3181', 'B-79', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0684-8532-7603', 'J-79', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2181-8955-0105', 'Q-53', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4525-2637-0528', 'R-47', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3348-9166-9449', 'Y-18', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7047-9973-0376', 'W-48', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7476-6914-2646', 'Q-79', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2947-7470-2757', 'O-82', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5292-2750-9896', 'U-19', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4881-8207-1970', 'T-41', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7374-4266-7286', 'H-50', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9524-1178-7814', 'Z-79', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8159-5885-1104', 'Z-70', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1888-1462-8170', 'D-68', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5809-7435-8822', 'F-94', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1401-4210-5022', 'O-71', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1493-4961-7737', 'F-59', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8737-8399-3463', 'M-65', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3453-4567-6324', 'B-67', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9003-4113-6219', 'U-95', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5583-3575-9641', 'Y-27', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7317-3100-0161', 'O-89', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3883-3941-7047', 'C-10', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5897-8970-6159', 'P-47', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0256-3003-0869', 'D-67', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0300-6543-5530', 'W-75', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7627-7071-1379', 'M-27', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1955-4225-5412', 'W-02', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2735-9839-7214', 'E-74', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3825-9653-0418', 'C-16', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6502-8114-5990', 'V-06', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7585-1096-4764', 'A-02', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4692-1764-8033', 'A-94', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4184-7251-3687', 'K-29', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1849-8268-5985', 'Y-77', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1450-9455-8950', 'G-90', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6653-8888-8019', 'A-79', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2569-4972-2701', 'I-55', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3668-2981-5658', 'N-08', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2281-8085-3936', 'E-69', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5499-5382-7659', 'T-62', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8447-1764-7749', 'H-66', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2032-9479-4668', 'Y-98', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5790-9537-8956', 'J-72', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2987-8850-2647', 'S-39', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6754-5468-8797', 'B-50', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1198-9625-6422', 'H-70', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8306-3774-1681', 'J-47', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3200-0578-0351', 'X-39', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6158-3794-4298', 'F-27', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8086-8666-8948', 'N-03', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1503-2181-7921', 'E-79', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9529-5273-5012', 'X-12', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9672-4286-3112', 'F-20', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0562-0849-9528', 'W-91', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8797-2158-8077', 'D-06', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8714-9425-4387', 'H-08', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3660-7290-3744', 'D-02', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8676-4564-3759', 'Y-06', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4889-0625-9403', 'M-65', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5631-2445-7796', 'J-67', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3628-2575-3342', 'Q-95', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9865-5557-5971', 'C-02', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4454-9830-4358', 'H-30', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8335-8168-3503', 'K-60', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9198-6049-7694', 'S-29', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9171-0454-7261', 'Z-61', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6874-5616-5416', 'R-87', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1335-0386-1652', 'S-92', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0768-7673-1861', 'P-63', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3861-3794-3341', 'G-43', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1772-4919-5788', 'T-64', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1271-9668-4257', 'N-62', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2936-7954-6474', 'Z-53', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5246-2998-5782', 'F-91', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2591-5955-3598', 'A-30', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9005-0510-6960', 'P-83', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9214-2304-5700', 'C-66', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9005-9000-7308', 'P-90', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4911-9699-3611', 'W-15', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8834-3971-9829', 'U-06', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7427-0169-0866', 'V-45', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7201-2756-0037', 'E-74', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9784-3282-7079', 'Q-25', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3250-1668-5938', 'M-62', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7902-6565-8834', 'J-57', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7299-1577-3066', 'Z-67', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3356-6351-4284', 'L-93', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1401-0673-0581', 'I-09', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6721-9824-8084', 'S-66', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3078-9848-7196', 'R-85', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2302-9803-7686', 'R-10', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5155-5644-2207', 'R-72', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7655-9088-3915', 'A-39', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1880-0917-6268', 'H-71', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4385-2171-8118', 'K-26', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9334-0671-3806', 'F-94', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1733-4210-1129', 'N-18', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5779-0718-5405', 'M-42', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9559-7167-6445', 'P-56', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0654-1900-1025', 'M-43', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4039-2931-0377', 'Z-02', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8316-8434-2876', 'E-61', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5705-5235-8529', 'G-37', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0076-3072-4819', 'J-17', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0623-4276-1469', 'M-30', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2414-2651-6286', 'U-64', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2960-0386-9130', 'S-18', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3783-7171-1914', 'P-10', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3328-0162-9576', 'C-37', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5166-9154-8382', 'L-99', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5497-5635-8701', 'E-54', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1551-7060-4688', 'I-00', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9374-6117-7605', 'D-84', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1515-3622-2649', 'X-35', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3279-5019-0250', 'R-04', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9450-8187-3513', 'L-50', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9732-3805-3645', 'U-08', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9531-5665-8871', 'D-95', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8844-8027-8544', 'I-25', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9326-9848-2875', 'S-28', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2627-8570-2890', 'I-72', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8657-1047-0755', 'X-26', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7651-7219-7856', 'N-12', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9779-8416-2715', 'H-10', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9774-8939-8914', 'M-32', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0527-9241-8454', 'A-67', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0022-2329-4968', 'A-15', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3271-7312-8451', 'T-96', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3011-1076-1647', 'C-26', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7858-7801-2403', 'V-23', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1463-2757-3436', 'O-98', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8612-0073-1097', 'M-98', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4589-2924-6656', 'W-49', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0561-4207-7851', 'G-01', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7435-5197-9473', 'X-45', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5274-6939-2180', 'W-44', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8440-2721-3025', 'N-21', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4680-3521-7783', 'B-89', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6749-5225-9702', 'H-93', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9298-3561-6539', 'T-85', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6219-7409-3815', 'Y-21', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6732-3219-1755', 'M-61', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5844-4386-5390', 'R-97', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6280-0308-5937', 'B-10', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3188-4611-4534', 'T-20', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9950-6352-1128', 'W-99', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7410-2122-0176', 'B-81', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1019-9059-5055', 'Q-02', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2567-3550-0368', 'G-47', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0416-7270-2916', 'S-44', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3484-7994-0566', 'W-10', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9634-0373-1209', 'X-44', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4868-6424-3398', 'Z-84', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4962-9042-4437', 'P-33', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1831-5435-3044', 'O-24', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2502-3082-0023', 'O-48', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6433-3800-4533', 'G-87', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6846-6731-7385', 'F-97', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9037-5186-4950', 'D-47', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6165-5731-7814', 'L-55', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1476-8677-1864', 'N-56', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4002-8911-4177', 'A-81', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3832-4827-9074', 'R-24', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6120-4621-3652', 'L-48', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4716-6795-8834', 'K-40', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3133-3424-4858', 'B-34', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8317-0736-9904', 'I-84', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9870-6534-0874', 'Z-75', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8602-0909-5701', 'V-58', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3526-7707-0378', 'B-07', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5154-3841-8055', 'K-38', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9333-0393-6883', 'Y-96', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9976-4179-3194', 'K-77', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7742-1301-9406', 'F-59', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7334-3924-2556', 'F-77', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8025-3113-5618', 'X-97', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6600-6573-6150', 'U-03', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6476-8567-3638', 'Q-45', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3765-4909-4876', 'O-09', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8789-7886-1307', 'W-34', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2680-1222-1188', 'U-12', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8706-3473-4898', 'S-69', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3821-0318-5421', 'B-01', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7641-5239-3176', 'O-29', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0652-4232-4270', 'U-15', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1042-7179-8235', 'E-73', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7802-2509-7568', 'Z-62', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0256-9878-6768', 'F-08', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3148-5089-7595', 'O-46', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8053-7619-7687', 'Y-80', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6676-0936-9605', 'K-61', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2295-9418-3010', 'I-07', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6095-7774-5319', 'W-63', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7555-8750-9882', 'W-18', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2151-2164-7457', 'O-79', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2134-5014-4146', 'H-62', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8675-4959-6500', 'Z-39', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2729-1671-2382', 'U-41', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2559-2834-0620', 'U-52', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2594-7539-4980', 'N-25', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4925-5079-6454', 'E-57', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6942-8050-5492', 'V-47', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7395-0228-1432', 'Z-88', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1985-4950-6389', 'X-52', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5483-0981-8335', 'B-75', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6104-4047-5968', 'S-33', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3740-7111-9296', 'T-63', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1481-0432-2800', 'U-50', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3154-8438-0535', 'W-98', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9767-5830-6476', 'Y-34', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0472-0573-9922', 'Z-50', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5447-3169-2209', 'M-27', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0728-2338-3154', 'G-88', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5481-2580-7001', 'I-99', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5315-4632-0909', 'Z-01', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7274-0055-4391', 'E-43', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3995-0530-7410', 'Y-36', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9406-9471-8690', 'Q-09', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7903-5372-6718', 'G-22', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2349-1474-0172', 'D-41', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7025-3362-3929', 'O-45', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2216-8775-4175', 'V-48', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5837-9344-1848', 'S-75', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3527-6614-6415', 'E-43', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8509-1443-5743', 'X-45', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0098-8597-5985', 'J-54', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1997-7833-0230', 'F-77', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7549-5762-2912', 'X-76', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2548-5347-9800', 'F-67', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8970-4511-8424', 'M-84', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3992-6699-7572', 'R-73', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4060-4199-0595', 'D-70', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7787-7034-6011', 'L-12', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7433-7640-9377', 'B-81', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0379-3236-9307', 'S-08', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8404-8641-7644', 'K-23', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3655-8988-6417', 'W-20', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8992-0674-8870', 'Q-95', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2629-6195-9688', 'K-45', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1472-0324-6379', 'J-63', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7351-1385-0243', 'W-92', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1788-1916-2139', 'Z-33', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5327-0061-5869', 'B-44', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4816-6940-2962', 'X-54', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5475-4979-2503', 'T-02', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1034-7303-0506', 'D-70', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4053-9443-7924', 'N-21', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4908-8911-1817', 'J-77', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9982-1865-3302', 'L-92', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8387-7810-7532', 'U-33', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3800-3623-3956', 'C-63', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5324-2073-2594', 'Y-63', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7607-2284-9640', 'J-11', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5048-0943-1387', 'V-89', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7398-1502-6237', 'W-84', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9605-3811-5101', 'D-33', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0709-4472-2112', 'S-42', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6057-4068-5754', 'G-58', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4336-1330-5398', 'Y-30', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9288-0389-0315', 'S-72', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3260-3448-2927', 'B-24', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0440-8866-5575', 'N-04', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8606-2849-8232', 'C-32', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6576-4613-0499', 'F-67', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0365-6015-2351', 'M-29', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9146-3527-5521', 'X-19', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4891-6290-3441', 'F-23', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9562-4045-0238', 'V-16', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8779-3242-5362', 'S-07', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2594-9207-3112', 'E-87', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6421-8056-6871', 'G-55', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1105-4159-7169', 'R-00', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3006-2956-7472', 'M-44', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6234-6239-1051', 'N-68', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5718-4913-3043', 'A-52', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7652-3815-6430', 'X-28', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2646-5119-7558', 'R-45', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1204-4043-0114', 'O-17', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1298-8395-7967', 'T-63', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9713-7203-8506', 'A-00', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1400-8073-5395', 'D-76', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7096-1300-3233', 'Z-09', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7682-1517-4647', 'V-35', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5001-8587-9129', 'A-59', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4335-7024-2063', 'H-21', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3120-7852-9918', 'E-87', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9875-0030-5295', 'X-41', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1366-2753-2842', 'R-04', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6073-2944-8174', 'L-47', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6241-5426-8813', 'H-03', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4024-7094-0703', 'Y-04', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4013-6336-8811', 'M-07', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3644-0540-9705', 'A-52', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7853-3639-6251', 'A-35', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0117-9967-8549', 'T-43', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9564-3643-8060', 'F-29', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6193-7035-4277', 'V-44', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9664-9524-5040', 'H-17', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3970-0672-4048', 'B-34', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1041-3909-4512', 'B-93', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6798-1878-3702', 'Q-25', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4111-1060-2951', 'N-24', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1709-9710-3423', 'P-54', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3988-3788-6685', 'D-65', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5505-2407-3282', 'I-21', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1610-2891-3293', 'T-13', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1034-5994-5038', 'V-20', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9206-4445-4089', 'Z-37', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0455-9129-5121', 'Z-58', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7327-2827-0123', 'U-22', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1592-9975-1848', 'P-29', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9934-3573-4461', 'S-85', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5265-6583-0952', 'V-69', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4333-9012-1589', 'R-51', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0350-3819-5247', 'G-41', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5439-7925-8895', 'B-30', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0302-4954-8774', 'X-46', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1794-5847-4538', 'W-49', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8342-1718-8203', 'T-49', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3261-2359-5751', 'P-41', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9977-2043-7049', 'H-87', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1816-9599-5846', 'C-37', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8307-2207-5550', 'P-91', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4274-7454-4397', 'I-38', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8811-0191-6568', 'I-91', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9792-2667-7233', 'R-14', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0192-7681-2851', 'Z-61', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7362-5773-5867', 'E-86', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4410-8598-9863', 'G-38', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9299-7580-0855', 'D-11', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6774-2666-0370', 'O-47', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5643-3472-3004', 'W-68', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1055-3864-1730', 'V-56', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3206-7003-0686', 'N-65', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3810-8321-4891', 'F-30', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8424-9372-9316', 'I-86', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5236-6497-0074', 'L-55', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9454-5613-0146', 'Z-69', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5301-5202-5610', 'A-92', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7708-3842-3179', 'X-14', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4428-8805-7283', 'R-89', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0559-7715-6740', 'K-03', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7412-7005-0716', 'N-11', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4674-8941-8093', 'P-70', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4259-5365-2671', 'V-29', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5760-7934-9282', 'C-01', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1767-2962-3425', 'K-13', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8012-7835-9789', 'A-47', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3302-6979-1356', 'E-43', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5284-9967-1097', 'V-82', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4509-2856-0730', 'C-96', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3607-4103-1845', 'V-04', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6155-3001-8218', 'G-12', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8722-5436-1323', 'W-15', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6504-9402-5218', 'K-35', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3896-4299-1157', 'C-77', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2088-0259-7134', 'N-28', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1438-9153-6491', 'O-58', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1346-0153-2465', 'S-40', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0010-0108-8712', 'A-78', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6182-3122-7384', 'M-46', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9272-1774-6746', 'H-18', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4380-4074-0496', 'M-86', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4696-6215-3406', 'K-12', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0470-5722-6113', 'Y-78', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1808-7367-3829', 'U-83', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2023-6798-4080', 'R-78', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1766-4880-5201', 'Y-99', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4772-1827-5479', 'J-47', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4796-0477-8150', 'K-63', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2809-3673-2543', 'H-26', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0400-0382-1918', 'Q-44', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0523-6590-7275', 'N-28', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0569-9177-7485', 'B-37', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3019-2335-0459', 'O-17', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5089-6518-9181', 'V-14', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8723-5150-0555', 'F-26', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1747-5292-3338', 'U-37', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6771-6278-6833', 'Q-30', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2628-5861-4808', 'M-91', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9061-6465-4744', 'J-24', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3923-3307-6885', 'Q-09', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8257-4618-2535', 'X-86', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6020-9891-1590', 'H-71', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2857-3986-7864', 'B-38', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7683-7153-5597', 'B-05', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4640-5221-7006', 'U-01', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8745-8933-5489', 'J-12', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3031-9407-5559', 'I-37', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8477-7154-1044', 'C-90', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5792-4620-2789', 'O-15', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0704-5405-7522', 'B-72', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4159-2311-1033', 'N-01', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9059-6068-7244', 'J-29', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7499-3912-8667', 'S-91', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4795-1309-9328', 'X-92', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8408-2780-8572', 'P-07', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8842-4357-1480', 'H-25', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9109-1299-5218', 'X-14', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7815-8407-6565', 'X-55', 16, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7874-7475-2926', 'R-90', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1731-3806-9630', 'Z-66', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9796-2651-5735', 'Z-27', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4365-2891-6415', 'G-71', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2618-4844-2885', 'B-08', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5474-1217-4198', 'D-57', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5222-7563-4012', 'W-14', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0946-3831-6414', 'B-52', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3071-3623-7732', 'K-28', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2832-4261-4696', 'O-69', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1181-4845-7041', 'W-96', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6160-6493-7103', 'S-41', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2741-4543-2940', 'T-72', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2915-3093-6480', 'J-43', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3752-3775-9437', 'S-76', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8038-7014-1735', 'L-67', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2458-0351-6917', 'Z-38', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9191-4707-8996', 'G-55', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7148-4744-7051', 'G-47', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2545-1316-5910', 'C-72', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2993-4934-0357', 'L-39', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7031-8259-0232', 'L-16', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7223-2019-2725', 'P-31', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1465-9793-0738', 'F-16', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3395-8824-9685', 'P-03', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0061-2746-9485', 'E-83', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3470-5598-1321', 'X-85', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7736-1286-0842', 'E-82', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6285-3607-8045', 'W-94', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9957-1552-7013', 'V-81', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3022-6090-8536', 'F-13', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1443-2016-1263', 'D-71', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3839-0569-7388', 'H-37', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3362-4241-8534', 'M-68', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2333-2136-3328', 'Q-61', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0898-9427-4311', 'G-56', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4681-7083-2165', 'T-98', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9872-2726-9111', 'Q-34', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6512-1738-3753', 'J-69', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9945-8897-0659', 'X-51', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0634-4129-8824', 'E-73', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4148-2600-9920', 'B-65', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7896-9217-7332', 'U-20', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4005-3856-7695', 'X-88', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7845-2828-3641', 'H-21', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0901-0125-7708', 'J-92', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7561-7878-9032', 'P-42', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1680-1246-1566', 'W-52', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1367-2730-6683', 'Q-75', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2729-8231-5110', 'O-95', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2503-7304-5152', 'C-70', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8540-7374-0711', 'Y-39', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1378-5370-0784', 'E-24', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2355-5763-3350', 'D-54', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3974-4790-1554', 'X-15', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9299-9721-3387', 'E-81', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0183-6712-4667', 'W-04', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0868-8707-4806', 'I-13', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4981-3788-6405', 'E-13', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6341-9443-1182', 'A-42', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6786-1124-4965', 'J-86', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8194-9412-5317', 'S-03', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7593-8650-3758', 'E-38', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4529-0692-7672', 'T-42', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2194-2405-5669', 'I-49', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6568-6470-3295', 'D-28', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0799-9103-9007', 'R-09', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1037-9858-6162', 'J-31', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0789-6295-0004', 'E-46', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5562-1716-4390', 'L-39', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2663-8064-3371', 'B-93', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3170-2457-3376', 'B-75', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3852-1913-3626', 'I-64', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7175-0954-6691', 'T-46', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8286-9293-2937', 'M-41', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6495-6409-5296', 'K-45', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0378-8921-8501', 'V-23', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5151-4494-8953', 'K-72', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0502-4366-1345', 'W-49', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9944-1633-9999', 'W-28', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5735-3419-5599', 'O-20', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8758-2294-8828', 'P-28', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2145-9235-0886', 'Q-14', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1282-5507-6777', 'P-56', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8096-3258-9630', 'B-59', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3561-8825-8153', 'J-53', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9280-8204-9138', 'D-24', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8684-4916-7289', 'H-94', 41, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4183-0618-4273', 'V-58', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9880-5270-9194', 'Q-05', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0610-6379-1853', 'A-64', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7962-8555-1907', 'S-58', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5538-2321-7284', 'E-54', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7808-8525-3627', 'O-74', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7797-2330-3598', 'R-55', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7480-4647-7621', 'I-29', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5586-8981-1056', 'U-72', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1955-5386-1790', 'L-77', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5587-2377-0918', 'L-12', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6736-6212-1266', 'D-15', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8730-9124-5601', 'D-09', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2292-1973-2760', 'T-92', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4659-6803-8861', 'M-02', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2320-9837-2108', 'Y-73', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4239-1354-4166', 'Q-93', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0407-0201-8517', 'X-96', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1549-9705-8433', 'N-66', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2517-2123-2549', 'U-51', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3335-8069-2989', 'D-25', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5929-8591-8205', 'Q-78', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9311-7074-9729', 'H-88', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7021-1968-1007', 'G-62', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5535-3315-1247', 'Y-60', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7559-1629-8926', 'L-85', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8998-0196-5656', 'L-99', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4947-9382-0130', 'D-99', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7632-8978-9481', 'Z-58', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0055-1690-5788', 'H-46', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1998-4412-2715', 'C-20', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6217-5185-8856', 'C-80', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8892-2631-0915', 'E-62', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4547-9547-7759', 'Y-36', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2786-3041-0398', 'D-16', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1567-5803-1363', 'G-94', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5350-5752-8564', 'Q-68', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5603-4372-2359', 'H-38', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3344-3237-4055', 'K-75', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8389-3506-7435', 'W-58', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6072-6644-2493', 'D-51', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2827-1389-7532', 'X-93', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7188-2429-4697', 'X-67', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7115-0678-3519', 'O-73', 49, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3786-7415-6786', 'P-69', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7639-0485-8158', 'H-03', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6109-9873-7491', 'Z-61', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3874-6924-6989', 'K-76', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9850-5477-6255', 'I-46', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9779-3867-7722', 'E-44', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8403-6820-5576', 'M-21', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2198-5826-0324', 'Z-73', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1393-4739-1515', 'Z-15', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0943-7490-4100', 'N-86', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6142-5737-9838', 'V-68', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6024-8686-7513', 'C-71', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0664-4596-6183', 'B-87', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7016-9483-0441', 'Q-85', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7069-9056-0910', 'N-60', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5767-6864-9600', 'R-15', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6316-0632-0658', 'V-98', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2126-8809-7814', 'X-52', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2648-0975-0947', 'E-05', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9764-4430-1104', 'G-73', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0902-1767-7823', 'L-97', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0094-9363-6169', 'A-95', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3328-6166-3585', 'U-65', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2473-5245-6151', 'N-41', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9128-8004-0083', 'D-02', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1554-3592-7502', 'F-72', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5740-8498-6764', 'X-83', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9009-8970-5483', 'K-22', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4035-8125-4806', 'B-24', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8241-4168-6299', 'O-25', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3051-0066-3738', 'X-56', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4553-7907-6966', 'A-02', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2797-1317-8760', 'S-25', 36, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1262-4620-6941', 'F-73', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8536-8469-4407', 'A-07', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1351-4692-9366', 'V-02', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6180-6779-1135', 'P-84', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1335-0439-8603', 'S-86', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6856-2892-0125', 'W-01', 21, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2548-0876-4341', 'Z-64', 18, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1757-9500-1744', 'P-33', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9160-4628-2297', 'B-38', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0344-5794-6270', 'X-09', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5079-4451-1310', 'K-45', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7964-0542-1172', 'Z-18', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2313-4867-8206', 'S-33', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4790-9134-6321', 'Q-60', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7837-6618-6316', 'I-72', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8158-4869-0305', 'H-55', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9159-7496-1738', 'F-36', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5847-8654-0336', 'P-19', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4424-2195-2090', 'M-89', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1346-7520-4461', 'P-03', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3302-5552-6099', 'K-97', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6117-6128-0328', 'H-07', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2107-9215-5331', 'W-02', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7859-8875-3482', 'L-16', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6535-0264-6118', 'Y-04', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3134-1413-7521', 'H-85', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2409-8589-7030', 'N-95', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1298-1733-1110', 'N-57', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7927-0992-8278', 'Z-84', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0519-3473-0784', 'X-85', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2117-9264-6246', 'G-80', 15, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8277-5493-0373', 'G-52', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6205-2283-8315', 'G-37', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6603-3119-7009', 'L-74', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2493-8590-4698', 'A-83', 46, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5951-5033-3885', 'A-16', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0500-0825-1512', 'O-90', 39, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7442-7356-3213', 'O-93', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9410-0657-7484', 'I-85', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8821-9941-4120', 'Y-24', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6311-0852-1090', 'V-51', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4099-6171-5406', 'Q-43', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7673-5628-3811', 'O-61', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5832-7562-9223', 'X-31', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4796-4765-1699', 'B-01', 43, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8048-8383-1048', 'C-92', 28, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1147-3868-4276', 'T-93', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6269-2296-4865', 'V-11', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5695-6157-5345', 'O-88', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8299-3689-6364', 'N-35', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3001-4011-8350', 'N-81', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9054-4235-4178', 'H-71', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7346-2135-9402', 'N-50', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9286-3731-7496', 'K-05', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8410-4656-9192', 'U-53', 1, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7759-1850-2715', 'E-12', 9, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4778-5677-1415', 'F-99', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1555-8195-6669', 'S-66', 14, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8728-2865-6668', 'D-87', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7333-9556-6581', 'M-59', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9713-0860-8878', 'E-76', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1696-7806-1344', 'Q-48', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8339-3856-3899', 'M-90', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3810-0310-9086', 'A-56', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0160-5850-3779', 'H-03', 10, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1631-5045-6256', 'N-00', 11, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8957-1332-4018', 'B-20', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2648-7302-2497', 'O-58', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4094-8988-3084', 'G-15', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3537-1509-1194', 'S-27', 31, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7781-2862-1862', 'W-12', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6557-6771-1630', 'R-08', 7, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5504-5108-5877', 'Q-12', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3734-5907-5335', 'T-07', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2340-4681-8344', 'C-00', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6847-7528-0047', 'A-21', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0942-2651-8582', 'C-84', 37, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8065-7569-2307', 'B-40', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1726-3223-1397', 'I-36', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8643-7165-3619', 'W-17', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7325-1754-0141', 'F-13', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4810-6434-9609', 'S-98', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1863-8414-5951', 'O-64', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2064-0863-2802', 'U-76', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4454-8506-7368', 'X-04', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5896-1732-9807', 'G-33', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3466-7798-0886', 'Z-22', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9593-1821-9868', 'C-26', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0686-5983-6278', 'H-90', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7739-0613-0188', 'N-01', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0954-9074-4760', 'O-12', 35, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2154-2348-8462', 'D-80', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0144-8897-9413', 'Q-39', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9034-3417-4751', 'Y-64', 30, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6940-3975-2346', 'L-05', 22, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2737-5784-0949', 'M-46', 13, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2868-5266-7121', 'S-14', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9917-0149-9074', 'V-41', 40, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6756-0192-9009', 'P-37', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2934-1210-9775', 'C-54', 45, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8916-9461-9350', 'O-13', 20, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8767-3908-4498', 'K-79', 50, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9270-2173-5560', 'Z-53', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0813-7392-2957', 'P-34', 25, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9065-0661-8871', 'P-30', 42, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3115-7210-8058', 'I-06', 26, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6037-6572-3803', 'Q-19', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2260-6167-4557', 'B-00', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7718-9782-7563', 'Z-10', 6, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5687-1191-0287', 'E-44', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3574-9654-5732', 'W-30', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6429-4359-3045', 'F-96', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '5059-8763-6240', 'I-99', 47, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9830-8543-0506', 'I-23', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3124-8154-1955', 'L-34', 23, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2459-4079-9482', 'S-71', 24, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3763-9498-8458', 'E-98', 44, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '7994-8680-1543', 'F-56', 29, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0321-0676-8517', 'T-20', 5, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8667-1497-3872', 'L-68', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '9249-8477-9399', 'Q-45', 34, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '3362-1417-1392', 'O-33', 27, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '8379-5274-4373', 'K-12', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Success');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4011-2130-4265', 'S-88', 12, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0200-1531-3839', 'J-34', 19, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4956-4471-7787', 'K-52', 4, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6648-7730-5775', 'E-18', 8, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1385-1783-7316', 'I-72', 32, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '2147-1828-6455', 'V-04', 33, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1800-3349-6009', 'Z-55', 17, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '4092-2941-1933', 'P-06', 3, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'All');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '0498-6247-9038', 'I-31', 38, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '6340-1643-5104', 'H-55', 2, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Pending');
insert into tickets (id, ticket_code, seat, promotion, is_deleted, ticket_type_id, booking_detail_id, event_id, time_id,
                     status)
values (UUID_TO_BIN(UUID()), '1629-0525-9949', 'A-32', 48, false, (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
        (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
        (SELECT event_id FROM event_times ORDER BY RAND() LIMIT 1),
        (SELECT time_id FROM event_times ORDER BY RAND() LIMIT 1), 'Reject');

