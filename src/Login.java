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
        App.clearScreen();
        System.out.println("Enter your password:");
        String password = App.scanner.nextLine();
        App.clearScreen();
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
        int userId = 0;
        ResultSet sqlAnswer = Database.returnSQL(query);
        try {
            if (!sqlAnswer.next()){
                sqlAnswer.close();
            } else {
                userId = sqlAnswer.getInt("id");
                sqlAnswer.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return userId;
    }
}
