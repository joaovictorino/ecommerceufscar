--
-- PostgreSQL database dump
--

-- Started on 2007-12-15 09:11:31 BRST

SET client_encoding = 'LATIN1';
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 1614 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'Standard public namespace';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = true;

--
-- TOC entry 1206 (class 1259 OID 16665)
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
-- TOC entry 1207 (class 1259 OID 16667)
-- Dependencies: 4
-- Name: administrador; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE administrador (
    login_adm character varying(25) NOT NULL,
    frase_seguranca character varying(100) NOT NULL,
    rg character varying(14) NOT NULL,
    passaporte character varying(20),
    orgao_expedicao character varying(4),
    titulo_eleitor character varying(20),
    data_expedicao date
);


ALTER TABLE public.administrador OWNER TO postgres;

--
-- TOC entry 1208 (class 1259 OID 16669)
-- Dependencies: 4
-- Name: categorias; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE categorias (
    categoria character varying(30) NOT NULL,
    categoria_pai character varying(30)
);


ALTER TABLE public.categorias OWNER TO postgres;

--
-- TOC entry 1210 (class 1259 OID 16673)
-- Dependencies: 1552 4
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cliente (
    cod_cliente serial NOT NULL,
    login_cli character varying(25) NOT NULL,
    email_secundario character varying(60),
    deseja_receber_email character varying(1) DEFAULT 'N'::character varying NOT NULL
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 1211 (class 1259 OID 16677)
-- Dependencies: 4
-- Name: cliente_esta_gpr; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cliente_esta_gpr (
    cod_cliente integer NOT NULL,
    cod_grupo integer NOT NULL,
    login_cli character varying(25)
);


ALTER TABLE public.cliente_esta_gpr OWNER TO postgres;

--
-- TOC entry 1213 (class 1259 OID 16681)
-- Dependencies: 4
-- Name: compras; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE compras (
    num_compra serial NOT NULL,
    cod_endereco integer NOT NULL,
    login_cli character varying(25) NOT NULL,
    forma_pagamento character varying(20),
    status_compra character varying(20),
    data_pedido date,
    data_prevista_entrega date,
    data_entrega date,
    observacoes text,
    valor_frete numeric(6,2),
    desconto numeric(8,2),
    valor_total numeric(11,2)
);


ALTER TABLE public.compras OWNER TO postgres;

--
-- TOC entry 1215 (class 1259 OID 16689)
-- Dependencies: 4
-- Name: endereco; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE endereco (
    cod_endereco serial NOT NULL,
    tipo_endereco character varying(10) NOT NULL,
    login_end character varying(25) NOT NULL,
    endereco character varying(60) NOT NULL,
    numero integer NOT NULL,
    cep character varying(10) NOT NULL,
    estado character varying(2) NOT NULL,
    pais character varying(15),
    cidade character varying(30) NOT NULL,
    bairro character varying(25)
);


ALTER TABLE public.endereco OWNER TO postgres;

--
-- TOC entry 1216 (class 1259 OID 16692)
-- Dependencies: 4
-- Name: grp_tem_produto; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE grp_tem_produto (
    cod_grupo integer NOT NULL,
    cod_produto integer NOT NULL
);


ALTER TABLE public.grp_tem_produto OWNER TO postgres;

--
-- TOC entry 1218 (class 1259 OID 16696)
-- Dependencies: 4
-- Name: grupo_interesse; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE grupo_interesse (
    cod_grupo serial NOT NULL,
    data_criacao date
);


ALTER TABLE public.grupo_interesse OWNER TO postgres;

--
-- TOC entry 1219 (class 1259 OID 16699)
-- Dependencies: 4
-- Name: historico_navegacao; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE historico_navegacao (
    data_hora_acesso timestamp without time zone NOT NULL,
    endereco_ip character varying(15) NOT NULL,
    cod_cliente_visitante integer NOT NULL,
    cod_produto integer NOT NULL
);


ALTER TABLE public.historico_navegacao OWNER TO postgres;

--
-- TOC entry 1220 (class 1259 OID 16701)
-- Dependencies: 4
-- Name: itens_compras; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE itens_compras (
    num_compra integer NOT NULL,
    cod_produto integer NOT NULL,
    quantidade integer,
    preco_produto numeric(9,2)
);


ALTER TABLE public.itens_compras OWNER TO postgres;

--
-- TOC entry 1221 (class 1259 OID 16703)
-- Dependencies: 4
-- Name: pessoa; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pessoa (
    login_pes character varying(25) NOT NULL,
    celular character varying(9),
    cpf character varying(20),
    data_nasc date,
    dddcelular character varying(2),
    dddtelefone character varying(2),
    email character varying(60) NOT NULL,
    nome character varying(50),
    ramal character varying(5),
    senha character varying(30) NOT NULL,
    telefone character(9));


ALTER TABLE public.pessoa OWNER TO postgres;

--
-- TOC entry 1225 (class 1259 OID 16711)
-- Dependencies: 4
-- Name: produtos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE produtos (
    cod_produto serial NOT NULL, 
    dados_tecnicos character varying(300),
    descricao_detalhada character varying(300),
    nome_produto character varying(50) NOT NULL,
    numero_visualizacao serial NOT NULL,
    preco numeric(9,2) NOT NULL,
    qtde_compras integer NOT NULL,
    qtde_estoque integer,
    categoria character varying(30) NOT NULL, 
    imagem text);


ALTER TABLE public.produtos OWNER TO postgres;

--
-- TOC entry 1227 (class 1259 OID 16718)
-- Dependencies: 4
-- Name: produtos_promocao; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE produtos_promocao (
    cod_promocao serial NOT NULL,
    cod_produto integer NOT NULL,
    observacoes text,
    preco_promocional numeric(9,2),
    data_inicio_promocao date,
    data_fim_promocao date
);


ALTER TABLE public.produtos_promocao OWNER TO postgres;

--
-- TOC entry 1229 (class 1259 OID 16726)
-- Dependencies: 4
-- Name: visitante; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE visitante (
    cod_visitante serial NOT NULL,
    nome character varying(30) NOT NULL,
    email character varying(60) NOT NULL
);


ALTER TABLE public.visitante OWNER TO postgres;

--
-- TOC entry 1562 (class 2606 OID 16730)
-- Dependencies: 1206 1206 1206
-- Name: acompanhamento_produtos_em_falta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY acompanhamento_produtos_em_falta
    ADD CONSTRAINT acompanhamento_produtos_em_falta_pkey PRIMARY KEY (cod_produto, cod_visitante);


--
-- TOC entry 1564 (class 2606 OID 16732)
-- Dependencies: 1207 1207
-- Name: adminstrador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY administrador
    ADD CONSTRAINT adminstrador_pkey PRIMARY KEY (login_adm);


--
-- TOC entry 1566 (class 2606 OID 16734)
-- Dependencies: 1208 1208
-- Name: categorias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY categorias
    ADD CONSTRAINT categorias_pkey PRIMARY KEY (categoria);


--
-- TOC entry 1572 (class 2606 OID 16736)
-- Dependencies: 1211 1211 1211
-- Name: cliente_esta_gpr_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente_esta_gpr
    ADD CONSTRAINT cliente_esta_gpr_pkey PRIMARY KEY (cod_cliente, cod_grupo);


--
-- TOC entry 1568 (class 2606 OID 16738)
-- Dependencies: 1210 1210
-- Name: cliente_login_cli_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_login_cli_key UNIQUE (login_cli);


--
-- TOC entry 1570 (class 2606 OID 16740)
-- Dependencies: 1210 1210
-- Name: cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (cod_cliente);


--
-- TOC entry 1574 (class 2606 OID 16742)
-- Dependencies: 1213 1213
-- Name: compras_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY compras
    ADD CONSTRAINT compras_pkey PRIMARY KEY (num_compra);


--
-- TOC entry 1576 (class 2606 OID 16744)
-- Dependencies: 1215 1215
-- Name: enderecocliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY endereco
    ADD CONSTRAINT enderecocliente_pkey PRIMARY KEY (cod_endereco);


--
-- TOC entry 1579 (class 2606 OID 16746)
-- Dependencies: 1216 1216 1216
-- Name: grp_tem_produto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY grp_tem_produto
    ADD CONSTRAINT grp_tem_produto_pkey PRIMARY KEY (cod_grupo, cod_produto);


--
-- TOC entry 1581 (class 2606 OID 16748)
-- Dependencies: 1218 1218
-- Name: grupo_interesse_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY grupo_interesse
    ADD CONSTRAINT grupo_interesse_pkey PRIMARY KEY (cod_grupo);


--
-- TOC entry 1583 (class 2606 OID 16750)
-- Dependencies: 1219 1219 1219
-- Name: historico_navegacao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY historico_navegacao
    ADD CONSTRAINT historico_navegacao_pkey PRIMARY KEY (data_hora_acesso, endereco_ip);


--
-- TOC entry 1585 (class 2606 OID 16752)
-- Dependencies: 1220 1220 1220
-- Name: itens_compras_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY itens_compras
    ADD CONSTRAINT itens_compras_pkey PRIMARY KEY (num_compra, cod_produto);


--
-- TOC entry 1587 (class 2606 OID 16754)
-- Dependencies: 1221 1221
-- Name: pessoa_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pessoa
    ADD CONSTRAINT pessoa_pkey PRIMARY KEY (login_pes);


--
-- TOC entry 1589 (class 2606 OID 16756)
-- Dependencies: 1225 1225
-- Name: produtos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY produtos
    ADD CONSTRAINT produtos_pkey PRIMARY KEY (cod_produto);


--
-- TOC entry 1591 (class 2606 OID 16758)
-- Dependencies: 1227 1227 1227
-- Name: produtos_promocao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY produtos_promocao
    ADD CONSTRAINT produtos_promocao_pkey PRIMARY KEY (cod_promocao, cod_produto);


--
-- TOC entry 1593 (class 2606 OID 16760)
-- Dependencies: 1229 1229
-- Name: visitante_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY visitante
    ADD CONSTRAINT visitante_pkey PRIMARY KEY (cod_visitante);


--
-- TOC entry 1577 (class 1259 OID 16761)
-- Dependencies: 1215
-- Name: fki_end_pess; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX fki_end_pess ON endereco USING btree (login_end);


--
-- TOC entry 1610 (class 2606 OID 16762)
-- Dependencies: 1225 1208 1565
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY produtos
    ADD CONSTRAINT "$1" FOREIGN KEY (categoria) REFERENCES categorias(categoria);


--
-- TOC entry 1596 (class 2606 OID 16767)
-- Dependencies: 1207 1221 1586
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY administrador
    ADD CONSTRAINT "$1" FOREIGN KEY (login_adm) REFERENCES pessoa(login_pes);


--
-- TOC entry 1597 (class 2606 OID 16772)
-- Dependencies: 1210 1221 1586
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT "$1" FOREIGN KEY (login_cli) REFERENCES pessoa(login_pes);


--
-- TOC entry 1611 (class 2606 OID 16777)
-- Dependencies: 1227 1225 1588
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY produtos_promocao
    ADD CONSTRAINT "$1" FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1594 (class 2606 OID 16782)
-- Dependencies: 1206 1225 1588
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY acompanhamento_produtos_em_falta
    ADD CONSTRAINT "$1" FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1601 (class 2606 OID 16787)
-- Dependencies: 1213 1215 1575
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY compras
    ADD CONSTRAINT "$1" FOREIGN KEY (cod_endereco) REFERENCES endereco(cod_endereco);


--
-- TOC entry 1608 (class 2606 OID 16792)
-- Dependencies: 1220 1213 1573
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY itens_compras
    ADD CONSTRAINT "$1" FOREIGN KEY (num_compra) REFERENCES compras(num_compra);


--
-- TOC entry 1606 (class 2606 OID 16797)
-- Dependencies: 1219 1210 1569
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY historico_navegacao
    ADD CONSTRAINT "$1" FOREIGN KEY (cod_cliente_visitante) REFERENCES cliente(cod_cliente);


--
-- TOC entry 1604 (class 2606 OID 16802)
-- Dependencies: 1216 1218 1580
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY grp_tem_produto
    ADD CONSTRAINT "$1" FOREIGN KEY (cod_grupo) REFERENCES grupo_interesse(cod_grupo);


--
-- TOC entry 1598 (class 2606 OID 16807)
-- Dependencies: 1211 1210 1569
-- Name: $1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente_esta_gpr
    ADD CONSTRAINT "$1" FOREIGN KEY (cod_cliente) REFERENCES cliente(cod_cliente);


--
-- TOC entry 1595 (class 2606 OID 16812)
-- Dependencies: 1206 1229 1592
-- Name: $2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY acompanhamento_produtos_em_falta
    ADD CONSTRAINT "$2" FOREIGN KEY (cod_visitante) REFERENCES visitante(cod_visitante);


--
-- TOC entry 1602 (class 2606 OID 16817)
-- Dependencies: 1213 1210 1567
-- Name: $2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY compras
    ADD CONSTRAINT "$2" FOREIGN KEY (login_cli) REFERENCES cliente(login_cli);


--
-- TOC entry 1609 (class 2606 OID 16822)
-- Dependencies: 1220 1225 1588
-- Name: $2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY itens_compras
    ADD CONSTRAINT "$2" FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1607 (class 2606 OID 16827)
-- Dependencies: 1219 1225 1588
-- Name: $2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY historico_navegacao
    ADD CONSTRAINT "$2" FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1605 (class 2606 OID 16832)
-- Dependencies: 1216 1225 1588
-- Name: $2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY grp_tem_produto
    ADD CONSTRAINT "$2" FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto);


