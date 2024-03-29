-- Function: fprocessaclientesweka()

-- DROP FUNCTION fprocessaclientesweka();

CREATE OR REPLACE FUNCTION fprocessaclientesweka()
  RETURNS refcursor AS
$BODY$
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
$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION fprocessaclientesweka() OWNER TO postgres;
