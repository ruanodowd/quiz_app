
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Quiz implements ActionListener{
	
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
	// creates a 2d array for answers
	String[][]options = {
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
	//creates and array to store answers
	char[] answers= {  
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
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	int seconds=10;
	
	
	JFrame frame = new JFrame(); // creates a Jframe for the quiz
	JTextField textfield = new JTextField(); //creatses a textfeild
	JTextArea textarea = new JTextArea();  //Creates a textfeild area this along with textfield is used for displaying questions and answers
	JButton buttonA = new JButton(); //these are creating buttons
	JButton buttonB = new JButton();
	JButton buttonC= new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel(); //creating labels for displaying answers
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();  //label for displaying time
	JLabel seconds_left = new JLabel();  //label for displaying seconds left
	JTextField number_right = new JTextField();  //textfeild for displaying result
	JTextField percentage = new JTextField(); // textfield for displaying your percentage
	

	Timer timer = new Timer(1000, new ActionListener() { //creating a timer for tracking the time remaining for each question
		
		//1000 referes to 1000ms so 1 second
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer(); //a timer that gives you 10 seconds then marks option wrong when seoconds are up works using --
				
			}
		}
	});
	
		
	
	
	
	
	//a constructor for the quiz class
	public QuizLinear() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes it so the GUI closes when you press X button
		frame.setSize(1500,1000); //sets the frame size x,y
		frame.getContentPane().setBackground(Color.blue); //sets color
		frame.setLayout(null); // basically means you are manually seting positions of frames etc
		frame.setResizable(false); // means somen=body isnt able to resize
		
		textfield.setBounds(0,0,1500,50); // sets position and size x, y, width, height
		textfield.setBackground(new Color(255,25,0));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,15)); //sets font style makes it bold and font size
		textfield.setBorder(BorderFactory.createBevelBorder(1)); //creates border
		textfield.setHorizontalAlignment(JTextField.CENTER); // aligns it horizontally
		textfield.setEditable(false);  //makes it so you cant edit it import with quizs and espically the answer part so you cant cheat
		
		
		textarea.setBounds(0,50,1500,50);
		textarea.setLineWrap(true); //basically means if a queation is 2 long it will return to next line a bit like /n
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(25,255,0));
		textarea.setFont(new Font("Mv Boli",Font.BOLD,15));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(new Font("Mv Boli",Font.BOLD,35));
		buttonA.setFocusable(false); //not very significant means you cant click it with tab or arrows
		buttonA.addActionListener(this); //action listener hadles events for the button
		buttonA.setText("A");
		
		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("Mv Boli",Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("Mv Boli",Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("Mv Boli",Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		
		
		answer_labelA.setBounds(125,100,500,100);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(25,255,0));
		answer_labelA.setFont(new Font("Mv Boli",Font.PLAIN,15));
		
		answer_labelB.setBounds(125,200,500,100);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(25,255,0));
		answer_labelB.setFont(new Font("Mv Boli",Font.PLAIN,15));
		
		answer_labelC.setBounds(125,300,500,100);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(25,255,0));
		answer_labelC.setFont(new Font("Mv Boli",Font.PLAIN,15));
		
		answer_labelD.setBounds(125,400,500,100);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(25,255,0));
		answer_labelD.setFont(new Font("Mv Boli",Font.PLAIN,15));
		
		seconds_left.setBounds(1400,825,100,100);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(new Color(255,0,0));
		seconds_left.setFont(new Font("Ink Free",Font.BOLD,60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		
		time_label.setBounds(1400,800,100,25);
		time_label.setBackground(new Color(50,50,50));
		time_label.setForeground(new Color(255,0,0));
		time_label.setFont(new Font("Mv Boli",Font.PLAIN,20));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("timer");
		
		
		number_right.setBounds(225,225,200,100);
		number_right.setBackground(new Color(25,25,25));
		number_right.setForeground(new Color(25,255,0));
		number_right.setFont(new Font("Ink Free",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(225,325,200,100);
		percentage.setBackground(new Color(25,25,25));
		percentage.setForeground(new Color(25,255,0));
		percentage.setFont(new Font("Ink Free",Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		
		
		
		
		//adds it to the frame
		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);
		
		
		
		
		// displays the first questions
		nextQuestion();
		
		
	}
	
	public void nextQuestion() {
		
		if(index>= total_questions) { //checks if all questions have been asked if so displays result
			results();
			}
		else {
			textfield.setText("Questions" + (index + 1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start(); // set up the question and choices and starts timer
		}
		
	}
	
	public void actionPerformed (ActionEvent e) {
		
		buttonA.setEnabled(false);
		buttonA.setEnabled(false);
		buttonA.setEnabled(false);
		buttonA.setEnabled(false); //disables buttons to prevent multiple answers
		
		if(e.getSource()==buttonA) {
			answer= 'A';
			if(answer == answers[index]) {
				correct_guesses++; //checks to see if the answer clicked was the right answer
			}
		}
		
		if(e.getSource()==buttonB) {
			answer= 'B';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		if(e.getSource()==buttonC) {
			answer= 'C';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		
		if(e.getSource()==buttonD) {
			answer= 'D';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		displayAnswer(); //displays the correct answer
		
	}
	public void displayAnswer() {
		
		timer.stop(); // stops the timer and update the GUI to store correct answer
		buttonA.setEnabled(false);
		buttonA.setEnabled(false);
		buttonA.setEnabled(false);
		buttonA.setEnabled(false);
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		if(answers[index] !='B')
			answer_labelB.setForeground(new Color(255,0,0));
		if(answers[index] !='C')
			answer_labelC.setForeground(new Color(255,0,0));
		if(answers[index] !='D')
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(2000, new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color(25,255,0));
				answer_labelB.setForeground(new Color(25,255,0));
				answer_labelC.setForeground(new Color(25,255,0));
				answer_labelD.setForeground(new Color(25,255,0));
				
				answer = ' ';
				seconds=10;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
				
			}
		});
		pause.setRepeats(false);
		pause.start();
		
	}
	public void results() {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = (int)((correct_guesses/(double)total_questions)*100); //calculates result
		
		textfield.setText("RESULTS");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText(""); //will make all these not display anything
		answer_labelD.setText("");
		
		number_right.setText("("+ correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		
		frame.add(percentage); //shows the percent and how many you got right
		frame.add(number_right);
		
		
	}


}
