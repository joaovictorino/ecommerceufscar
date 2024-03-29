--
-- PostgreSQL database dump
--

-- Started on 2008-02-10 19:38:10

SET client_encoding = 'LATIN1';
--SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

SET search_path = public, pg_catalog;

--
-- TOC entry 1694 (class 0 OID 0)
-- Dependencies: 1291
-- Name: endereco_cod_endereco_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

-- SELECT pg_catalog.setval('endereco_cod_endereco_seq', 1, true);


--
-- TOC entry 1677 (class 0 OID 26451)
-- Dependencies: 1284
-- Data for Name: acompanhamento_produtos_em_falta; Type: TABLE DATA; Schema: public; Owner: postgres
--

--
-- TOC entry 1688 (class 0 OID 26478)
-- Dependencies: 1296
-- Data for Name: pessoa; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO pessoa (login_pes, celular, cpf, data_nasc, dddcelular, dddtelefone, email, nome, ramal, senha, telefone) VALUES ('jh_vs', '76344824', '32447528884', '1984-12-21', '11', '11', 'teste', 'jo�o henrique', '', '12345', '61415475');
INSERT INTO pessoa (login_pes, celular, cpf, data_nasc, dddcelular, dddtelefone, email, nome, ramal, senha, telefone) VALUES ('paula', 'dfsdfsdf', 'dsfdfsf', '2008-01-18', 'df', 'fs', 'dfsdfdf', 'dsfdfdsf', 'dfds', 'amizade', 'fdsfdfdf');


--
-- TOC entry 1678 (class 0 OID 26453)
-- Dependencies: 1285
-- Data for Name: administrador; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO administrador (login_adm, data_expedicao, frase_seguranca, orgao_expedicao, passaporte, rg, titulo_eleitor) VALUES ('jh_vs', '2001-10-23', 'teste', 'ssp', '', '351267396', '123456789');
INSERT INTO administrador (login_adm, data_expedicao, frase_seguranca, orgao_expedicao, passaporte, rg, titulo_eleitor) VALUES ('paula', '2008-01-03', 'ffsddsfdsf', 'fdff', 'sdfsdfdfs', 'dsfdfdsf', 'dsfsdfdfsd');


--
-- TOC entry 1679 (class 0 OID 26455)
-- Dependencies: 1286
-- Data for Name: categorias; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO categorias (categoria, categoria_pai) VALUES ('categoria', NULL);


--
-- TOC entry 1680 (class 0 OID 26457)
-- Dependencies: 1287
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1681 (class 0 OID 26459)
-- Dependencies: 1288
-- Data for Name: cliente_esta_gpr; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1682 (class 0 OID 26461)
-- Dependencies: 1289
-- Data for Name: compras; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1683 (class 0 OID 26463)
-- Dependencies: 1290
-- Data for Name: endereco; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO endereco (cod_endereco, bairro, cep, cidade, endereco, estado, numero, pais, tipo_endereco, login_end) VALUES (1, 'dsffdfsdffdf', 'dfsfddsf', 'dsffdfsdfsdf', 'sfdsfsdfsdfdsf', 'sd', 4556, 'dsfdfsdfsdfdfs', 'Avenida', 'paula');


