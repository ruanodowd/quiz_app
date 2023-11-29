package quizzes;

import question.Question;

import java.util.Arrays;
import java.util.Random;

public class QuizRandom extends Quiz{
    private int quizType = 2;
    public Question[] createQuestionArray(int number){
        Question[] questions = new Question[number];
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            int randomQuestionID;
            do {
                randomQuestionID = rand.nextInt(18) + 1;
            } while (Arrays.asList(questions).contains(randomQuestionID));
            questions[i] = new Question(randomQuestionID);
        }
        return questions;
    }
        }
