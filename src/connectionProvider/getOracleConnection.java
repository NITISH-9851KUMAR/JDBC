package connectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;

public class getOracleConnection {
    private static final String url= "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String userName= "system";
    private static final String password= "nitish";

    static Connection connection= null;

    public static Connection getConnection(){
        try{
            if(connection==null){
                connection= DriverManager.getConnection(url, userName, password);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return connection;
    }

}
