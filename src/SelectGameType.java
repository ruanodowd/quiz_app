
import java.util.Scanner;

public class SelectGameType {

	public static void selectGameMode(int userID) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select Game Mode: ");
		System.out.println("Press 1 if you would like to play Oisin's Game");
		System.out.println("Press 2 if you would like to play Ruan's Game");
		System.out.println("Press 3 if you would like to play multiple the chase");
		
		int gameChoice = scanner.nextInt();
		
		switch (gameChoice) {
		case 1:
			QuizLinear.game1(userID);
			break;
		case 2:
			QuizRandom.startQuiz(userID);
			break;
		case 3:
			// add code to start game 3
			break;
			default:
				System.out.println("Invalid please select a valid gamemode");
			
		scanner.close();
		
		
		
		
		
		
		}
		
	}

}
