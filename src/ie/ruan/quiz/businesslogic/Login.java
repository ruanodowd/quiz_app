package businesslogic;

import database.Database;
import userinterface.IOInterface;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private Login() {            // stops this utility class being used as a constructor
        throw new IllegalStateException("Utility Class");
    }
    public static int login(IOInterface IO){
        return IO.promptLoginDetails();
    }

    public static int authenticateUsername(String username, String password){
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
