import java.util.Scanner; //imports scanner

public class Selectmode {

	public static void selectmode(int userID) {
		
		Scanner scanner = new Scanner(System.in); //creates scanner called scanner
		System.out.println("Select Game Mode: "); //prints to the therminal
		System.out.println("Press 1 if you would like to play Multiple Choice");
		System.out.println("Press 2 if you would like to play Random Questions");
		System.out.println("Press 3 if you would like to play Number Converter");
		
		int gameChoice = scanner.nextInt();
		
		
		switch (gameChoice) { //reads the input from the user then redirects to their chosen game
		case 1:
			 QuizInOrder quiz = new QuizInOrder();
			quiz.startQuiz(userID);
			break;
		case 2:
			/// add code to start game 2
            QuizRandom.startQuiz(userID);
			break;
		case 3:
			// add code to start game 3
            QuizThree.startQuiz(userID);
			break;
			default:
				System.out.println("Invalid please select a valid gamemode");
			
		
		scanner.close(); //closes scanner

		
		
		
		
		
		}
		
	}

}
