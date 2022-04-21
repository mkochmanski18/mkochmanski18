package twij.JavaProject.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
//@RequestMapping(path="question")
public class QuestionController {

    private final QuestionService questionService;
    private long id;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/questions")
    public String questions(Model model){
        List<Question> questions = questionService.getQuestions();
        model.addAttribute("questions",questions);
        return "questions";
    }
    @PostMapping("/questions")
    public String registerNewQuestion(Question question,Model model){
        questionService.addNewQuestion(question);
        List<Question> questions = questionService.getQuestions();
        model.addAttribute("questions",questions);
        return "questions";
    }
    @GetMapping("/questions/{id}")
    public String deleteQuestion(@PathVariable long id,Model model){
        this.id = id;
        Question question = questionService.getQuestion(id)
                .orElseThrow(()->new IllegalStateException("Pytanie nie występuje w bazie!"));
        questionService.deleteQuestion(question);
        List<Question> questions = questionService.getQuestions();
        model.addAttribute("questions",questions);
        model.addAttribute("delete","Usunięto pytanie z id:"+id);
        return "questions";
    }

    @GetMapping("/question/{id}")
    public String editQuestion(@PathVariable long id,Model model){
        this.id = id;
        Question question = questionService.getQuestion(id)
                .orElseThrow(()->new IllegalStateException("Pytanie nie występuje w bazie!"));
        model.addAttribute("question",question);
        return "question";
    }

    @PostMapping("/question")
    public String updateQuestion(Question question,Model model){
        questionService.updateQuestion(question);
        model.addAttribute("success","Edytowano pytanie..");
        return "question";
    }

    //@PutMapping("question")
    //public void updateQuestion(@RequestBody Question question){
        //questionService.updateQuestion(question);
    //}

    @GetMapping("/test")
    public String getTestQuestions(Model model){
        List<Test> test = questionService.getTestQuestions();
        model.addAttribute("test", test);
        model.addAttribute("answers",new Answers());
        return "test";
    }
    @GetMapping("/answers")
    public List<CorrectAnswer> getAnswers(){
        return questionService.getAnswers();
    }
    @PostMapping("/result")
    public String getResult(Answers answers,Model model){
        System.out.print(answers);
        Integer points = questionService.coutMyPoints(answers);
        String grade = questionService.getMyGrade(points);
        model.addAttribute("points",points);
        model.addAttribute("grade",grade);
        return "result";
    }
}
