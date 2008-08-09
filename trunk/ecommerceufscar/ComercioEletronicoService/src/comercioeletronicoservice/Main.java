/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comercioeletronicoservice;

import weka.associations.AprioriItemSet;
import weka.core.FastVector;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

/**
 *
 * @author João Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            InstanceQuery query = new InstanceQuery();
            query.setUsername("postgres");
            query.setPassword("postgres");
            String  sql =   "select c.login_cli, p.categoria ";
                    sql +=  "from itens_compras i, compras c, produtos p ";
                    sql +=  "where i.num_compra = c.num_compra ";
                    sql +=  "and i.cod_produto = p.cod_produto ";
                    sql +=  "order by login_cli ";
                    sql +=  "limit 10";
            query.setQuery(sql);
            Instances data = query.retrieveInstances();
            CustomApriori apriori = new CustomApriori();
            apriori.setNumRules(10);
            apriori.setMinMetric(0.1);
            apriori.buildAssociations(data);
            FastVector[] rules = apriori.getRules();
                        System.out.println("modelo");
            System.out.println(apriori.toString());
            System.out.println("teste");
            for(int i=0; i < rules.length - 1; i++){
                System.out.println(((AprioriItemSet)rules[0].elementAt(i)).toString(data) + " ==> " + ((AprioriItemSet)rules[1].elementAt(i)).toString(data));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
