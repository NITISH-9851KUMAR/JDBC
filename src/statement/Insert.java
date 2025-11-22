package statement;

import java.sql.*;
import connectionProvider.getMySQLConnection;

public class Insert {
    public static void main(String[] args) {

        try{
            Connection connection= getMySQLConnection.getConnection();
            Statement statement= connection.createStatement();

            String sql=String.format("INSERT INTO village VALUES('%s', '%s')", "Baidi", "Shatrahan Mukhiya");
            int rowAffect= statement.executeUpdate(sql);

            if(rowAffect>0){
                System.out.println("Date save to the Database");
            }else{
                System.out.println("Data doesn't save to the Database");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
