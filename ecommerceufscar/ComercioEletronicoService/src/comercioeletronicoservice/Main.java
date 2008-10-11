/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioeletronicoservice;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;
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
            query.disconnectFromDatabase();
            CustomApriori apriori = new CustomApriori();
            apriori.setDelta(0.5);
            apriori.setLowerBoundMinSupport(0.1);
            apriori.setMinMetric(0.9);
            apriori.setNumRules(10);
            apriori.setOutputItemSets(false);
            apriori.setSignificanceLevel(-1.0);
            apriori.setUpperBoundMinSupport(1.0);
            apriori.setVerbose(false);
            apriori.buildAssociations(data);
            FastVector[] rules = apriori.getRules();
            System.out.println("modelo");
            System.out.println(apriori.toString());
            System.out.println("teste");
            
            Connection db;
            Statement sql;
            Class.forName("org.postgresql.Driver");
            db = DriverManager.getConnection("jdbc:postgresql:ecommerce", "postgre", "postgre");
            sql = db.createStatement();
            
            String sqlText = "insert into grupo_interesse(data_criacao) values("+new Date()+")";
            sql.executeUpdate(sqlText);
            
            String sqlTextCod = "select * from grupo_interesse order by oid desc limit 1 OFFSET 0 ";
            ResultSet results = sql.executeQuery(sqlTextCod);
            
            
            for(int i=0; i < rules.length - 1; i++){
                String sqlGrpTemProd = "insert into grp_tem_produto(cod_grupo,cod_produto,codproximoproduto) values("+results.getString("cod_grupo")+","+((AprioriItemSet)rules[0].elementAt(i)).toString(data)+","+((AprioriItemSet)rules[1].elementAt(i)).toString(data)+")";
                sql.executeUpdate(sqlGrpTemProd);
                //System.out.println(((AprioriItemSet)rules[0].elementAt(i)).toString(data) + " ==> " + ((AprioriItemSet)rules[1].elementAt(i)).toString(data));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
