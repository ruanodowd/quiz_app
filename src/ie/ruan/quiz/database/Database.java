package database;

import java.sql.*;


public class Database {

    private Database() {            // stops this utility class being used as a constructor
        throw new IllegalStateException("Utility Class");
    }
    public static ResultSet returnSQL(String query){
        //JDBC has one method for retrieving sql data and one for updating a table, this method uses the return function
        Connection conn = null;
        ResultSet result = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:database.db");
            statement = conn.createStatement();
            result = statement.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
            }
            return result;
        }

    public static void insertSQL(String query){ //uses the update method to add values to the SQL database
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:database.db");
            statement = conn.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        }
        }
}
