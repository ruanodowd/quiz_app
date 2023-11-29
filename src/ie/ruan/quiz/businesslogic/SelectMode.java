package businesslogic;

import quizzes.QuizBaseConverter;
import quizzes.QuizInOrder;
import quizzes.QuizRandom;
import userinterface.IOInterface;

public class SelectMode {

	public static void selectMode(IOInterface IO, int userID) {
		switch (IO.showSelectMode(false)) { //reads the input from the user then redirects to their chosen game
		case 1:
			QuizInOrder quizInOrder = new QuizInOrder();
			quizInOrder.startQuiz(IO, userID);
			break;
		case 2:
			/// add code to start game 2
			QuizRandom quizRandom = new QuizRandom();
			quizRandom.startQuiz(IO, userID);
			break;
		case 3:
			// add code to start game 3
			QuizBaseConverter quizThree = new QuizBaseConverter();
			quizThree.startQuiz(IO, userID);
			break;
			default:
				IO.showSelectMode(false);
		}
	}
}
