import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    /**
     * Executes a SQL query and returns the result
     * @param query
     * @return result
     */
        public static ResultSet returnSQL(String query){
        Connection conn = null;
        ResultSet result = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:database.db");
            System.out.println("Connected to java");
            statement = conn.createStatement();
            result = statement.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
         }
            return result;
        }

        public static void insertSQL(String query){
            Connection conn = null;
            Statement statement = null;
            try {
                conn = DriverManager.getConnection("jdbc:sqlite:database.db");
                System.out.println("Connected to java");
                statement = conn.createStatement();
                statement.executeUpdate(query);
            } catch (SQLException e) {
                System.err.println("SQL Error: " + e.getMessage());
                e.printStackTrace();
            }
            }
}
