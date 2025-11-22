package statement;

import connectionProvider.getMySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        try{
            Connection connection= getMySQLConnection.getConnection();
            Statement statement= connection.createStatement();

            String sql= String.format("UPDATE village SET v_leader= '%s' WHERE v_name='%s'","Nirmal Kumar Roy", "Eni");
            int rowAffect= statement.executeUpdate(sql);
            if(rowAffect>0){
                System.out.println("Update Table data Successfully");
            }else{
                System.out.println("Something went Wrong!");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
