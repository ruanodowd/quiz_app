package quizzes;

import question.QuestionBaseConverter;

public class QuizBaseConverter extends Quiz{
    private int difficultyMultiplier = 3;
    private int quizType = 3;

    QuestionBaseConverter[] createQuestionArray(int amount) {
        QuestionBaseConverter[] questions = new QuestionBaseConverter[amount];
        for (int i = 0; i < amount; i++) {
            questions[i] = new QuestionBaseConverter(i+1, difficultyMultiplier);
        }
        return questions;
    }
}
