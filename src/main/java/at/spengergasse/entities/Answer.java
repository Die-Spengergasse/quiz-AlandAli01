package at.spengergasse.entities;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="a_answer")
public class Answer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "a_id")
    private int id;
@Column(name = "a_text")
    private String text;
@Column (name = "correct")
    private boolean correct;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
