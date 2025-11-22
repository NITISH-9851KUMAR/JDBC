package BatchQuery;

import connectionProvider.getMySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementBQ {
    public static void main(String[] args) {

        try {
            Connection connection = getMySQLConnection.getConnection();
            Statement statement = connection.createStatement();

            StringBuilder sql = new StringBuilder();

            for (int i = 1; i < 201; i++) {

                sql.append("INSERT INTO village VALUES('village_")
                        .append(i) // " INSERT INTO village VALUES('village_1
                        .append("','Leader_") // " INSERT INTO village VALUES('village_1','Leader_
                        .append(i) // "INSERT INTO village VALUES('village_1', 'Leader_1
                        .append("')"); // "INSERT INTO village VALUES('village_1', 'Leader_1')"

                statement.addBatch(sql.toString());

                sql.setLength(0); // It set the length of sql Builder 0
                // It save memory to create 200 different sql query into memory
            }

            int[] rowAffect = statement.executeBatch();
            //query will store in array if all query execute then value is 1 1 1 1...
            //Those query will not execute store value in array 0

            int i = 0;
            while (i < 200) {
                if (rowAffect[i] == 0) {
                    System.out.println("Error in Batch Processing");
                    System.out.println("Error Position: " + (i + 1));
                }
                i++;
            }
            System.out.println("Batch Processing executed Successfully");
            System.out.println("Data save to the Database Successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
