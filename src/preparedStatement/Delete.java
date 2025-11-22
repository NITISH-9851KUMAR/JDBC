package preparedStatement;

import connectionProvider.getOracleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) {
        try {
            Connection connection = getOracleConnection.getConnection();

            String sql = String.format("DELETE FROM village WHERE v_name='%s'", "Baidi");

            PreparedStatement ps= connection.prepareStatement(sql);
            ps.executeUpdate();

            System.out.println("Drop Table data Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
