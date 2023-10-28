import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int userID = Login.login();
        System.out.println("Welcome to the quiz app");
        SelectGameType.selectGameMode(userID);

    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
