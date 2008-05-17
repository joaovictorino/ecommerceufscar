/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.bean;

import br.com.ecommerce.entity.Produtos;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Cliente
 */
@Remote
public interface ProdutoRemote {
    Produtos buscarProdutoPorId(Produtos produto);
    List<Produtos> listarProdutosParaUsuarios(Produtos produto);
    List<Produtos> listaProdutosPorId(List<Integer> ids);
}
