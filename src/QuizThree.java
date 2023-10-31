import java.util.Random;

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
        int questionNumber = 0;
        int difficulty = 2;
        boolean rightAnswer = true;
        while (rightAnswer = true){
            questionNumber += 1;
            difficulty += 1;
            System.out.println("Question: " + questionNumber );
            rightAnswer = askQuestion(difficulty);
        }
        return;
        //Statistics.record(userID, questionNumber - 1, 3);
    }
    private static boolean askQuestion(int difficulty){
        int [] bases = {2, 8, 10, 16};
        Random random = new Random();
        int baseFrom = 0;
        int baseTo = 0;
        while (baseFrom == baseTo) {
           baseFrom = bases[random.nextInt(bases.length)];
           baseTo = bases[random.nextInt(bases.length)];
        }
        
        return true;
    }
    public static void main(String[] args) {
        startQuiz(17);
    }
}
