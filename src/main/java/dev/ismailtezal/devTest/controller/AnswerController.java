package dev.ismailtezal.devTest.controller;
import dev.ismailtezal.devTest.model.courses.Answer;
import dev.ismailtezal.devTest.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/answers")
@CrossOrigin("devtest-6ef68.web.app/")
public class AnswerController {


    @Autowired
    private AnswerService answerService;

    @PostMapping
    public ResponseEntity<String> createAnswer(@RequestBody Answer answer) {
        answerService.saveAnswer(answer);

        answerService.executePythonScript();

        return ResponseEntity.ok("Answer Post Başarılı !");
    }

    @GetMapping("/result")
    public ResponseEntity<List<Answer>> getAnswers(){
        return new ResponseEntity<List<Answer>>(answerService.getAllAnswers(),HttpStatus.OK);
    }
}
