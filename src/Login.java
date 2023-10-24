import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
    public static int login(){
        return(promptLoginDetails());
    }
    private static int promptLoginDetails(){
        System.out.println("-----Login-----");
        System.out.println("Enter your username:");
        String username = App.scanner.nextLine();
        System.out.println("Enter your password:");
        String password = App.scanner.nextLine();
        int result = authenticateUsername(username, password);
        if (result == 0) {
            System.out.println("The login details inputed are incorrect, please try again");
            return promptLoginDetails();
        } else {
            return result;
        }
    }
    private static ResultSet executeSQL(String query){//this can be somewhere else - modularity
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
    private static int authenticateUsername(String username, String password){ 
        String query = "SELECT id FROM users WHERE username = '" + username + "' AND password = '" + password +"'";
        int user_id = 0;
        ResultSet sqlAnswer = executeSQL(query);
        try {
            if (!sqlAnswer.next()){
                sqlAnswer.close();
            }
            else{
                user_id = sqlAnswer.getInt("id");
                sqlAnswer.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return user_id;
    }
}
