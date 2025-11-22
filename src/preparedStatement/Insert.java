package preparedStatement;

import connectionProvider.getOracleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {

        try {
            Connection connection = getOracleConnection.getConnection();

            String sql = String.format("INSERT INTO village VALUES('%s', '%s')", "Baidi", "Nirmal Kumar Roy");

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();

            System.out.println("Data save to the DB Successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
