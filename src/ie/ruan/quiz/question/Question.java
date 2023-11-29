package question;

import database.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Question {
    protected String question;
    protected String correctAnswer;

    private String[] options;
    public Question(int id) {
        super();
        String query = "SELECT * FROM questions WHERE id = " + id; //constructs the SQL query
        ResultSet questionData = Database.returnSQL(query); //executes the SQL query
        try {
            if (questionData.next()) {
                this.question = questionData.getString("question");
                this.options = new String[]{questionData.getString("optionA"),
                        questionData.getString("optionB"),
                        questionData.getString("optionC"),
                        questionData.getString("optionD")};
                this.correctAnswer = questionData.getString("correctAnswer");
                questionData.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Question() {

    }
    public String ListQuestion(){
        return question + ": " +
                "\n A) " + options[0] +
                "\n B) " + options[1] +
                "\n C) " + options[2] +
                "\n D) " + options[3];
    }

    public String getCorrectAnswer() {//getter for the correct answer
        return correctAnswer;
    }
}
