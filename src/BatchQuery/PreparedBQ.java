package BatchQuery;

import java.sql.*;

import connectionProvider.getOracleConnection;

public class PreparedBQ {
    public static void main(String[] args) {

        try{
            Connection connection= getOracleConnection.getConnection();

            StringBuilder sql= new StringBuilder("INSERT INTO village(v_name, v_leader) VALUES(?, ?)");

            PreparedStatement ps= connection.prepareStatement(sql.toString());
            for(int i= 1; i<201; i++){

                ps.setString(1, "village_"+i);
                ps.setString(2, "leader_"+i);

                ps.addBatch();
            }

            ps.executeBatch();

            System.out.println("Batch Processing executed Successfully");
            System.out.println("Data save to the Database Successfully");

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
