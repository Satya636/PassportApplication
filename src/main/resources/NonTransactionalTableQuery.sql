CREATE TABLE YEARS_MASTER 
(
  YEAR_ID INT NOT NULL 
, YEAR NUMBER 
, CONSTRAINT YEARS_MASTER_PK PRIMARY KEY 
  (
    YEAR_ID 
  )
  ENABLE 
);

INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('1', '2010');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('2', '2011');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('3', '2012');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('4', '2013');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('5', '2014');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('6', '2015');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('7', '2016');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('8', '2017');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('9', '2018');
INSERT INTO "SCOTT"."YEARS_MASTER" (YEAR_ID, YEAR) VALUES ('10', '2019');

==================================================================================
CREATE TABLE DEGREES_MASTER 
(
  DEGREE_ID INT NOT NULL 
, DEGREE_NAME VARCHAR2(20) 
, CONSTRAINT DEGREES_MASTER_PK PRIMARY KEY 
  (
    DEGREE_ID 
  )
  ENABLE 
);

INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('1', 'BSC');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('2', 'BCA');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('3', 'B.TECH');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('4', 'B.PHARMA');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('5', 'MCA');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('6', 'MBA');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('7', 'MBBS');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('8', 'M.PHIL');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('9', 'M.TECH');
INSERT INTO "SCOTT"."DEGREES_MASTER" (DEGREE_ID, DEGREE_NAME) VALUES ('10', 'B.ARCH');

======================================================================================

CREATE TABLE UNIVSERSITY_MASTER 
(
  UNIV_ID NUMBER NOT NULL 
, UNIV_NAME VARCHAR2(30) 
, CONSTRAINT UNIVSERSITY_MASTER_PK PRIMARY KEY 
  (
    UNIV_ID 
  )
  ENABLE 
);

INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('1', 'IIS');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('2', 'JNU');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('3', 'DU');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('4', 'NOU');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('5', 'UU');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('6', 'IIT');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('7', 'IIM');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('8', 'BITS');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('9', 'PU');
INSERT INTO "SCOTT"."UNIVSERSITY_MASTER" (UNIV_ID, UNIV_NAME) VALUES ('10', 'SRM');


