/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comercioeletronicoservice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import weka.experiment.InstanceQuery;

/**
 *
 * @author João Henrique
 */
public class CustomInstanceQuery extends InstanceQuery{
    
    public CustomInstanceQuery() throws Exception {
        super();
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        ResultSet rs = null;
        try {
            CallableStatement proc = this.m_Connection.prepareCall("{ ? = call fProcessaClientesWeka() }");
            proc.registerOutParameter(1, Types.OTHER);
            proc.execute();
            rs = (ResultSet) proc.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public void disconnectFromDatabase() throws Exception {
        if (m_Connection != null)
        {
            this.m_Connection.commit();
            this.m_Connection.close();
            this.m_Connection = null;
        }
    }

    @Override
    public void connectToDatabase() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/ecommerce";
        String driver = "org.postgresql.Driver";
        String userName = "postgres";
        String password = "postgres";
        Class.forName(driver).newInstance();
        this.m_Connection = DriverManager.getConnection(url, userName, password);
        this.m_Connection.setAutoCommit(false);
    }

    @Override
    public boolean execute(String arg0) throws SQLException {
        return true;
    }
}
