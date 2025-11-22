package preparedStatement;

import connectionProvider.getOracleConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) {
        try{
            Connection connection= getOracleConnection.getConnection();
            String sql= String.format("UPDATE village SET v_leader= '%s' WHERE v_name='%s'","Misri Lal Bhagat", "Bhavdewa");

            PreparedStatement ps= connection.prepareStatement(sql);
            ps.executeUpdate();

            System.out.println("Data update Successfully");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
