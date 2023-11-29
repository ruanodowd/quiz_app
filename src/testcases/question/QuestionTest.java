package question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    void listQuestion() {

    }
    @Test
    void getCorrectAnswer() {
        Question question = new Question(1);
        assertEquals("C", question.getCorrectAnswer());
    }
}