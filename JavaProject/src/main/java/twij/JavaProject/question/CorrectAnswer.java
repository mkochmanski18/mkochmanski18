package twij.JavaProject.question;

import javax.persistence.*;

public class CorrectAnswer {

    private long id;
    private String correctAns;

    public CorrectAnswer() {
    }

    public CorrectAnswer(long id, String correctAns){
        this.id =id;
        this.correctAns = correctAns;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }
    @Override
    public String toString() {
        return "CorrectAnswer{" +
                "id=" + id +
                ", correctAns='" + correctAns + '\'' +
                '}';
    }
}
