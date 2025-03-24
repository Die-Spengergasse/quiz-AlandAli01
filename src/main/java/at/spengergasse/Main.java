package at.spengergasse;

import at.spengergasse.entities.Question;
import at.spengergasse.entities.Quiz;
import at.spengergasse.entities.QuizDataFetcher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<Question> questions = QuizDataFetcher.fetchQuestions(em);

        Quiz quiz = new Quiz();
        for (Question question : questions) {
            quiz.addQuestion(question);
        }

        em.getTransaction().commit();

        quiz.start();

        em.close();
        emf.close();
    }
}