--
-- TOC entry 1684 (class 0 OID 26470)
-- Dependencies: 1292
-- Data for Name: grp_tem_produto; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1685 (class 0 OID 26472)
-- Dependencies: 1293
-- Data for Name: grupo_interesse; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1686 (class 0 OID 26474)
-- Dependencies: 1294
-- Data for Name: historico_navegacao; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1687 (class 0 OID 26476)
-- Dependencies: 1295
-- Data for Name: itens_compras; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1689 (class 0 OID 26483)
-- Dependencies: 1297
-- Data for Name: produtos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (1, 'Largura 63mm; Altura 24mm; Profundidade 10mm; Peso 15 g.', 'Capacidade 4096Mb; Velocidade de Leitura 6 Mb/s Velocidade de Grava��o 1,5 Mb/s; Sistema operacional compat�vel Microsoft Windows, Macintosh.', 'Pen Drive Kingston DataTraveler DTI 4GB', 0, 100, 0, 1000, 'categoria', 'pen kingston 4gb P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (2, 'Tipo de Display: LCD TFT; Widescreen: Sim; Tela: 15.4 polegadas; Resolu��o: 1280 x 800 Pixels; Placa de v�deo: ATI Radeon Xpress 1100; Mem�ria de V�deo: 128 compartilhada Mb;Fax Modem: 56K; Conex�es: Rede 10/100 integrada;', 'Processador: AMD Turion 64 X2; Velocidade do Processador: 1,6 GHz; Cache: 512 Kb;Capacidade do HD: 120 GBytes; Velocidade do HD: 5400 RPM;Mem�ria RAM: 1024 MBytes; Tecnologia da Mem�ria: DDR2; M�ximo de Mem�ria: 4096 Mb;', 'Acer Aspire 5100-5196', 0, 2600, 0, 50, 'categoria', 'Acer Aspire 5100-5196 P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (3, 'M�dias Compat�veis: DVD�RW Double Layer;Tipo de Display: LCD TFT; Widescreen: Sim; Tela: 15.4 polegadas; Resolu��o: 1280 x 800 Pixels; Placa de v�deo: NVIDIA GeForce Go 6150;Fax Modem: 56K; Conex�es: Rede 10/100 integrada;', 'Processador: AMD Turion 64 MK-36; Velocidade do Processador: 2.0 GHz; Cache: 512 Kb;Capacidade do HD: 80 GBytes; Velocidade do HD: 5400 RPM;Mem�ria RAM: 1024 MBytes; Tecnologia da Mem�ria: DDR2; M�ximo de Mem�ria: 2048 Mb', 'HP Latitude DV6232', 0, 3200, 0, 50, 'categoria', 'HP Latitude DV6232 P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (4, 'Fun��es Extras: MP3 Player, Gravador de Voz, Viva-Voz, Java; Reproduz V�deo: Sim; Grava V�deo: Sim; Mensagens Escritas: EMS (texto, som, �cone), MMS (texto, som, imagem), E-mail, SMS (texto); Modo Entrada de Texto: T-9;', 'Cores da Tela: 256000 cores; Resolu��o: 240 x 320 pixels; Formato: Slider; Mem�ria Interna: 50 Mb; Slots de Expans�o: Sim; Banda: Tri-Band; Antena: Interna; C�mera: 2.0; Zoom: 4x; Flash Embutido: Sim;', 'LG Shine ME970 (KE970) Desbloqueado GSM', 0, 900, 0, 100, 'categoria', 'LG 970ME P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (5, 'Suporte para HDTV: N�o; Outras conex�es: Bluetooth, USB, Wi-Fi; Mem�ria RAM: 512 Mb; Jogos na Mem�ria: N�o; Acess�rios Inclusos: Wii Nunchuk Controller, Wii Remote Controller; Largura: 44 mm; Altura: 157 mm; Profundidade: 215 mm; Peso: 1,7 Kg;', 'Processador (CPU): IBM Broadway; Velocidade CPU: 729 MHz; M�dias Compat�veis: DVD; Processador Gr�fico (GPU): ATI Hollywood; Velocidade GPU: 243 MHz; Resolu��o M�xima: 640 x 480 Pixels; Entradas para Controles: 4; Sa�da de V�deo: V�deo componente;', 'Nintendo Wii', 0, 1300, 0, 35, 'categoria', 'Nintendo Wii P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (6, 'Fun��es Extras: MP3 Player, R�dio FM, Gravador de Voz, Comando de Voz, Viva-Voz, Java; Reproduz V�deo: Sim; Grava V�deo: Sim; Mensagens Escritas: MMS (texto, som, imagem), SMS (texto); Modo Entrada de Texto: T-9; Tipo de Toque: Polif�nico, MP3, Vibracall;', 'Cores da Tela: 262000 cores; Resolu��o: 320 x 240 pixels; Formato: Girat�rio; Mem�ria Interna: 10 Mb; Slots de Expans�o: Sim; Banda: Tri-Band; Antena: Interna; C�mera: 2.0; Zoom: 8x; Flash Embutido: N�o;', 'Nokia 7373 Desbloqueado GSM', 0, 800, 0, 30, 'categoria', 'Nokia 7373 P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (7, 'Fun��es: R�dio, Grava Video, Reproduz Video, SMS, MP3 Player, Viva Voz; Sistema Operacional: Symbian OS; Interface: GPRS, USB, Bluetooth; Sa�da de �udio: Auto Falante; Modos de Entrada: Teclado; Bateria Recarreg�vel: L�tio-�on;', 'Mem�ria: 24 Mb; Slots de Expans�o: MicroSD; Tecnologia: GSM; Banda: Quadri-Band; Formato: Flip; Teclado: QWERTY Reduzido; Tela: LCD TFT; Resolu��o da Tela: 240x320, 52 Pixels; N�mero de Cores: 16000000; C�mera Digital: 2.0 Megapixel;', 'Nokia N76', 0, 1400, 0, 40, 'categoria', 'Nokia N76 P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (8, 'Fun��es Extras: MP3 Player, R�dio FM, Gravador de Voz, Comando de Voz, Viva-Voz, Java; Reproduz V�deo: Sim; Grava V�deo: Sim; Mensagens Escritas: EMS (texto, som, �cone), MMS (texto, som, imagem), SMS (texto); Modo Entrada de Texto: T-9;', 'Cores da Tela: 262000 cores; Resolu��o: 240 x 320 pixels; Formato: Slider; Mem�ria Interna: 60 Mb; Slots de Expans�o: Sim; Banda: Quadri-Band; Antena: Interna; C�mera: 3.2; Zoom: 4x; Flash Embutido: Sim;', 'Samsung SGH-U600 Desbloqueado GSM', 0, 900, 0, 25, 'categoria', 'samsung u600 P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (9, 'Outras conex�es: Bluetooth, USB; Mem�ria RAM: 256 Mb; Largura: 325 mm; Altura: 98 mm; Profundidade: 274 mm; Peso: 5 Kg;', 'M�dias Compat�veis: Blu-Ray, CD, DVD; Resolu��o M�xima: 1080 x 720 Pixels; Sa�da de V�deo: HDMI;', 'Sony PlayStation 3 80GB', 0, 2500, 0, 15, 'categoria', 'Sony PlayStation 3 P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (10, 'Capacidade do HD: 160 GBytes; Mem�ria RAM: 2048 MBytes;', 'Processador: Intel Core 2 Duo T7250; Velocidade do Processador: 2.0 GHz;', 'Sony Vaio VGN-CR260A Rosa', 0, 4500, 0, 35, 'categoria', 'Sony Vaio VGN-CR260A Rosa P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (11, 'Certificado pelo INMETRO. Produto testado e aprovado de acordo com as normas de seguran�a. Lav�vel a seco.', 'Material: Enchimento com fibra sint�tica. Cor: Tonalidades de azul e detalhes em rosa (pode ocorrer varia��o na cor do produto em rela��o a foto devido a diferen�a de cor entre os monitores de v�deo). Tamanho: 40 cm (medidas aproximadas).', 'Stitch', 0, 125, 0, 20, 'categoria', 'stitch P.jpg');
INSERT INTO produtos (cod_produto, dados_tecnicos, descricao_detalhada, nome_produto, numero_visualizacao, preco, qtde_compras, qtde_estoque, categoria, imagem) VALUES (12, 'Sa�da de V�deo: V�deo composto; Suporte para HDTV: Sim; Outras conex�es: Rede 10/100 integrada; Mem�ria RAM: 512 Mb; Jogos na Mem�ria: N�o; Acess�rios Inclusos: Cabo Multi A/V; Voltagem: 110V; Largura: 309 mm; Altura: 83 mm; Profundidade: 258 mm;', 'Bits: 512; Processador (CPU): IBM Power PC TRIPLE CORE; Velocidade CPU: 3276.8 MHz; M�dias Compat�veis: DVD; Processador Gr�fico (GPU): ATI; Velocidade GPU: 500 MHz; Resolu��o M�xima: 1280 x 720 Pixels; Entradas para Controles: 4;', 'Microsoft X-Box 360', 0, 2300, 0, 40, 'categoria', 'X-Box 360 P.jpg');


--
-- TOC entry 1690 (class 0 OID 26485)
-- Dependencies: 1298
-- Data for Name: produtos_promocao; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1691 (class 0 OID 26487)
-- Dependencies: 1299
-- Data for Name: visitante; Type: TABLE DATA; Schema: public; Owner: postgres
--



-- Completed on 2008-02-10 19:38:13

--
-- PostgreSQL database dump complete
--

