CREATE TABLE cadastro (
    id int8 NOT NULL,
    email varchar(255) NULL,
    nome varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    tipo int4 NULL,
    CONSTRAINT cadastro_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE cadastro_id_seq
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;
ALTER TABLE cadastro_id_seq OWNER TO postgres;
ALTER TABLE cadastro ALTER COLUMN id SET DEFAULT nextval('cadastro_id_seq'::regclass);

INSERT INTO cadastro (email, nome, password, tipo) VALUES('admin@email.com', 'Admiministrador', '$2a$10$wJdGTQbjaj2NfR7c/imJrOjtBIFZIMqW/GWM.CDGeQD4aNijmq7EC', 0);
