import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private Login() {            // stops this utility class being used as a constructor
        throw new IllegalStateException("Utility Class");
    }
    public static int login(){
        return promptLoginDetails();
    }
    private static int promptLoginDetails(){
        System.out.println("-----Login-----");      //collects login details from the user with a CLI
        System.out.println("Enter your username:");
        String username = App.scanner.nextLine();
        App.clearScreen();
        System.out.println("Enter your password:");
        String password = App.scanner.nextLine();
        App.clearScreen();
        int result = authenticateUsername(username, password);  //runs the method below to chec
        if (result == 0) {
            System.out.println("The login details inputed are incorrect, please try again");
            return promptLoginDetails();
        } else {
            return result;
        }
    }

    private static int authenticateUsername(String username, String password){
        String query = "SELECT id FROM users WHERE username = '" + username
        + "' AND password = '" + password + "'";    //constructs the SQL query
        int userId = 0;
        ResultSet sqlAnswer = Database.returnSQL(query);    //executes the SQL query
        try {
            if (!sqlAnswer.next()){
                sqlAnswer.close();
            } else {
                userId = sqlAnswer.getInt("id");
                sqlAnswer.close();                 //retrieves the userID from the returned ResultSet
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("SQL Error: " + e.getMessage());
        }
        return userId;
    }
}
