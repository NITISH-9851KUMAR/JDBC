package statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connectionProvider.getMySQLConnection;

public class Basic {
    public static void main(String[] args) {

        try{

            Connection connection= getMySQLConnection.getConnection();
            Statement statement= connection.createStatement();

            String sql= "";

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
