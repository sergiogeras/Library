package testjdbc;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Сергей on 03.06.2015.
 */
public class TestConnection {
    public void check(){
        try{
            InitialContext ic=new InitialContext();
            DataSource ds=(DataSource)ic.lookup("java:comp/jdbc/Library");
            Connection connection=ds.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from book");
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e){
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE,null,e);
        } catch (Exception e){
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
