/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.bean;

import br.com.ecommerce.entity.Pessoa;
import br.com.ecommerce.remote.PessoaRemote;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Cliente
 */
@Stateless(mappedName="PessoaBean")
@Remote({PessoaRemote.class})
public class PessoaBean implements PessoaRemote {
    @PersistenceContext(unitName = "ComercioEletronico-ejbPU")
    private EntityManager em;

    public boolean salvar(Pessoa pessoa) {
        try {
            em.persist(pessoa);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean loginAdm(Pessoa pessoa){
        Pessoa result = this.getPessoaByLogin(pessoa);
        if (result != null && result.getAdministrador() != null && pessoa.getSenha().equals(result.getSenha())){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean loginCliente(Pessoa pessoa){
        Pessoa result = this.getPessoaByLogin(pessoa);
        if (result != null && result.getCliente() != null && pessoa.getSenha().equals(result.getSenha())){
            return true;
        }else{
            return false;
        }
    }
    
    public Pessoa getPessoaByLogin(Pessoa pessoa){
        Pessoa result = null;
        if (!pessoa.getLoginPes().equals("")){
            try {
                Query query = em.createNamedQuery("Pessoa.findByLoginPes");
                query.setParameter("loginPes", pessoa.getLoginPes());
                result = (Pessoa)query.getSingleResult();
            }catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return result;
    }
}
