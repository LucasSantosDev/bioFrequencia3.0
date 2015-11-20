package br.com.biofrequencia.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pindorama
 */
public class connection {
    
    private Connection con;

    public Connection con() throws ClassNotFoundException, SQLException {
        try {   
           Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
           con = DriverManager.getConnection("jdbc:derby:bioFrequencia", "wurzel", "root");
           System.out.println("Conectado");
       } catch(ClassNotFoundException e) {
           System.out.println(e.getMessage());
       } catch(SQLException e) {
           System.out.println(e.getMessage());
       } finally {
            return con;
        }
    }
}
