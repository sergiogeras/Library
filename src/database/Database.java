package database;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Сергей on 03.06.2015.
 */
public class Database {
    private static Connection conn;
    private static InitialContext ic;
    private static DataSource ds;

    public static Connection getConnection() {
        try{
            ic =new InitialContext();
            ds =(DataSource) ic.lookup("jdbc/Library");
            conn = ds.getConnection();
        } catch (NamingException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    }
}
