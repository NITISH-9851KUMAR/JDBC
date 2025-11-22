package preparedStatement;

import connectionProvider.getOracleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Basic {
    public static void main(String[] args) {

        try{

            Connection connection= getOracleConnection.getConnection();
            String sql= "";

            // In PreparedStatement first we write sql and then create PreparedStatement
            PreparedStatement preparedStatement= connection.prepareStatement(sql);

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
