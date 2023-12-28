# CREATE TABLE contract_details
# (
#     id           BINARY(16) NOT NULL,
#     contract_id  BINARY(16) NOT NULL,
#     ticket_id    BINARY(16) NULL,
#     quantity     INT        NULL,
#     ticket_price DOUBLE     NULL,
#     CONSTRAINT pk_contract_details PRIMARY KEY (id)
# );
#
# CREATE TABLE contracts
# (
#     id         BINARY(16)   NOT NULL,
#     date       VARCHAR(255) NULL,
#     amount     DOUBLE       NULL,
#     status     VARCHAR(255) NULL,
#     created_at datetime     NULL,
#     updated_at BINARY(16)   NULL,
#     CONSTRAINT pk_contracts PRIMARY KEY (id)
# );
#
# CREATE TABLE event
# (
#     id            BIGINT AUTO_INCREMENT NOT NULL,
#     name          VARCHAR(255)          NULL,
#     address       VARCHAR(255)          NULL,
#     event_type_id BIGINT                NULL,
#     CONSTRAINT pk_event PRIMARY KEY (id)
# );
#
# CREATE TABLE event_time
# (
#     event_id BIGINT NOT NULL,
#     time_id  BIGINT NOT NULL,
#     CONSTRAINT pk_event_time PRIMARY KEY (event_id, time_id)
# );
#
# CREATE TABLE event_type
# (
#     id   BIGINT AUTO_INCREMENT NOT NULL,
#     name VARCHAR(255)          NULL,
#     CONSTRAINT pk_event_type PRIMARY KEY (id)
# );
#
# CREATE TABLE ticket
# (
#     id             BINARY(16)   NOT NULL,
#     ticket_code    VARCHAR(255) NULL,
#     seat           VARCHAR(255) NULL,
#     time           VARCHAR(255) NULL,
#     location       VARCHAR(255) NULL,
#     promotion      VARCHAR(255) NULL,
#     barcode        VARCHAR(255) NULL,
#     is_delete      VARCHAR(255) NULL,
#     ticket_type_id BINARY(16)   NOT NULL,
#     CONSTRAINT pk_ticket PRIMARY KEY (id)
# );
#
# CREATE TABLE ticket_type
# (
#     id    BINARY(16)   NOT NULL,
#     name  VARCHAR(255) NULL,
#     price DOUBLE       NULL,
#     CONSTRAINT pk_tickettype PRIMARY KEY (id)
# );
#
# CREATE TABLE time
# (
#     id   BIGINT AUTO_INCREMENT NOT NULL,
#     time datetime              NULL,
#     CONSTRAINT pk_time PRIMARY KEY (id)
# );
#
# ALTER TABLE contract_details
#     ADD CONSTRAINT FK_CONTRACT_DETAILS_ON_CONTRACT FOREIGN KEY (contract_id) REFERENCES contracts (id);
#
# ALTER TABLE event
#     ADD CONSTRAINT FK_EVENT_ON_EVENT_TYPE FOREIGN KEY (event_type_id) REFERENCES event_type (id);
#
# ALTER TABLE ticket
#     ADD CONSTRAINT FK_TICKET_ON_TICKETTYPE FOREIGN KEY (ticket_type_id) REFERENCES ticket_type (id);
#
# ALTER TABLE event_time
#     ADD CONSTRAINT fk_evetim_on_event FOREIGN KEY (event_id) REFERENCES event (id);
#
# ALTER TABLE event_time
#     ADD CONSTRAINT fk_evetim_on_time FOREIGN KEY (time_id) REFERENCES time (id);