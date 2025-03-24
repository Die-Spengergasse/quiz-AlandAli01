package at.spengergasse.entities;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;

public Quiz() {
        this.questions = new ArrayList<>();
}

    public void addQuestion(Question question) {
        questions.add(question);
}

    public List<Question> getQuestions() {
        return questions;
}

    public void start() {
        for (Question question : questions) {
            System.out.println(question.getText());
for (Answer answer : question.getAnswerList()) {
                System.out.println("- " + answer.getText());
}
        }
    }
}