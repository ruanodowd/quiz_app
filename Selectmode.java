package EpicEndeavourFinal;
import java.util.Scanner; //imports scanner

public class Selectmode {

	public  void selectmode() {
		
		Scanner scanner = new Scanner(System.in); //creates scanner called scanner
		System.out.println("Select Game Mode: "); //prints to the therminal
		System.out.println("Press 1 if you would like to play Multiple Choice");
		System.out.println("Press 2 if you would like to play Random Questions");
		System.out.println("Press 3 if you would like to play Number Converter");
		
		int gameChoice = scanner.nextInt();
		
		
		switch (gameChoice) { //reads the input from the user then redirects to their chosen game
		case 1:
			 quiztest quiz = new quiztest();
			quiz.startQuiz();
			break;
		case 2:
			/// add code to start game 2
			break;
		case 3:
			// add code to start game 3
			break;
			default:
				System.out.println("Invalid please select a valid gamemode");
			
		
		scanner.close(); //closes scanner

		
		
		
		
		
		}
		
	}

}
