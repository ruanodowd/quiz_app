package question;

import java.util.Random;

public class QuestionBaseConverter extends Question{
    private int baseFrom;
    private int baseTo;
    public QuestionBaseConverter(int difficulty, int difficultyIncrease){
        super();
        int [] bases = {2, 8, 10, 16}; //all bases included, can be extended
        Random random = new Random();
        int baseFrom = 0;
        int baseTo = 0;
        while (baseFrom == baseTo) {
            baseFrom = bases[random.nextInt(bases.length)];
            baseTo = bases[random.nextInt(bases.length)];// chooses a random two bases which are different from each other
        }
        int decimalQuestion = random.nextInt(1, difficultyIncrease*difficulty); //the higher the difficulty, the larger the number
        this.question = decimalToAnotherBase(decimalQuestion, baseFrom);
        this.correctAnswer = decimalToAnotherBase(decimalQuestion, baseTo);//converts both numbers to target base
        this.baseFrom = baseFrom;
        this.baseTo = baseTo;
    }

    @Override
    public String ListQuestion(){
        return ("Convert " + question + " in base " + baseFrom + " to base " + baseTo);
    }

    private static String decimalToAnotherBase(int decimalNumber, int base){
        String result =  "";
        if (base == 10){
            result = String.valueOf(decimalNumber);//skips process if base is already decimal
        }
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
}
