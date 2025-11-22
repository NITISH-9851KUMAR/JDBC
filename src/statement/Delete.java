package statement;

import connectionProvider.getMySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        try{
            Connection connection= getMySQLConnection.getConnection();
            Statement statement= connection.createStatement();

            String sql= String.format("DELETE FROM village WHERE v_name='%s'", "Baidi");
            int rowAffect= statement.executeUpdate(sql);
            if(rowAffect>0){
                System.out.println("Deleted Table data Successfully");
            }else{
                System.out.println("Something went Wrong!");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
