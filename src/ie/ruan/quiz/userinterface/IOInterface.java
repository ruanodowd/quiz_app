package userinterface;

import java.sql.ResultSet;

public interface IOInterface {

    void clearScreen();
    void showScore(String score);

    void showQuestion(String question);

    void showLeaderboard(ResultSet leaderboard, int gametype);

    boolean checkAnswer(String answer);

    int promptLoginDetails();

    int showSelectMode(boolean hasAskedAgain);


}
