package preparedStatement;

import connectionProvider.getOracleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {

    public static void main(String[] args) {

        try {

            // get connection from getOracleConnection class
            Connection connection = getOracleConnection.getConnection();

            // Write the SQL Query
            String sql = String.format("CREATE TABLE village (v_name VARCHAR(20), V_leader VARCHAR(20))");

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();

            System.out.println("Table Created Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
