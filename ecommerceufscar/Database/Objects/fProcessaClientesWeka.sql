CREATE OR REPLACE FUNCTION fProcessaClientesWeka() RETURNS refcursor
AS $$
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
	ref refcursor;
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

	OPEN ref FOR 	select 	p0.nome_produto as nome0,
				p1.nome_produto as nome1,
				p2.nome_produto as nome2,
				p3.nome_produto as nome3,
				p4.nome_produto as nome4,
				p5.nome_produto as nome5,
				p6.nome_produto as nome6,
				p7.nome_produto as nome7,
				p8.nome_produto as nome8,
				p9.nome_produto as nome9
			from	processamento_clientes_weka pcw,
				produtos p0,
				produtos p1,
				produtos p2,
				produtos p3,
				produtos p4,
				produtos p5,
				produtos p6,
				produtos p7,
				produtos p8,
				produtos p9
			where pcw."codProduto0" = p0.cod_produto
			and pcw."codProduto1" = p1.cod_produto
			and pcw."codProduto2" = p2.cod_produto
			and pcw."codProduto3" = p3.cod_produto
			and pcw."codProduto4" = p4.cod_produto
			and pcw."codProduto5" = p5.cod_produto
			and pcw."codProduto6" = p6.cod_produto
			and pcw."codProduto7" = p7.cod_produto
			and pcw."codProduto8" = p8.cod_produto
			and pcw."codProduto9" = p9.cod_produto
			and pcw.data_inclusao = dtAtual;

	RETURN ref;
END;
$$ LANGUAGE plpgsql;