-- Table: processamento_clientes_weka

-- DROP TABLE processamento_clientes_weka;

CREATE TABLE processamento_clientes_weka
(
  login_cli character varying(255) NOT NULL,
  "codProduto0" integer NOT NULL,
  "codProduto1" integer NOT NULL,
  "codProduto2" integer NOT NULL,
  "codProduto3" integer NOT NULL,
  "codProduto4" integer NOT NULL,
  "codProduto5" integer NOT NULL,
  "codProduto6" integer NOT NULL,
  "codProduto7" integer NOT NULL,
  "codProduto8" integer NOT NULL,
  "codProduto9" integer NOT NULL,
  data_inclusao date NOT NULL
) 
WITHOUT OIDS;
ALTER TABLE processamento_clientes_weka OWNER TO postgres;




