package twij.JavaProject.question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepo;
    @Autowired
    public QuestionService(QuestionRepository questionRepo) {
        this.questionRepo = questionRepo;
    }

    public List<Question> getQuestions(){
        return questionRepo.findAll();
    }
    public Optional<Question> getQuestion(long id){
        return questionRepo.findById(id);
    }

    public void addNewQuestion(Question question) {
        Optional<Question> isQuestionExist = questionRepo.findQuestionByContent(question.getContent());

        if(isQuestionExist.isPresent()){
            throw  new IllegalStateException("Pytanie już istnieje!");
        }
        questionRepo.save(question);
    }
    @Transactional
    public void updateQuestion(Question question) {
        Question q = questionRepo.findById(question.getId())
                .orElseThrow(()->new IllegalStateException("Pytanie nie występuje w bazie!"));

        if(question.getContent() != null)
        {
            Optional<Question> isQuestionExist = questionRepo.findQuestionByContent(question.getContent());

            if(isQuestionExist.isPresent() && q.getId()!=question.getId()){
                throw  new IllegalStateException("Pytanie o tej treści już istnieje!");
            }
            q.setContent(question.getContent());
        }
        if(question.getAns1() != null) q.setAns1(question.getAns1());
        if(question.getAns2() != null) q.setAns2(question.getAns2());
        if(question.getAns3() != null) q.setAns3(question.getAns3());
        if(question.getAns4() != null) q.setAns4(question.getAns4());
        if(question.getCorrectAns() != null) q.setCorrectAns(question.getCorrectAns());

    }


    public void deleteQuestion(Question question) {
        Question q = questionRepo.findById(question.getId())
                .orElseThrow(()->new IllegalStateException("Pytanie nie występuje w bazie!"));
        questionRepo.delete(q);
    }

    public String getAnswer(long id) {
        Question question = questionRepo.findById(id)
                .orElseThrow(()->new IllegalStateException("Pytanie nie występuje w bazie!"));
        return question.getCorrectAns();
    }
    public List<CorrectAnswer> getAnswers() {
        List<Question> questions = questionRepo.findAll();
        List<CorrectAnswer> answers = new ArrayList<>();
        questions.forEach(ans-> answers.add(new CorrectAnswer(ans.getId(),ans.getCorrectAns())));
        return answers;
    }
    public List<Test> getTestQuestions(){
        List<Question> questions = questionRepo.findAll();
        List<Test> test = new ArrayList<>();
        questions.forEach(tt-> test.add(new Test(tt.getId(),tt.getContent(),tt.getAns1(),tt.getAns2(),tt.getAns3(),tt.getAns4())));
        return test;
    }

    public Integer coutMyPoints(Answers answers) {
        int points = 0;
        if(answers.getAnswer1()!=null && answers.getAnswer1().equals(getAnswer(1))) points+=1;
        if(answers.getAnswer2()!=null && answers.getAnswer2().equals(getAnswer(2))) points+=1;
        if(answers.getAnswer3()!=null && answers.getAnswer3().equals(getAnswer(3))) points+=1;
        if(answers.getAnswer4()!=null && answers.getAnswer4().equals(getAnswer(4))) points+=1;
        if(answers.getAnswer5()!=null && answers.getAnswer5().equals(getAnswer(5))) points+=1;
        if(answers.getAnswer6()!=null && answers.getAnswer6().equals(getAnswer(6))) points+=1;
        if(answers.getAnswer7()!=null && answers.getAnswer7().equals(getAnswer(7))) points+=1;
        if(answers.getAnswer8()!=null && answers.getAnswer8().equals(getAnswer(8))) points+=1;
        if(answers.getAnswer9()!=null && answers.getAnswer9().equals(getAnswer(9))) points+=1;
        if(answers.getAnswer10()!=null && answers.getAnswer10().equals(getAnswer(10))) points+=1;
        if(answers.getAnswer11()!=null && answers.getAnswer11().equals(getAnswer(11))) points+=1;
        if(answers.getAnswer12()!=null && answers.getAnswer12().equals(getAnswer(12))) points+=1;
        if(answers.getAnswer13()!=null && answers.getAnswer13().equals(getAnswer(13))) points+=1;
        if(answers.getAnswer14()!=null && answers.getAnswer14().equals(getAnswer(14))) points+=1;
        if(answers.getAnswer15()!=null && answers.getAnswer15().equals(getAnswer(15))) points+=1;
        if(answers.getAnswer16()!=null && answers.getAnswer16().equals(getAnswer(16))) points+=1;
        if(answers.getAnswer17()!=null && answers.getAnswer17().equals(getAnswer(17))) points+=1;
        if(answers.getAnswer18()!=null && answers.getAnswer18().equals(getAnswer(18))) points+=1;
        if(answers.getAnswer19()!=null && answers.getAnswer19().equals(getAnswer(19))) points+=1;
        if(answers.getAnswer20()!=null && answers.getAnswer20().equals(getAnswer(20))) points+=1;
        if(answers.getAnswer21()!=null && answers.getAnswer21().equals(getAnswer(21))) points+=1;
        if(answers.getAnswer22()!=null && answers.getAnswer22().equals(getAnswer(22))) points+=1;
        if(answers.getAnswer23()!=null && answers.getAnswer23().equals(getAnswer(23))) points+=1;
        if(answers.getAnswer24()!=null && answers.getAnswer24().equals(getAnswer(24))) points+=1;
        if(answers.getAnswer25()!=null && answers.getAnswer25().equals(getAnswer(25))) points+=1;
        if(answers.getAnswer26()!=null && answers.getAnswer26().equals(getAnswer(26))) points+=1;
        if(answers.getAnswer27()!=null && answers.getAnswer27().equals(getAnswer(27))) points+=1;
        if(answers.getAnswer28()!=null && answers.getAnswer28().equals(getAnswer(28))) points+=1;
        if(answers.getAnswer29()!=null && answers.getAnswer29().equals(getAnswer(29))) points+=1;
        if(answers.getAnswer30()!=null && answers.getAnswer30().equals(getAnswer(30))) points+=1;
        return points;
    }

    public String getMyGrade(Integer points) {
        if(points>28) return "5.0";
        else if(points>25) return "4.5";
        else if(points>22) return "4.0";
        else if(points>19) return "3.5";
        else if(points>17) return "3.0";
        else return "2.0";
    }
}
