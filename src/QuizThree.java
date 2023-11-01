import java.util.Random;
import java.util.Scanner;

public class QuizThree {
    Scanner scanner = new Scanner(System.in);
    private static String decimalToAnotherBase(int decimalNumber, int base){
        if (base == 10){
            return String.valueOf(decimalNumber);//skips process if base is already decimal
        }
        String result = "";
        while (decimalNumber > 0) {
            int modTest = decimalNumber % base;//uses the calculation method as seen on comp org slides
            String currentDigit = "";
            switch(modTest){ // if case is 16, it needs these letters instead of numbers
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
                    currentDigit = String.valueOf(modTest);//if number is between 0-9 just add the String of the digit
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
        while (rightAnswer == true){ //keeps playing until a false answer is provided
            score += 1;
            difficulty += 1;
            System.out.println("Question: " + (score + 1));
            rightAnswer = askQuestion(difficulty, scanner);
        }
        Statistics.record(userID, score, 3); //stores the game record on the leaderboard
    }
    private static boolean askQuestion(int difficulty, Scanner scanner){
        int [] bases = {2, 8, 10, 16}; //all bases included, can be extended
        Random random = new Random();
        int baseFrom = 0;
        int baseTo = 0;
        while (baseFrom == baseTo) {
           baseFrom = bases[random.nextInt(bases.length)];
           baseTo = bases[random.nextInt(bases.length)];// chooses a random two bases which are different from each other 
        }
        int decimalQuestion = random.nextInt(1, 3*difficulty); //the higher the difficulty, the larger the number
        String numberFrom = decimalToAnotherBase(decimalQuestion, baseFrom);
        String numberTo = decimalToAnotherBase(decimalQuestion, baseTo);//converts both numbers to target base
        System.out.println("Convert " + numberFrom + " in base " + baseFrom + " to base " + baseTo);
        
        return numberTo.equals(scanner.nextLine()); //returns true if answer is correct
        
    }
}
