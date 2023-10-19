import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    public static int login(){
        return promptLoginDetails();
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

    private static int authenticateUsername(String username, String password){
        String query = "SELECT id FROM users WHERE username = '" + username
        + "' AND password = '" + password + "'";
        int user_id = 0;
        ResultSet sqlAnswer = Database.executeSQL(query);
        try {
            if (!sqlAnswer.next()){
                sqlAnswer.close();
            } else {
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
