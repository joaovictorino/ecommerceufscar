/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.bean;

import br.com.ecommerce.entity.Pessoa;
import javax.ejb.Remote;

/**
 *
 * @author Cliente
 */
@Remote
public interface PessoaRemote {
    boolean salvar(Pessoa pessoa);
    boolean loginAdm(Pessoa pessoa);
    boolean loginCliente(Pessoa pessoa);
    Pessoa getPessoaByLogin(Pessoa pessoa);
}
