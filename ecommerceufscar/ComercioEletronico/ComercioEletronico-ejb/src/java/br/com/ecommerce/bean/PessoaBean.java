/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.bean;

import br.com.ecommerce.base.PessoaBase;
import br.com.ecommerce.remote.PessoaRemote;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Cliente
 */
@Stateless(mappedName="PessoaBean")
@Remote({PessoaRemote.class})
public class PessoaBean extends PessoaBase {
}
