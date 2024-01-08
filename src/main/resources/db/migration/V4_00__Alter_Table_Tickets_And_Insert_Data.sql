

-- Add index on the event_times table


-- Recreate foreign key constraint for event_id and time_id referencing event_times


-- Recreate the trigger to validate event_id and time_id values
DROP TRIGGER IF EXISTS tickets_event_times_fk;
DELIMITER //

CREATE TRIGGER tickets_event_times_fk
    BEFORE INSERT
    ON tickets
    FOR EACH ROW
BEGIN
    DECLARE event_id_val BINARY(16);
    DECLARE time_id_val BINARY(16);

    -- Retrieve the event_id and time_id values from event_times table
    SELECT event_id, time_id
    INTO event_id_val, time_id_val
    FROM event_times
    WHERE event_id = NEW.event_id
      AND time_id = NEW.time_id;

    -- Check if the event_id and time_id values exist in the event_times table
    IF event_id_val IS NULL OR time_id_val IS NULL THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Invalid event_id or time_id';
    END IF;
END //
DELIMITER ;

TRUNCATE tickets;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '6955-3059-8978', 'T-90', 20, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    et.event_id, et.time_id, 'Success'
FROM
    event_times et
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '1231-2470-3040', 'R-90', 48, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '1671-8452-7443', 'A-22', 4, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '6797-7121-8510', 'M-52', 31, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '7108-6094-3171', 'K-63', 43, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '4045-0249-7654', 'P-18', 41, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '0629-3462-8263', 'O-66', 33, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '4364-5154-0128', 'F-37', 40, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '4653-8985-9462', 'A-33', 1, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '3113-4192-5145', 'W-69', 50, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '7710-2838-6380', 'J-78', 1, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '0573-9229-1177', 'G-96', 17, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '5813-5631-2647', 'X-93', 5, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '2502-1334-0858', 'C-90', 48, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '0467-5822-6212', 'D-81', 1, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '9524-1018-4424', 'D-49', 33, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '8690-9637-2074', 'C-66', 39, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '9737-1504-8952', 'M-16', 38, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '2500-4990-1690', 'Q-53', 9, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '3847-3930-4513', 'L-02', 47, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '4511-5846-8492', 'W-31', 33, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '3487-7105-1064', 'Z-48', 33, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '4478-2208-2878', 'L-46', 44, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '2777-5205-3364', 'S-56', 45, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '4297-4502-2375', 'O-54', 10, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '1195-1659-9800', 'S-89', 42, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '6814-7834-5062', 'P-01', 35, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '8157-9442-7395', 'Q-46', 30, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '5996-8470-8293', 'Y-68', 1, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '1135-4860-7630', 'P-23', 45, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '3763-7549-2839', 'L-75', 49, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '1391-2760-1815', 'S-07', 3, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '8355-4742-8717', 'V-06', 47, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '9998-8775-6454', 'T-24', 32, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '0971-3094-9186', 'D-67', 42, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '4041-7138-6536', 'F-37', 39, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '8993-7455-5067', 'H-92', 1, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '2634-2085-2007', 'S-59', 7, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '4222-9923-6962', 'O-03', 48, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '5972-9218-7172', 'X-50', 16, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '6146-3991-6019', 'V-66', 33, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '7880-7182-3456', 'N-21', 4, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '8502-2869-8361', 'I-35', 14, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '8357-9876-0458', 'U-59', 11, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '0769-7215-4142', 'G-80', 48, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '8074-6113-6980', 'A-72', 41, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '6911-4867-1764', 'C-34', 27, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Reject'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '6244-5597-4968', 'E-19', 5, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Pending'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;

INSERT INTO tickets (
    id, ticket_code, seat, promotion, is_deleted, ticket_type_id,
    booking_detail_id, event_id, time_id, status
)
SELECT
    UUID_TO_BIN(UUID()), '1910-6804-1864', 'F-82', 20, false,
    (SELECT id FROM ticket_types ORDER BY RAND() LIMIT 1),
    (SELECT id FROM booking_details ORDER BY RAND() LIMIT 1),
    event_id, time_id, 'Success'
FROM
    event_times
ORDER BY
    RAND()
LIMIT 1;
