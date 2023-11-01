import java.sql.ResultSet;
import java.sql.SQLException;
public class Statistics {
    private Statistics() {            // stops this utility class being used as a constructor
        throw new IllegalStateException("Utility Class");
    }
    public static void record(int userID, int score, int quizType) {
    String query = "INSERT INTO games_played (user_id, score, quiz_type) VALUES (" + userID + ", " + score + ", " + quizType +")";
    Database.insertSQL(query); //adds record of the game to the database
    System.out.println("Would you like to see the leaderboard and statistics? (y/n)");
    String input = "";
    input = App.scanner.nextLine();     //prompts user input, asking to see the leaderboard
    if (input.equalsIgnoreCase("Y")) { 
        showLeaderboard(quizType);
    }
}
    public static void showLeaderboard(int gametype){
        String query = "SELECT games_played.score, users.username FROM games_played" 
            + " INNER JOIN users ON games_played.user_id = users.id WHERE games_played.quiz_type =" 
            + gametype + " ORDER BY games_played.score DESC LIMIT 10"; //SQL prompt for a "top ten" style leaderboard
        ResultSet leaderboard = Database.returnSQL(query); //executes SQL
        int count = 1;
        try {
            while (leaderboard.next()) {
                String username = leaderboard.getString("username");
                int score = leaderboard.getInt("score");
                System.out.println(count + ". User: " + username + "\t Score: " + score);
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("The average score for this quiz is: " + averageScore(gametype));
        System.out.println("The standard deviation for this quiz is: " + standardDeviation(gametype));
    }

    private static double averageScore(int gametype){
        String query = "SELECT AVG(score) FROM games_played WHERE quiz_type = " + gametype; //SQL prompt for the average score
        ResultSet average = Database.returnSQL(query); //executes SQL
        double averageScore = 0;
        try {
            if (average.next()) {
                averageScore = average.getDouble("AVG(score)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return averageScore;
    }
    private static double standardDeviation(int gametype){
        String query = "SELECT score FROM games_played WHERE quiz_type = " + gametype;
        ResultSet scores = Database.returnSQL(query);
        double sum = 0;
        double squareSum = 0;
        int count = 0;
        try {
            while (scores.next()) {
                int score = scores.getInt("score");
                sum += score;
                squareSum += score * score;
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        double mean = sum / count;
        double variance = squareSum / count - mean * mean;
        return Math.sqrt(variance);
    }
}

