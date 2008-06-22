/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.remote;

import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author João Henrique
 */
@Remote
public interface CompraRemote {
    Integer efetuarCompra(String login_cli, Map<Integer, Integer> mapProdutos);
}
