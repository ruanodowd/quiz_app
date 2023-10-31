import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int userID = Login.login();
        SelectMode selectMode = new SelectMode();
        selectMode.setupGUI();

    }
    public static void clearScreen() {  //clears the CLI screen, giving the appearance of new pages
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
