import java.util.Scanner;  //imports the scanner class for java.util package

public class quiztest {
    
    String[] questions = { //This creates an array of questions for the quiz
            "What does ::= denote?",
			"What does ≡  mean?",
			"What does \"BNF\" stand for in the context of computer science and formal grammar?",
			"what does the acronym \"NAND\" represent?",
			"In computer science, what does Boolean logic refer to?",
			"In computer science, what is a lattice? ",
			"Which branch of logic is often used in discrete mathematics for representing and analyzing statements",
			"What does the negation operator do",
			"Which of the following isn't a prosition",
			"What does the biconditional statement 𝑝 ↔ q mean?",
			"What is a matrix",
			"You encounter two people, A and B, from the same island, where knights always tell the truth, and knaves always lie. A and B make the following statements, A says B is a knave. B says at least one of us is a knave, What are A and B? ",
			"Moore's Law is defined as",
			"The Von Neumann bottleneck is defined as",
			"What is level 1 in the Contemporary Multilevel Machine",
			"How many bits are in a byte",
			"How many values does the hexadecimal System use",
			"What does range mean"
			
          };
    String[][] options = { // creates a 2d array to store answers
            {"Grammer rule", "The beginning of a comment in code.", "A mathematical operation for calculating square roots", "A binary operator used for logical AND. "},
            {"A symbol indicating greater than", "denotes equivalence", "means not equal to", "means greater than or equals to"},
            {"Basic Normal Form", "Binary-Natural Factorization", "Backus-Naur Form", "Branch and Flow Notation"},
            {" National Association of Network Designers", "Not A Number", "JNegated AND", "Non-Aligned Data"},
            {"A programming language used for scientific calculations", "A system of mathematics dealing with complex numbers", "A mathematical system for handling true and false values", "A type of logic used only in quantum computing"},
            {"A mathematical structure that represents graphs", "A data structure used to store integers", "A formal specification for programming languages", "A partially ordered set where every pair of elements has a unique least upper bound and greatest lower bound"},
            {"Boolean logic", "Fuzzy logic", " Modal logic", "Quantum logic"},
            {"It converts a string to an integer", "It performs subtraction between two numbers", "reverses the meaning of its operand", "It concatenates two strings together"},
            {"My car is red", "Galway is in ireland", "Are you having a nice day?", " 2+2=4"},
            {" p implies q and q implies p", " P is equal to q", "P and q have similar values", "P is not equal to q"},
            {"A geometric shape with four equal side", " A system of equations", " A matrix is a rectangular array of numbers", "A type of polynomial equation"},
            {"A is a kinght and b is a knave", " There both knights ", "There both knaves", "A is a knave and b is a knight"},
            {"The principle that the speed and capability of computers can be expected to double every two years", "An observation made by Gordon Moore", "About the increasing number of transistors on a microchip", "Leading to smaller, more powerful, and more affordable electronic devices"},
            {"Arises due to the significant difference in operating speeds of CPU and memory buses", " A limitation in computer architecture", "CPU waiting for data and instructions from memory", "Impacts the overall performance of a computer system"},
            {"Operating System level", "Microarchitect level", "Digital logic level", "Assembly language level"},
            {"16", "3", "256", "8"},
            {"2", "8", "16", "64"},
            {"The distance between the largest and smallest number", "refers to the distance a computer can transmit data wirelessly", "the distance between two adjacent numbers on a number line", "used to describe the maximum number of computer programs that can be executed simultaneously on a computer system"}
           
           			
           };
    
    //creates an array of characters to store correct answers
    char[] answers = {  
	         'A',
	         'B',
	         'C',
	         'C',
	         'C',
	         'D',
	         'A',
	         'C',
	         'C',
	         'A',
	         'C',
	         'D',
	         'A',
	         'A',
	         'B',
	         'D',
	         'C',
	         'A'
	        
           };

    char guess; // creates a variable to store the users answer
    char answer; 
    int index; //creates an int variable to keep track of what question there on
    int correct_guesses = 0; //creates and int variable to check how many correct answers the user got and sets it to 0
    int total_questions = questions.length; //gets the total number of questions
    int result; //creates a variable to store the quiz result

    Scanner scanner = new Scanner(System.in); //creates a scanner for reading user imput

    

    public void startQuiz() { //method to start the quiz
        for (index = 0; index < total_questions; index++) { //for loop that does through each question
        	displayQuestion(); //calls the display question method to display the current question
            getUserAnswer();   //calls the getUserAnswer method to prompt an answer from the user
            checkAnswer();   //calls the checkAnswer method to check if the user answers is correct
           
        }
        showResults(); //calls the show results to display the quiz results
    }
    
    
    


    public void displayQuestion() {
        System.out.println("Question " + (index + 1) + ":"); //prints the question number to console starting at one
        System.out.println(questions[index]); //prints the content of the current question form the questions array
        for (int i = 0; i < 4; i++) {  
            System.out.println((char) ('A' + i) + ") " + options[index][i]); //, it calculates the answer option letter and prints it along with the corresponding text from the options array. This ensures that the quiz question and answer options are presented in a clear and organized manner for the user see
        }
    }

    public void getUserAnswer() {
        System.out.print("Your answer (A, B, C, or D): "); //displays choose A B C or D
        guess = Character.toUpperCase(scanner.next().charAt(0)); //reads user input from the therminal 
    } //converts it to uppercase 

    public void checkAnswer() {
        if (guess == answers[index]) { //compares the users input with the answers array
            correct_guesses++; //if its correct it increases the correct guesses by 1
        }
    }

    public void showResults() {
        System.out.println("Quiz Results:"); //prints quiz results
        for (int i = 0; i < total_questions; i++) { //starts from the first question and continues until it reaches the last question
            System.out.println("Question " + (i + 1) + ": Correct Answer: " + answers[i]); 
        }
        System.out.println("Total correct answers: " + correct_guesses + " out of " + total_questions); //prints your score
        result = (int) ((correct_guesses / (double) total_questions) * 100); //calculates percent
        System.out.println("Percentage: " + result + "%"); //prints percent
    }

    }
