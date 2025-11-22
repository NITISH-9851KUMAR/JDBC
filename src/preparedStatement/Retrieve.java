package preparedStatement;

import connectionProvider.getOracleConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Retrieve {
    public static void main(String[] args) {
        try{
            Connection connection= getOracleConnection.getConnection();
            String sql= "SELECT * FROM village";

            PreparedStatement ps= connection.prepareStatement(sql);
            ResultSet resultSet= ps.executeQuery();

            while (resultSet.next()){
                System.out.println("v_name: "+resultSet.getString("v_name"));
                System.out.println("v_leader: "+resultSet.getString("v_leader")+"\n");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
