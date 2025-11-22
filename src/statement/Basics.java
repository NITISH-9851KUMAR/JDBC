package statement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import connectionProvider.*;

public class Basics {

    public static void main(String[] args) {

        try{

            Connection connection= getMySQLConnection.getConnection();

            Statement statement= connection.createStatement();
            String sql= "SELECT * FROM student";
            ResultSet r= statement.executeQuery(sql);

            if(r.next()){
                System.out.println(r.getString("name"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
