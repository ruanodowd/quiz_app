package EpicIndeavour;
import java.util.Scanner;

public class class2Questions {
	
	

	public static void game1() {
		int score = 0; // This sets the initial score at 0
		
		
		score +=quiz(); //This returns the quiz value to score
		score += quiz2();
		score += quiz3();
		score += quiz4();
		score += quiz5();
		score += quiz6();
		score += quiz7();
		score += quiz8();
		score += quiz9();
		score += quiz10();
		score += quiz11();
		score += quiz12();
		score += quiz13();
		score += quiz14();
		score += quiz15();
		score += quiz16();
		score += quiz17();
		score += quiz18();
		
		
		System.out.println("Your score is:" + score +"/18");
		

	}
	public static int quiz() {
		int score =0;
		
		
		
		String question = "Computer Science Foundations Easy\n"
				+"What does ::= denote?\n"
				+ "A) Grammer rule.\n"
				+ "B) The beginning of a comment in code.\n"
				+ "C) A mathematical operation for calculating square roots.\n"
                + "D) A binary operator used for logical AND.";
		//the /n makes it print on the next line.
		// I choose to use the + operator to make the code nicer rather than have it all on the same line
		
		String correctAnswer = "A";
		Scanner scanner = new Scanner(System.in); //creates new Scanner called scanner
		
		
		
		System.out.println(question); // displays the question
		
		
		String userAnswer = scanner.nextLine().trim().toUpperCase();
		// trim removes any empty spaces
		//toUpperCase converts users answer to Uppercase I thought this would be the easiest way to stop getting wrong asnwers for a lowercase letter
		
		
		
		if(userAnswer.equals(correctAnswer)) {
			System.out.println("Correct");
			score ++;
		} else {
			System.out.println("Incorrect");
		}
		
		
		return score;
		
	}
	
