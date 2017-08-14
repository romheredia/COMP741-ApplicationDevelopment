

BEGIN;
START TRANSACTION;
INSERT INTO person(first_name, last_name, email_address, contact_number, activated) VALUES('rom', 'heredia', 'rom@email.com', '1234', 1);
INSERT INTO member(address, suburb, city, postal_code, person_id) VALUES ('123 xyz st.', 'auckland', 'auckland', '1010', last_insert_id());

COMMIT;


select * from person;
select * from member;