import java.sql.ResultSet;
import java.sql.SQLException;
public class Question {
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;

    public Question(int id) {
        String query = "SELECT * FROM questions WHERE id = " + id;
        ResultSet questionData = Database.returnSQL(query);
        try {
            if (questionData.next()) {
                this.question = questionData.getString("question");
                this.optionA = questionData.getString("optionA");
                this.optionB = questionData.getString("optionB");
                this.optionC = questionData.getString("optionC");
                this.optionD = questionData.getString("optionD");
                this.correctAnswer = questionData.getString("correctAnswer");
                questionData.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String listQuestion() {
        return "Question: " + question + "\n" +
                "Option A: " + optionA + "\n" +
                "Option B: " + optionB + "\n" +
                "Option C: " + optionC + "\n" +
                "Option D: " + optionD + "\n";
    }
}
