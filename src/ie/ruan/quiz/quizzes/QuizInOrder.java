package quizzes;

import question.Question;

public class QuizInOrder extends Quiz{
    private int quizType = 1;
    private int questionAmount;
    
    public Question[] createQuestionArray(int amount) {
        Question[] questions = new Question[amount];
        for (int i = 0; i < amount; i++) {
            questions[i] = new Question(i+1);
        }
        return questions;
    }
}

