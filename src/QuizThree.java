import java.util.Random;
import java.util.Scanner;

public class QuizThree {
    private static String decimalToAnotherBase(int decimalNumber, int base){
        if (base == 10){
            return String.valueOf(decimalNumber);
        }
        String result = "";
        while (decimalNumber > 0) {
            int modTest = decimalNumber % base;
            String currentDigit = "";
            switch(modTest){
                case 10:
                    currentDigit = "A";
                    break;
                case 11:
                    currentDigit = "B";
                    break;
                case 12:
                    currentDigit = "C";
                    break;
                case 13:
                    currentDigit = "D";
                    break;
                case 14:
                    currentDigit = "E";
                    break;
                case 15:
                    currentDigit = "F";
                    break;
                default:
                    currentDigit = String.valueOf(modTest);
            }
            decimalNumber /= base;
            result = currentDigit + result;
            }
            return result;
        }
    public static void startQuiz(int userID){
        int score = -1;
        int difficulty = 1;
        Scanner scanner = new Scanner(System.in);
        boolean rightAnswer = true;
        while (rightAnswer == true){
            score += 1;
            difficulty += 1;
            System.out.println("Question: " + (score + 1));
            rightAnswer = askQuestion(difficulty, scanner);
        }
        scanner.close();
        Statistics.record(userID, score, 3);
    }
    private static boolean askQuestion(int difficulty, Scanner scanner){
        int [] bases = {2, 8, 10, 16};
        Random random = new Random();
        int baseFrom = 0;
        int baseTo = 0;
        while (baseFrom == baseTo) {
           baseFrom = bases[random.nextInt(bases.length)];
           baseTo = bases[random.nextInt(bases.length)];
        }
        int decimalQuestion = random.nextInt(1, 2*difficulty);
        String numberFrom = decimalToAnotherBase(decimalQuestion, baseFrom);
        String numberTo = decimalToAnotherBase(decimalQuestion, baseTo);
        System.out.println("Convert " + numberFrom + " in base " + baseFrom + " to base " + baseTo);
        if (numberTo.equals(scanner.nextLine())) {
            return true;
        } else {
            return false;
        }
    }
}
