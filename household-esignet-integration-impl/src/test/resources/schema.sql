
CREATE TABLE household (
    household_ID BIGINT PRIMARY KEY,
    group_name character varying(256) NOT NULL,
    phone_number character varying(256) NOT NULL,
    ID_number character varying(256) NOT NULL,
    password character varying(256) NOT NULL,
    tamwini_consented boolean default true
);

INSERT INTO household(household_ID,group_name,phone_number,ID_number,password) VALUES
(1111112L,'test','1234567890','H01','12345');


CREATE VIEW  household_view AS
SELECT
    household_ID,
    group_name,
    phone_number,
    ID_number,
    password,
    tamwini_consented
FROM
    household;