package EpicIndeavour;
import java.util.Scanner;

public class selectType {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select Game Mode: ");
		System.out.println("Press 1 if you would like to play Oisin's Game");
		System.out.println("Press 2 if you would like to play Ruan's Game");
		System.out.println("Press 3 if you would like to play multiple the chase");
		
		int gameChoice = scanner.nextInt();
		
		
		switch (gameChoice) {
		case 1:
			class2Questions.game1();
			break;
		case 2:
			/// add code to start game 2
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
