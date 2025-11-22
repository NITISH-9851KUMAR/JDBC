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
                System.out.println("Village Name: "+resultSet.getString("v_name"));
                System.out.println("Village Leader: "+resultSet.getString("v_leader")+"\n");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
