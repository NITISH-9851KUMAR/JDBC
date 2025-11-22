package statement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import connectionProvider.*;

public class Create {

    public static void main(String[] args) {

        try{

            // get connection from getMySQLConnection class
            Connection connection= getMySQLConnection.getConnection();

            // Basics of the connection and store into statement
            Statement statement= connection.createStatement();

            String sql= "CREATE TABLE village (v_name VARCHAR(20), V_leader VARCHAR(20) )";
            int rowAffect= statement.executeUpdate(sql);

            if(rowAffect>0){
                System.out.println("Table Created Successfully");
            }else{
                System.out.println("Table is Not Created!");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
