package at.spengergasse.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getText());
            for (int i = 0; i < question.getAnswerList().size(); i++) {
                System.out.println((i + 1) + ". " + question.getAnswerList().get(i).getText());
            }
            System.out.print("Enter the number you think is correct: ");
            int userAnswer = scanner.nextInt();
            if (question.getAnswerList().get(userAnswer - 1).isCorrect()) {
                System.out.println("True!");
            } else {
                System.out.println("False!");
            }
        }
        scanner.close();
    }
}