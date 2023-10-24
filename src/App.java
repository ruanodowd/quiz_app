import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int userID = Login.login();
        System.out.println("Welcome to the quiz app");
        quizRandom.startQuiz(userID);
        scanner.close();

    }
}