--
-- TOC entry 1599 (class 2606 OID 16837)
-- Dependencies: 1211 1218 1580
-- Name: $2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente_esta_gpr
    ADD CONSTRAINT "$2" FOREIGN KEY (cod_grupo) REFERENCES grupo_interesse(cod_grupo);


--
-- TOC entry 1600 (class 2606 OID 16842)
-- Dependencies: 1211 1210 1567
-- Name: $3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente_esta_gpr
    ADD CONSTRAINT "$3" FOREIGN KEY (login_cli) REFERENCES cliente(login_cli);


--
-- TOC entry 1603 (class 2606 OID 16847)
-- Dependencies: 1215 1221 1586
-- Name: fk_end_pess; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY endereco
    ADD CONSTRAINT fk_end_pess FOREIGN KEY (login_end) REFERENCES pessoa(login_pes);


--
-- TOC entry 1615 (class 0 OID 0)
-- Dependencies: 4
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;


--
-- TOC entry 1616 (class 0 OID 0)
-- Dependencies: 1206
-- Name: acompanhamento_produtos_em_falta; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE acompanhamento_produtos_em_falta FROM PUBLIC;
REVOKE ALL ON TABLE acompanhamento_produtos_em_falta FROM postgres;
GRANT ALL ON TABLE acompanhamento_produtos_em_falta TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE acompanhamento_produtos_em_falta TO g_usersite;


