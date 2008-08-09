/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comercioeletronicoservice;

import weka.associations.Apriori;
import weka.core.FastVector;

/**
 *
 * @author João Henrique
 */
public class CustomApriori extends Apriori {
    public FastVector[] getRules(){
        return this.m_allTheRules;
    }
}
