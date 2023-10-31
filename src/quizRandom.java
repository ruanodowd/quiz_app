import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuizRandom {
    Scanner scanner = new Scanner(System.in);
    public static void startQuiz(int userID){
        int finalScore = runQuiz();
        Statistics.record(userID, finalScore, 2);
    }
    private static int runQuiz(){
        Random random = new Random();
        int[] previousQuestions = new int[10];
        int score = 0;
        System.out.println("---- Quiz 2 ----");
        Question question;
        for (int i = 0; i < 10; i++) {
            int randomQuestionID;
            do {
                randomQuestionID = random.nextInt(18) + 1;
            } while (Arrays.asList(previousQuestions).contains(randomQuestionID));
            previousQuestions[i] = randomQuestionID;
            question = new Question(randomQuestionID);
            App.clearScreen();
            System.out.println(question.listQuestion());
            boolean answer = checkAnswer(question.getCorrectAnswer());
            if (answer) {
                score++;
            }
            System.out.println("Your score is: " + score);
        }
                return score;
            }
            
            private static boolean checkAnswer(String answer){
                System.out.println("Enter your answer:");
                String userAnswer = App.scanner.nextLine().toUpperCase();
                if (userAnswer.equals(answer)) {
                    System.out.println("Correct!");
                return true;
                } else {
                    System.out.println("Incorrect!");
                    return false;
                }
            }
        }