--
-- TOC entry 1617 (class 0 OID 0)
-- Dependencies: 1207
-- Name: administrador; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE administrador FROM PUBLIC;
REVOKE ALL ON TABLE administrador FROM postgres;
GRANT ALL ON TABLE administrador TO postgres;
GRANT INSERT,SELECT,RULE,UPDATE,DELETE ON TABLE administrador TO g_usersite;


--
-- TOC entry 1618 (class 0 OID 0)
-- Dependencies: 1208
-- Name: categorias; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE categorias FROM PUBLIC;
REVOKE ALL ON TABLE categorias FROM postgres;
GRANT ALL ON TABLE categorias TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE categorias TO g_usersite;


--
-- TOC entry 1619 (class 0 OID 0)
-- Dependencies: 1210
-- Name: cliente; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE cliente FROM PUBLIC;
REVOKE ALL ON TABLE cliente FROM postgres;
GRANT ALL ON TABLE cliente TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE cliente TO g_usersite;


--
-- TOC entry 1620 (class 0 OID 0)
-- Dependencies: 1211
-- Name: cliente_esta_gpr; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE cliente_esta_gpr FROM PUBLIC;
REVOKE ALL ON TABLE cliente_esta_gpr FROM postgres;
GRANT ALL ON TABLE cliente_esta_gpr TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE cliente_esta_gpr TO g_usersite;


