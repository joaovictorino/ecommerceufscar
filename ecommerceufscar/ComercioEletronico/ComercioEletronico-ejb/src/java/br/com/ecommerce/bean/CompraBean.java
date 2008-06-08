/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.bean;

import br.com.ecommerce.base.CompraBase;
import br.com.ecommerce.remote.CompraRemote;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author João Henrique
 */
@Stateless(mappedName = "CompraBean")
@Remote({CompraRemote.class})
public class CompraBean extends CompraBase {
}
