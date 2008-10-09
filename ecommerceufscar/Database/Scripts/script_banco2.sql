--
-- PostgreSQL database dump
--

-- Started on 2008-10-04 18:26:57

SET client_encoding = 'SQL_ASCII';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

--
-- TOC entry 1694 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'Standard public namespace';


--
-- TOC entry 287 (class 2612 OID 16386)
-- Name: plpgsql; Type: PROCEDURAL LANGUAGE; Schema: -; Owner: postgres
--

CREATE PROCEDURAL LANGUAGE plpgsql;


SET search_path = public, pg_catalog;

--
-- TOC entry 22 (class 1255 OID 16668)
-- Dependencies: 287 4
-- Name: fprocessaclientesweka(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fprocessaclientesweka() RETURNS refcursor
    AS $$
DECLARE
	r RECORD;
	i RECORD;
	j RECORD;
	dtAtual date;
	dtUltimo date;
	produto0 integer;
	produto1 integer;
	produto2 integer;
	produto3 integer;
	produto4 integer;
	produto5 integer;
	produto6 integer;
	produto7 integer;
	produto8 integer;
	produto9 integer;
	count integer;
	ref refcursor;
BEGIN

	dtAtual := date(now());
	dtUltimo := date('01-01-1900');

	FOR i IN SELECT data_inclusao FROM processamento_clientes_weka ORDER BY data_inclusao DESC LIMIT 1
	LOOP
		dtUltimo := i.data_inclusao;
	END LOOP;

	RAISE NOTICE 'teste % ',dtAtual;

	RAISE NOTICE 'teste % ',dtUltimo;


	IF (dtAtual <> dtUltimo) THEN
		FOR i IN EXECUTE 'SELECT cc.login_cli FROM cliente cc, compras co, itens_compras ic WHERE co.login_cli = cc.login_cli AND co.num_compra = ic.num_compra GROUP BY cc.login_cli HAVING COUNT(*) >= 10 ORDER BY cc.login_cli'
		LOOP
			count := 0;

			FOR j IN	SELECT  IC.COD_PRODUTO, 
						P.NOME_PRODUTO
					FROM 	COMPRAS CO,
						ITENS_COMPRAS IC,
						PRODUTOS P
					WHERE 	CO.NUM_COMPRA = IC.NUM_COMPRA
					AND 	CO.LOGIN_CLI = i.login_cli
					AND 	IC.COD_PRODUTO = P.COD_PRODUTO
					ORDER BY CO.DATA_PEDIDO DESC
					LIMIT 10
			LOOP
				
				IF (count = 0) THEN
					produto0 := j.cod_produto;
				ELSEIF (count = 1) THEN
					produto1 := j.cod_produto;
				ELSEIF (count = 2) THEN
					produto2 := j.cod_produto;
				ELSEIF (count = 3) THEN
					produto3 := j.cod_produto;
				ELSEIF (count = 4) THEN
					produto4 := j.cod_produto;
				ELSEIF (count = 5) THEN
					produto5 := j.cod_produto;
				ELSEIF (count = 6) THEN
					produto6 := j.cod_produto;
				ELSEIF (count = 7) THEN
					produto7 := j.cod_produto;
				ELSEIF (count = 8) THEN
					produto8 := j.cod_produto;
				ELSEIF (count = 9) THEN
					produto9 := j.cod_produto;
				END IF;
				
				count := count + 1;
				
			END LOOP;
			
			IF ((produto0 <> 0) AND (produto1 <> 0) AND (produto2 <> 0) AND (produto3 <> 0) AND (produto4 <> 0) AND (produto5 <> 0) AND (produto6 <> 0) AND (produto7 <> 0) AND (produto8 <> 0) AND (produto9 <> 0)) THEN
				INSERT INTO processamento_clientes_weka VALUES (i.login_cli, produto0, produto1, produto2, produto3, produto4, produto5, produto6, produto7, produto8, produto9, dtAtual);
				produto0 := 0;
				produto1 := 0;
				produto2 := 0;
				produto3 := 0;
				produto4 := 0;
				produto5 := 0;
				produto6 := 0;
				produto7 := 0;
				produto8 := 0;
				produto9 := 0;
			END IF;

		END LOOP;
	END IF;

	OPEN ref FOR 	select 	cast(pcw.codProduto0 as varchar),
				cast(pcw.codProduto1 as varchar),
				cast(pcw.codProduto2 as varchar),
				cast(pcw.codProduto3 as varchar),
				cast(pcw.codProduto4 as varchar),
				cast(pcw.codProduto5 as varchar),
				cast(pcw.codProduto6 as varchar),
				cast(pcw.codProduto7 as varchar),
				cast(pcw.codProduto8 as varchar),
				cast(pcw.codProduto9 as varchar)
			from	processamento_clientes_weka pcw
			where	pcw.data_inclusao = dtAtual;

	RETURN ref;
END;
$$
    LANGUAGE plpgsql;


ALTER FUNCTION public.fprocessaclientesweka() OWNER TO postgres;

--
-- TOC entry 21 (class 1255 OID 16669)
-- Dependencies: 4 287
-- Name: fprocessaclientesweka(refcursor); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fprocessaclientesweka(refcursor) RETURNS refcursor
    AS $_$
DECLARE
	i RECORD;
	j RECORD;
	dtAtual date;
	produto0 integer;
	produto1 integer;
	produto2 integer;
	produto3 integer;
	produto4 integer;
	produto5 integer;
	produto6 integer;
	produto7 integer;
	produto8 integer;
	produto9 integer;
	count integer;
BEGIN

	dtAtual := date(now());

	FOR i IN EXECUTE 'SELECT cc.login_cli FROM cliente cc, compras co, itens_compras ic WHERE co.login_cli = cc.login_cli AND co.num_compra = ic.num_compra GROUP BY cc.login_cli HAVING COUNT(*) >= 10 ORDER BY cc.login_cli'
	LOOP
		count := 0;

		FOR j IN	SELECT  IC.COD_PRODUTO, 
					P.NOME_PRODUTO
				FROM 	COMPRAS CO,
					ITENS_COMPRAS IC,
					PRODUTOS P
				WHERE 	CO.NUM_COMPRA = IC.NUM_COMPRA
				AND 	CO.LOGIN_CLI = i.login_cli
				AND 	IC.COD_PRODUTO = P.COD_PRODUTO
				ORDER BY CO.DATA_PEDIDO DESC
				LIMIT 10
		LOOP
			
			IF (count = 0) THEN
				produto0 := j.cod_produto;
			ELSEIF (count = 1) THEN
				produto1 := j.cod_produto;
			ELSEIF (count = 2) THEN
				produto2 := j.cod_produto;
			ELSEIF (count = 3) THEN
				produto3 := j.cod_produto;
			ELSEIF (count = 4) THEN
				produto4 := j.cod_produto;
			ELSEIF (count = 5) THEN
				produto5 := j.cod_produto;
			ELSEIF (count = 6) THEN
				produto6 := j.cod_produto;
			ELSEIF (count = 7) THEN
				produto7 := j.cod_produto;
			ELSEIF (count = 8) THEN
				produto8 := j.cod_produto;
			ELSEIF (count = 9) THEN
				produto9 := j.cod_produto;
			END IF;
			
			count := count + 1;
			
		END LOOP;
		
		IF ((produto0 <> 0) AND (produto1 <> 0) AND (produto2 <> 0) AND (produto3 <> 0) AND (produto4 <> 0) AND (produto5 <> 0) AND (produto6 <> 0) AND (produto7 <> 0) AND (produto8 <> 0) AND (produto9 <> 0)) THEN
			INSERT INTO processamento_clientes_weka VALUES (i.login_cli, produto0, produto1, produto2, produto3, produto4, produto5, produto6, produto7, produto8, produto9, dtAtual);
			produto0 := 0;
			produto1 := 0;
			produto2 := 0;
			produto3 := 0;
			produto4 := 0;
			produto5 := 0;
			produto6 := 0;
			produto7 := 0;
			produto8 := 0;
			produto9 := 0;
		END IF;

	END LOOP;

	OPEN $1 FOR SELECT * FROM processamento_clientes_weka WHERE data_inclusao = dtAtual;

	RETURN $1;
END;
$_$
    LANGUAGE plpgsql;


ALTER FUNCTION public.fprocessaclientesweka(refcursor) OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 1292 (class 1259 OID 16404)
-- Dependencies: 4
-- Name: acompanhamento_produtos_em_falta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE acompanhamento_produtos_em_falta (
    cod_produto integer NOT NULL,
    cod_visitante integer NOT NULL,
    data_atual date,
    data_envio date
);


ALTER TABLE public.acompanhamento_produtos_em_falta OWNER TO postgres;

--
-- TOC entry 1293 (class 1259 OID 16406)
-- Dependencies: 4
-- Name: administrador; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE administrador (
    login_adm character varying(255) NOT NULL,
    data_expedicao date,
    frase_seguranca character varying(255) NOT NULL,
    orgao_expedicao character varying(255),
    passaporte character varying(255),
    rg character varying(255) NOT NULL,
    titulo_eleitor character varying(255)
);


ALTER TABLE public.administrador OWNER TO postgres;

--
-- TOC entry 1294 (class 1259 OID 16408)
-- Dependencies: 4
-- Name: categorias; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE categorias (
    categoria character varying(255) NOT NULL,
    categoria_pai character varying(255)
);


ALTER TABLE public.categorias OWNER TO postgres;

--
-- TOC entry 1295 (class 1259 OID 16410)
-- Dependencies: 4
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cliente (
    cod_cliente integer NOT NULL,
    deseja_receber_email character varying(255) NOT NULL,
    email_secundario character varying(255),
    login_cli character varying(255)
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 1310 (class 1259 OID 16567)
-- Dependencies: 4
-- Name: cliente_cod_cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE cliente_cod_cliente_seq
    START WITH 93
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.cliente_cod_cliente_seq OWNER TO postgres;

--
-- TOC entry 1296 (class 1259 OID 16412)
-- Dependencies: 4
-- Name: cliente_esta_gpr; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cliente_esta_gpr (
    cod_cliente integer NOT NULL,
    cod_grupo integer NOT NULL,
    login_cli character varying(255)
);


ALTER TABLE public.cliente_esta_gpr OWNER TO postgres;

--
-- TOC entry 1297 (class 1259 OID 16414)
-- Dependencies: 4
-- Name: compras; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE compras (
    num_compra integer NOT NULL,
    data_entrega date,
    data_pedido date,
    data_prevista_entrega date,
    desconto double precision,
    forma_pagamento character varying(255),
    observacoes character varying(255),
    status_compra character varying(255),
    valor_frete double precision,
    valor_total double precision,
    login_cli character varying(255),
    cod_endereco integer
);


ALTER TABLE public.compras OWNER TO postgres;

--
-- TOC entry 1308 (class 1259 OID 16557)
-- Dependencies: 4
-- Name: compras_num_compra_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE compras_num_compra_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.compras_num_compra_seq OWNER TO postgres;

--
-- TOC entry 1298 (class 1259 OID 16416)
-- Dependencies: 4
-- Name: endereco; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE endereco (
    cod_endereco integer NOT NULL,
    bairro character varying(255),
    cep character varying(255) NOT NULL,
    cidade character varying(255) NOT NULL,
    endereco character varying(255) NOT NULL,
    estado character varying(255) NOT NULL,
    numero integer NOT NULL,
    pais character varying(255),
    tipo_endereco character varying(255) NOT NULL,
    login_end character varying(255)
);


ALTER TABLE public.endereco OWNER TO postgres;

--
-- TOC entry 1299 (class 1259 OID 16421)
-- Dependencies: 4
-- Name: endereco_cod_endereco_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE endereco_cod_endereco_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.endereco_cod_endereco_seq OWNER TO postgres;

--
-- TOC entry 1300 (class 1259 OID 16423)
-- Dependencies: 4
-- Name: grp_tem_produto; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE grp_tem_produto (
    cod_grupo integer NOT NULL,
    cod_produto integer NOT NULL
);


ALTER TABLE public.grp_tem_produto OWNER TO postgres;

--
-- TOC entry 1301 (class 1259 OID 16425)
-- Dependencies: 4
-- Name: grupo_interesse; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE grupo_interesse (
    cod_grupo integer NOT NULL,
    data_criacao date
);


ALTER TABLE public.grupo_interesse OWNER TO postgres;

--
-- TOC entry 1302 (class 1259 OID 16427)
-- Dependencies: 4
-- Name: historico_navegacao; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE historico_navegacao (
    data_hora_acesso timestamp without time zone NOT NULL,
    endereco_ip character varying(255) NOT NULL,
    cod_cliente_visitante integer,
    cod_produto integer
);


ALTER TABLE public.historico_navegacao OWNER TO postgres;

--
-- TOC entry 1303 (class 1259 OID 16429)
-- Dependencies: 4
-- Name: itens_compras; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE itens_compras (
    cod_produto integer NOT NULL,
    num_compra integer NOT NULL,
    preco_produto double precision,
    quantidade integer
);


ALTER TABLE public.itens_compras OWNER TO postgres;

--
-- TOC entry 1304 (class 1259 OID 16431)
-- Dependencies: 4
-- Name: pessoa; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pessoa (
    login_pes character varying(255) NOT NULL,
    celular character varying(255),
    cpf character varying(255),
    data_nasc date,
    dddcelular character varying(255),
    dddtelefone character varying(255),
    email character varying(255) NOT NULL,
    nome character varying(255),
    ramal character varying(255),
    senha character varying(255) NOT NULL,
    telefone character varying(255)
);


ALTER TABLE public.pessoa OWNER TO postgres;

--
-- TOC entry 1311 (class 1259 OID 16670)
-- Dependencies: 4
-- Name: processamento_clientes_weka; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE processamento_clientes_weka (
    login_cli character varying(255) NOT NULL,
    codproduto0 integer NOT NULL,
    codproduto1 integer NOT NULL,
    codproduto2 integer NOT NULL,
    codproduto3 integer NOT NULL,
    codproduto4 integer NOT NULL,
    codproduto5 integer NOT NULL,
    codproduto6 integer NOT NULL,
    codproduto7 integer NOT NULL,
    codproduto8 integer NOT NULL,
    codproduto9 integer NOT NULL,
    data_inclusao date NOT NULL
);


ALTER TABLE public.processamento_clientes_weka OWNER TO postgres;

--
-- TOC entry 1305 (class 1259 OID 16436)
-- Dependencies: 4
-- Name: produtos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE produtos (
    cod_produto integer NOT NULL,
    dados_tecnicos character varying(255),
    descricao_detalhada character varying(255),
    nome_produto character varying(255) NOT NULL,
    numero_visualizacao integer NOT NULL,
    preco double precision NOT NULL,
    qtde_compras integer NOT NULL,
    qtde_estoque integer,
    categoria character varying(255),
    imagem character varying(255)
);


ALTER TABLE public.produtos OWNER TO postgres;

--
-- TOC entry 1309 (class 1259 OID 16565)
-- Dependencies: 4
-- Name: produtos_cod_produto_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE produtos_cod_produto_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.produtos_cod_produto_seq OWNER TO postgres;

--
-- TOC entry 1306 (class 1259 OID 16438)
-- Dependencies: 4
-- Name: produtos_promocao; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE produtos_promocao (
    cod_produto integer NOT NULL,
    cod_promocao integer NOT NULL,
    data_fim_promocao date,
    data_inicio_promocao date,
    observacoes character varying(255),
    preco_promocional double precision
);


ALTER TABLE public.produtos_promocao OWNER TO postgres;

--
-- TOC entry 1307 (class 1259 OID 16440)
-- Dependencies: 4
-- Name: visitante; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE visitante (
    cod_visitante integer NOT NULL,
    email character varying(255) NOT NULL,
    nome character varying(255) NOT NULL
);


ALTER TABLE public.visitante OWNER TO postgres;

--
-- TOC entry 1643 (class 2606 OID 16443)
-- Dependencies: 1292 1292 1292
-- Name: acompanhamento_produtos_em_falta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY acompanhamento_produtos_em_falta
    ADD CONSTRAINT acompanhamento_produtos_em_falta_pkey PRIMARY KEY (cod_produto, cod_visitante);


--
-- TOC entry 1645 (class 2606 OID 16445)
-- Dependencies: 1293 1293
-- Name: administrador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY administrador
    ADD CONSTRAINT administrador_pkey PRIMARY KEY (login_adm);


--
-- TOC entry 1648 (class 2606 OID 16447)
-- Dependencies: 1294 1294
-- Name: categorias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY categorias
    ADD CONSTRAINT categorias_pkey PRIMARY KEY (categoria);


--
-- TOC entry 1654 (class 2606 OID 16449)
-- Dependencies: 1296 1296 1296
-- Name: cliente_esta_gpr_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente_esta_gpr
    ADD CONSTRAINT cliente_esta_gpr_pkey PRIMARY KEY (cod_cliente, cod_grupo);


--
-- TOC entry 1650 (class 2606 OID 16451)
-- Dependencies: 1295 1295
-- Name: cliente_login_cli_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_login_cli_key UNIQUE (login_cli);


--
-- TOC entry 1652 (class 2606 OID 16453)
-- Dependencies: 1295 1295
-- Name: cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (cod_cliente);


--
-- TOC entry 1656 (class 2606 OID 16455)
-- Dependencies: 1297 1297
-- Name: compras_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY compras
    ADD CONSTRAINT compras_pkey PRIMARY KEY (num_compra);


--
-- TOC entry 1658 (class 2606 OID 16457)
-- Dependencies: 1298 1298
-- Name: endereco_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY endereco
    ADD CONSTRAINT endereco_pkey PRIMARY KEY (cod_endereco);


--
-- TOC entry 1660 (class 2606 OID 16459)
-- Dependencies: 1301 1301
-- Name: grupo_interesse_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY grupo_interesse
    ADD CONSTRAINT grupo_interesse_pkey PRIMARY KEY (cod_grupo);


--
-- TOC entry 1662 (class 2606 OID 16461)
-- Dependencies: 1302 1302 1302
-- Name: historico_navegacao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY historico_navegacao
    ADD CONSTRAINT historico_navegacao_pkey PRIMARY KEY (data_hora_acesso, endereco_ip);


--
-- TOC entry 1664 (class 2606 OID 16463)
-- Dependencies: 1303 1303 1303
-- Name: itens_compras_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY itens_compras
    ADD CONSTRAINT itens_compras_pkey PRIMARY KEY (cod_produto, num_compra);


--
-- TOC entry 1666 (class 2606 OID 16465)
-- Dependencies: 1304 1304
-- Name: pessoa_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pessoa
    ADD CONSTRAINT pessoa_pkey PRIMARY KEY (login_pes);


--
-- TOC entry 1668 (class 2606 OID 16467)
-- Dependencies: 1305 1305
-- Name: produtos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY produtos
    ADD CONSTRAINT produtos_pkey PRIMARY KEY (cod_produto);


--
-- TOC entry 1670 (class 2606 OID 16469)
-- Dependencies: 1306 1306 1306
-- Name: produtos_promocao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY produtos_promocao
    ADD CONSTRAINT produtos_promocao_pkey PRIMARY KEY (cod_produto, cod_promocao);


--
-- TOC entry 1672 (class 2606 OID 16471)
-- Dependencies: 1307 1307
-- Name: visitante_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY visitante
    ADD CONSTRAINT visitante_pkey PRIMARY KEY (cod_visitante);


--
-- TOC entry 1646 (class 1259 OID 16564)
-- Dependencies: 1293
-- Name: fki_admin_pessoa; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX fki_admin_pessoa ON administrador USING btree (login_adm);


--
-- TOC entry 1675 (class 2606 OID 16559)
-- Dependencies: 1293 1304 1665
-- Name: admin_pessoa; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY administrador
    ADD CONSTRAINT admin_pessoa FOREIGN KEY (login_adm) REFERENCES pessoa(login_pes);


--
-- TOC entry 1676 (class 2606 OID 16472)
-- Dependencies: 1665 1304 1295
-- Name: fk334b85fa2a29ae43; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT fk334b85fa2a29ae43 FOREIGN KEY (login_cli) REFERENCES pessoa(login_pes);


--
-- TOC entry 1680 (class 2606 OID 16477)
-- Dependencies: 1297 1295 1649
-- Name: fk38a77ab57876d832; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY compras
    ADD CONSTRAINT fk38a77ab57876d832 FOREIGN KEY (login_cli) REFERENCES cliente(login_cli);


--
-- TOC entry 1681 (class 2606 OID 16482)
-- Dependencies: 1657 1297 1298
-- Name: fk38a77ab591bdf54b; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY compras
    ADD CONSTRAINT fk38a77ab591bdf54b FOREIGN KEY (cod_endereco) REFERENCES endereco(cod_endereco);


--
-- TOC entry 1685 (class 2606 OID 16487)
-- Dependencies: 1305 1302 1667
-- Name: fk544234c671bf5e9e; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY historico_navegacao
    ADD CONSTRAINT fk544234c671bf5e9e FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1686 (class 2606 OID 16492)
-- Dependencies: 1295 1651 1302
-- Name: fk544234c697015505; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY historico_navegacao
    ADD CONSTRAINT fk544234c697015505 FOREIGN KEY (cod_cliente_visitante) REFERENCES cliente(cod_cliente);


--
-- TOC entry 1683 (class 2606 OID 16497)
-- Dependencies: 1301 1659 1300
-- Name: fk6426197c6db49827; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY grp_tem_produto
    ADD CONSTRAINT fk6426197c6db49827 FOREIGN KEY (cod_grupo) REFERENCES grupo_interesse(cod_grupo);


--
-- TOC entry 1684 (class 2606 OID 16502)
-- Dependencies: 1300 1667 1305
-- Name: fk6426197c71bf5e9e; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY grp_tem_produto
    ADD CONSTRAINT fk6426197c71bf5e9e FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1687 (class 2606 OID 16507)
-- Dependencies: 1655 1303 1297
-- Name: fk65faba552aacadfa; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY itens_compras
    ADD CONSTRAINT fk65faba552aacadfa FOREIGN KEY (num_compra) REFERENCES compras(num_compra);


--
-- TOC entry 1688 (class 2606 OID 16512)
-- Dependencies: 1667 1305 1303
-- Name: fk65faba5571bf5e9e; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY itens_compras
    ADD CONSTRAINT fk65faba5571bf5e9e FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1682 (class 2606 OID 16517)
-- Dependencies: 1298 1665 1304
-- Name: fk672d67c92a29b5fe; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY endereco
    ADD CONSTRAINT fk672d67c92a29b5fe FOREIGN KEY (login_end) REFERENCES pessoa(login_pes);


--
-- TOC entry 1690 (class 2606 OID 16522)
-- Dependencies: 1305 1306 1667
-- Name: fk82a1166771bf5e9e; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY produtos_promocao
    ADD CONSTRAINT fk82a1166771bf5e9e FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1677 (class 2606 OID 16527)
-- Dependencies: 1301 1659 1296
-- Name: fk98b0e6aa6db49827; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente_esta_gpr
    ADD CONSTRAINT fk98b0e6aa6db49827 FOREIGN KEY (cod_grupo) REFERENCES grupo_interesse(cod_grupo);


--
-- TOC entry 1678 (class 2606 OID 16532)
-- Dependencies: 1296 1295 1649
-- Name: fk98b0e6aa7876d832; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente_esta_gpr
    ADD CONSTRAINT fk98b0e6aa7876d832 FOREIGN KEY (login_cli) REFERENCES cliente(login_cli);


--
-- TOC entry 1679 (class 2606 OID 16537)
-- Dependencies: 1651 1295 1296
-- Name: fk98b0e6aa9cbcb1b; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente_esta_gpr
    ADD CONSTRAINT fk98b0e6aa9cbcb1b FOREIGN KEY (cod_cliente) REFERENCES cliente(cod_cliente);


--
-- TOC entry 1673 (class 2606 OID 16542)
-- Dependencies: 1305 1667 1292
-- Name: fkb0a4756871bf5e9e; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY acompanhamento_produtos_em_falta
    ADD CONSTRAINT fkb0a4756871bf5e9e FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1674 (class 2606 OID 16547)
-- Dependencies: 1292 1671 1307
-- Name: fkb0a47568892277b9; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY acompanhamento_produtos_em_falta
    ADD CONSTRAINT fkb0a47568892277b9 FOREIGN KEY (cod_visitante) REFERENCES visitante(cod_visitante);


--
-- TOC entry 1689 (class 2606 OID 16552)
-- Dependencies: 1305 1294 1647
-- Name: fkc42c109a1bf50925; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY produtos
    ADD CONSTRAINT fkc42c109a1bf50925 FOREIGN KEY (categoria) REFERENCES categorias(categoria);


--
-- TOC entry 1695 (class 0 OID 0)
-- Dependencies: 4
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;


-- Completed on 2008-10-04 18:26:57

--
-- PostgreSQL database dump complete
--