--
-- TOC entry 1621 (class 0 OID 0)
-- Dependencies: 1213
-- Name: compras; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE compras FROM PUBLIC;
REVOKE ALL ON TABLE compras FROM postgres;
GRANT ALL ON TABLE compras TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE compras TO g_usersite;


--
-- TOC entry 1622 (class 0 OID 0)
-- Dependencies: 1215
-- Name: endereco; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE endereco FROM PUBLIC;
REVOKE ALL ON TABLE endereco FROM postgres;
GRANT ALL ON TABLE endereco TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE endereco TO g_usersite;


--
-- TOC entry 1623 (class 0 OID 0)
-- Dependencies: 1216
-- Name: grp_tem_produto; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE grp_tem_produto FROM PUBLIC;
REVOKE ALL ON TABLE grp_tem_produto FROM postgres;
GRANT ALL ON TABLE grp_tem_produto TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE grp_tem_produto TO g_usersite;


--
-- TOC entry 1624 (class 0 OID 0)
-- Dependencies: 1218
-- Name: grupo_interesse; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE grupo_interesse FROM PUBLIC;
REVOKE ALL ON TABLE grupo_interesse FROM postgres;
GRANT ALL ON TABLE grupo_interesse TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE grupo_interesse TO g_usersite;


--
-- TOC entry 1625 (class 0 OID 0)
-- Dependencies: 1219
-- Name: historico_navegacao; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE historico_navegacao FROM PUBLIC;
REVOKE ALL ON TABLE historico_navegacao FROM postgres;
GRANT ALL ON TABLE historico_navegacao TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE historico_navegacao TO g_usersite;


