package connectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getMySQLConnection {
    private static final String url= "jdbc:mysql://127.0.0.1:3306/jdbc";
    private static final String userName= "root";
    private static final String password= "Nitish@04";

    static Connection connection= null;

    public static Connection getConnection(){
        try{
            connection= DriverManager.getConnection(url, userName, password);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
