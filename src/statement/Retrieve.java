package statement;

import java.sql.*;
import connectionProvider.getMySQLConnection;

public class Retrieve {
    public static void main(String[] args) {
        try{
            Connection connection= getMySQLConnection.getConnection();
            Statement statement= connection.createStatement();

            String sql= "SELECT * FROM village";
            ResultSet resultSet= statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("v_name: "+resultSet.getString("v_name"));
                System.out.println("v_leader: "+resultSet.getString("v_leader"));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
