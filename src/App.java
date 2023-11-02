import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int userID = Login.login();
        Selectmode.selectmode(userID);

    }
    public static void clearScreen() {  //clears the CLI screen, giving the appearance of new pages
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void finishGame(int userID){  // allows the user to play again or logout
        System.out.println("Press Q to logout and P to play again");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Q")){
            System.out.println("You have been logged out");
            Login.login();
        }
        else if (input.equalsIgnoreCase("P")){
            Selectmode.selectmode(userID);
        }
        else{
            System.out.println("Invalid input");
            finishGame(userID);
        }
    }
}