--
-- TOC entry 1626 (class 0 OID 0)
-- Dependencies: 1220
-- Name: itens_compras; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE itens_compras FROM PUBLIC;
REVOKE ALL ON TABLE itens_compras FROM postgres;
GRANT ALL ON TABLE itens_compras TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE itens_compras TO g_usersite;


--
-- TOC entry 1627 (class 0 OID 0)
-- Dependencies: 1221
-- Name: pessoa; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE pessoa FROM PUBLIC;
REVOKE ALL ON TABLE pessoa FROM postgres;
GRANT ALL ON TABLE pessoa TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE pessoa TO g_usersite;


--
-- TOC entry 1628 (class 0 OID 0)
-- Dependencies: 1225
-- Name: produtos; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE produtos FROM PUBLIC;
REVOKE ALL ON TABLE produtos FROM postgres;
GRANT ALL ON TABLE produtos TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE produtos TO g_usersite;


--
-- TOC entry 1629 (class 0 OID 0)
-- Dependencies: 1227
-- Name: produtos_promocao; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE produtos_promocao FROM PUBLIC;
REVOKE ALL ON TABLE produtos_promocao FROM postgres;
GRANT ALL ON TABLE produtos_promocao TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE produtos_promocao TO g_usersite;


--
-- TOC entry 1630 (class 0 OID 0)
-- Dependencies: 1229
-- Name: visitante; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE visitante FROM PUBLIC;
REVOKE ALL ON TABLE visitante FROM postgres;
GRANT ALL ON TABLE visitante TO postgres;
GRANT INSERT,SELECT,UPDATE,DELETE ON TABLE visitante TO g_usersite;


-- Completed on 2007-12-15 09:11:31 BRST

--
-- PostgreSQL database dump complete
--

