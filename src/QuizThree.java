public class QuizThree {
    private static String decimalToAnotherBase(int decimalNumber, int base){
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

}
