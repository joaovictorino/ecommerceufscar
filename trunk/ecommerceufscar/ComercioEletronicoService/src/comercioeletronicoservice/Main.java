/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioeletronicoservice;

import weka.associations.AprioriItemSet;
import weka.core.FastVector;
import weka.core.Instances;

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
            CustomInstanceQuery query = new CustomInstanceQuery();
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
