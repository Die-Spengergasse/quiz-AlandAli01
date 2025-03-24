package at.spengergasse.entities;

import at.spengergasse.entities.Answer;
import at.spengergasse.entities.Question;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class QuizDataFetcher {

    public static List<Question> fetchQuestions(EntityManager em) {
        TypedQuery<Question> query = em.createQuery("SELECT q FROM Question q", Question.class);
        return query.getResultList();
    }
}