	public static int quiz2() {
		int score = 0;
		
		
		String question = "Computer Science Foundations Easy\n"
				+ "What does ≡ mean?\n"
                + "A) A symbol indicating greater than.\n"
                + "B) Denotes equivalence.\n"
                + "C) A symbol used in calculus for integration.\n"
                + "D) Means greater than or equals to.";
		
		
		String correctAnswer ="B";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	        
	        return score;
	    }
	public static int quiz3() {
		int score = 0;
		
		
		String question = "Computer Science Foundations Medium\n"
				+ "What does \"BNF\" stand for in the context of computer science and formal grammar?\n"
                + "A) Basic Normal Form.\n"
                + "B) Binary-Natural Factorization.\n"
                + "C) Backus-Naur Form.\n"
                + "D) Branch and Flow Notation.";
		
		
		String correctAnswer ="C";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;
	    }
	public static int quiz4() {
		int score = 0;
		
		
		String question = "Computer Science Foundations Medium\n"
				+ "What does the acronym \"NAND\" represent?\n"
                + "A) National Association of Network Designers.\n"
                + "B) Not a Number.\n"
                + "C) Negated AND.\n"
                + "D) Non-Aligned Data.";
		
		
		String correctAnswer ="C";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz5() {
		int score = 0;
		
		
		String question = "Computer Science Foundations Hard\n"
				+ "In computer science, what does Boolean logic refer to?\n"
                + "A) A programming language used for scientific calculations.\n"
                + "B) A system of mathematics dealing with complex numbers.\n"
                + "C) A mathematical system for handling true and false values.\n"
                + "D) A type of logic used only in quantum computing.";
		
		
		String correctAnswer ="C";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz6() {
		int score = 0;
		
		
		String question = "Computer Science Foundations Hard\n"
				+ "In computer science, what is a lattice?\n"
                + "A) A mathematical structure that represents graphs.\n"
                + "B) A data structure used to store integers.\n"
                + "C) A formal specification for programming languages.\n"
                + "D) A partially ordered set where every pair of elements has a unique least upper bound and greatest lower bound.";
		
		
		String correctAnswer ="D";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz7() {
		int score = 0;
		
		
		String question = "Computer Organisation Easy\n"
				+ "Moore's Law is defined as:\n"
                + "A) The principle that the speed and capability of computers can be expected to double every two years.\n"
                + "B) An observation made by Gordon Moore.\n"
                + "C) About the increasing number of transistors on a microchip.\n"
                + "D) Leading to smaller, more powerful, and more affordable electronic devices.";
		
		
		String correctAnswer ="A";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz8() {
		int score = 0;
		
		
		String question = "Computer Organisation Easy\n"
				+ "The Von Neumann bottleneck is defined as: \n"
                + "A)  Arises due to the significant difference in operating speeds of CPU and memory buses .\n"
                + "B) A limitation in computer architecture.\n"
                + "C) CPU waiting for data and instructions from memory.\n"
                + "D) Impacts the overall performance of a computer system.";
		
		
		String correctAnswer ="A";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz9() {
		int score = 0;
		
		
		String question = "Computer Organisation Medium\n"
				+ "What is level 1 in the Contemporary Multilevel Machine?\n"
                + "A) Operating System level.\n"
                + "B) Microarchitect level.\n"
                + "C) Digital logic level.\n"
                + "D) Assembly language level";
		
		
		String correctAnswer ="B";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz10() {
		int score = 0;
		
		
		String question = "Computer Organisation Medium\n"
				+ "How many bits are in a byte? \n"
                + "A) 16.\n"
                + "B) 3.\n"
                + "C) 256.\n"
                + "D) 8";
		
		
		String correctAnswer ="D";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz11() {
		int score = 0;
		
		
		String question = "Computer Organisation Hard\n"
				+ "How many values does the hexadecimal System use \n"
                + "A) 2.\n"
                + "B) 8.\n"
                + "C) 16.\n"
                + "D) 64.";
		
		
		String correctAnswer ="C";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz12() {
		int score = 0;
		
		
		String question = "Computer Organisation Hard\n"
				+ "What does range mean\n"
                + "A)The distance between the largest and smallest numbers.\n"
                + "B)refers to the distance a computer can transmit data wirelessly.\n"
                + "C)the distance between two adjacent numbers on a number line.\n"
                + "D)used to describe the maximum number of computer programs that can be executed simultaneously on a computer system.";
		
		
		String correctAnswer ="A";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz13() {
		int score = 0;
		
		
		String question = "Discrete Maths Easy\n"
				+ "What does the negation operator do.\n"
                + "A)It converts a string to an integer.\n"
                + "B)It performs subtraction between two numbers. \n"
                + "C)reverses the meaning of its operand. \n"
                + "D)It concatenates two strings together.";
		
		
		String correctAnswer ="C";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz14() {
		int score = 0;
		
		
		String question = "Discrete Maths Easy\n"
				+ "Which branch of logic is often used in discrete mathematics for representing and analyzing statements ? \n"
                + "A)Boolean logic .\n"
                + "B)Fuzzy logic .\n"
                + "C) Modal logic .\n"
                + "D) Quantum logic ";
		
		
		String correctAnswer ="A";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz15() {
		int score = 0;
		
		
		String question = "Discrete Maths Medium\n"
				+ "Which of the following isn't a prosition  \n"
                + "A)My car is red.\n"
                + "B)Galway is in ireland  .\n"
                + "C) Are you having a nice day?.\n"
                + "D) 2+2=4 ";
		
		
		String correctAnswer ="C";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz16() {
		int score = 0;
		
		
		String question = "Discrete Maths Medium\n"
				+ "What does the biconditional statement 𝑝 ↔ q mean? \n"
                + "A) p implies q and q implies p  .\n"
                + "B) P is equal to q .\n"
                + "C) P and q have similar values  .\n"
                + "D) P is not equal to q  ";
		
		
		String correctAnswer ="A";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz17() {
		int score = 0;
		
		
		String question = "Discrete Maths Hard\n"
				+ "What is a matrix \n "
                + "A) A geometric shape with four equal side.\n"
                + "B) A system of equations.\n"
                + "C) A matrix is a rectangular array of numbers.\n"
                + "D) A type of polynomial equation";
		
		
		String correctAnswer ="C";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }

	       
	        return score;

	
	}
	public static int quiz18() {
		int score = 0;
		
		
		String question = "Discrete Maths Hard\n"
				+ "You encounter two people, A and B, from the same island, where knights always tell the truth, and knaves always lie. A and B make the following statements: \n"
				+ "\n"
				+ "A says B is a knave. B says at least one of us is a knave. \n"
				+ "\n"
				+ "What are A and B?  \n"
                + "A) A is a kinght and b is a knave  .\n"
                + "B) There both knights   .\n"
                + "C) There both knaves  .\n"
                + "D) A is a knave and b is a knight  ";
		
		
		String correctAnswer ="D";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(question);
		 String userAnswer = scanner.nextLine().trim().toUpperCase();

	        if (userAnswer.equals(correctAnswer)) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect");
	        }
	        scanner.close();
	        

	       
	        return score;

	
	}
	
	
	
	
	
	
	
	
	
		
}		
		
		
		
		
		
		
		
		
		
		
	


