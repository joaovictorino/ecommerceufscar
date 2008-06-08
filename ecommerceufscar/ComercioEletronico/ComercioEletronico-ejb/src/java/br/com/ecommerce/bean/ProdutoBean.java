/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.bean;

import br.com.ecommerce.base.ProdutoBase;
import br.com.ecommerce.remote.ProdutoRemote;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Cliente
 */
@Stateless(mappedName="ProdutoBean")
@Remote({ProdutoRemote.class})
public class ProdutoBean extends ProdutoBase {
}
