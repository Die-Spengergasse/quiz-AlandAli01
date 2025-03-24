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
        int correctAnswers = 0;
        int questionCount = Math.min(questions.size(), 5);

        for (int i = 0; i < questionCount; i++) {
            Question question = questions.get(i);
            System.out.println(question.getText());
            List<Answer> answers = question.getAnswerList();
            for (int j = 0; j < answers.size(); j++) {
                System.out.println((j + 1) + ". " + answers.get(j).getText());
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer > 0 && userAnswer <= answers.size() && answers.get(userAnswer - 1).isCorrect()) {
                correctAnswers++;
            }
        }

        displayScore(correctAnswers, questionCount);
    }

    private void displayScore(int correctAnswers, int totalQuestions) {
        double percentage = (double) correctAnswers / totalQuestions * 100;
        System.out.println("You answered " + correctAnswers + " out of " + totalQuestions + " questions correctly.");
        System.out.println("Your score: " + percentage + "%");
    }
}