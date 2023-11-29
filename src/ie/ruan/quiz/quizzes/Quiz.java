package quizzes;

import question.Question;
import statistics.Statistics;
import userinterface.CommandLineIO;
import userinterface.IOInterface;

public abstract class Quiz {
    private int quizType;
    private int totalQuestions = 10;
    public void startQuiz(IOInterface IO, int userID){//runs the quiz and then returns to statistics
        int finalScore = runQuiz(IO);
        Statistics.record(IO, userID, finalScore, quizType);
    }
    public int runQuiz(IOInterface IO) {
        Question[] questions = createQuestionArray(totalQuestions); //creates an array with space for 10 questions
        int score = 0;
        // picks a random question out of 18, adds it to a list of used questions and asks it, then increments score if correct
        for (int i = 0; i < questions.length-1; i++) {//should it me -1?

            IO.clearScreen();
            IO.showQuestion(questions[i].ListQuestion());
            boolean answer = new CommandLineIO().checkAnswer(questions[i].getCorrectAnswer());
            if (answer) {
                score++;
            }
            IO.showScore("Your score is: " + score);
        }
        return score;
    }

    abstract Question[] createQuestionArray(int amount);

}
