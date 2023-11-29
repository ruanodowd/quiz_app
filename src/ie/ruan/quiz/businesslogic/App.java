package businesslogic;

import userinterface.CommandLineIO;
import userinterface.IOInterface;

import java.util.Scanner;

public class App {
    static public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        IOInterface IO = new CommandLineIO();
        int userID = Login.login(IO);
        SelectMode.selectMode(IO, userID);

    }
}
