package userinterface;

import businesslogic.Login;
import statistics.Statistics;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class CommandLineIO implements IOInterface {
    static Scanner scanner = new Scanner(System.in);
    public CommandLineIO(){

    }
    public static void promptLeaderboard(int userID, int score, int quizType){
    System.out.println("Would you like to see the leaderboard and statistics? (y/n)");
    String input = "";
    input = scanner.nextLine();     //prompts user input, asking to see the leaderboard
    if (input.equalsIgnoreCase("Y")) {
        Statistics.createLeaderboard(quizType);
    }
}

    public void clearScreen() {  //clears the CLI screen, giving the appearance of new pages
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int showSelectMode(boolean hasAskedAgain) {
        Scanner scanner = new Scanner(System.in); //creates scanner called scanner

        System.out.println("Select Game Mode: "); //prints to the terminal
        System.out.println("Press 1 if you would like to play Multiple Choice");
        System.out.println("Press 2 if you would like to play Random Questions");
        System.out.println("Press 3 if you would like to play Number Converter");

        if (hasAskedAgain){
            System.out.println("Error: Please enter 1, 2, or 3");
        }

        return(scanner.nextInt());
    }

    @Override
    public void showScore(String score) {
        System.out.println(score);
    }

    @Override
    public void showQuestion(String question) {
        System.out.println(question);
    }

    @Override
    public void showLeaderboard(ResultSet leaderboard, int gametype){
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
        System.out.println("The average score for this quiz is: " + Statistics.averageScore(gametype));
        System.out.println("The standard deviation for this quiz is: " + Statistics.standardDeviation(gametype));
    }

    @Override
    public boolean checkAnswer(String answer){
        System.out.println("Enter your answer:");
        String userAnswer = scanner.nextLine().toUpperCase();//prompts an answer and checks if the answer is correct
        if (userAnswer.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect!");
            return false;
        }
    }

    @Override
    public int promptLoginDetails(){
        System.out.println("-----Login-----");      //collects login details from the user with a CLI
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        clearScreen();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        clearScreen();
        int result = Login.authenticateUsername(username, password);
        if (result == 0) {
            System.out.println("The login details inputted are incorrect, please try again");
            return new CommandLineIO().promptLoginDetails();
        } else {
            return result;
        }
    }

}
