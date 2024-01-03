ALTER TABLE ticket_types
DROP COLUMN price;

ALTER TABLE tickets
ADD COLUMN price double,
ADD COLUMN quantity int;
<<<<<<< HEAD

=======
>>>>>>> b482babb1da77147c320b86f882e7d5b2f48a0c3

ALTER TABLE tickets
ADD COLUMN event_id BINARY(16),
    ADD CONSTRAINT event_id FOREIGN KEY (event_id) REFERENCES events(id);

ALTER TABLE tickets
<<<<<<< HEAD
    ADD COLUMN status VARCHAR(45);
=======
    ADD COLUMN status VARCHAR(45);
>>>>>>> b482babb1da77147c320b86f882e7d5b2f48a0c3
