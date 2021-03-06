CREATE TABLE USUARIO 
(
  ID INT NOT NULL 
, CPF INT NOT NULL 
, NOME VARCHAR2(20) NOT NULL 
, EMAIL VARCHAR2(20) NOT NULL 
, LOGIN VARCHAR2(20) NOT NULL 
, SENHA VARCHAR2(20) NOT NULL 
, CONSTRAINT USUARIO_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
)

SELECT * FROM USUARIO


SELECT * FROM CATEGORIA

CREATE TABLE GRUPO 
(
  ID NUMBER NOT NULL PRIMARY KEY
, DESCRICAO VARCHAR(40) NOT NULL 
, GRUPO_PAI_ID NUMBER
)



--SEQUENCIA CRIADA
CREATE SEQUENCE GRUPO_SEQ MINVALUE 1 MAXVALUE 9999999999
INCREMENT BY 1 START WITH 1;
--DO SISTEMA CREATE SEQUENCE  "SYSTEM"."GRUPO_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;

--TRIGGER CRIADA

CREATE OR REPLACE TRIGGER "TR_GRUPO_ID" 
BEFORE INSERT ON "GRUPO"
FOR EACH ROW
BEGIN
  SELECT "GRUPO_SEQ".NEXTVAL INTO:NEW.ID FROM DUAL;
END;

SELECT * FROM GRUPO
INSERT INTO GRUPO (ID,DESCRICAO) VALUES(1,'Administrador');
INSERT INTO GRUPO (DESCRICAO) VALUES('Gerentes') -- NO ORACLE N�O PODE SER FEITO A FORMA REDUZIDA

delete from grupo where id = 6
