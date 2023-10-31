import java.sql.ResultSet;
import java.sql.SQLException;
public class Statistics {
    public static void record(int userID, int score, int quizType) {
    String query = "INSERT INTO games_played (user_id, score, quiz_type) VALUES (" + userID + ", " + score + ", " + quizType +")";
    Database.insertSQL(query);
    System.out.println("Would you like to see the leaderboard? (y/n)");
    String input = " ";
    input = App.scanner.nextLine();
    if (input.toUpperCase().equals("Y")) {
        showLeaderboard(quizType);
    }
}
    public static void showLeaderboard(int gametype){
        String query = "SELECT games_played.score, users.username FROM games_played INNER JOIN users ON games_played.user_id = users.id WHERE games_played.quiz_type =" + gametype + " ORDER BY games_played.score DESC LIMIT 10";
        ResultSet leaderboard = Database.returnSQL(query);
        try {
            while (leaderboard.next()) {
                String username = leaderboard.getString("username");
                int score = leaderboard.getInt("score");
                System.out.println("Username: " + username + " Score: " + score);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

