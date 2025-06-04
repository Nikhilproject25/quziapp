package com.nikhil.quziapp.controller;

import com.nikhil.quziapp.Question;
import com.nikhil.quziapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public List<Question> allQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getAllQuestionByCategory(category);
    }

    @PostMapping("/add")
    public String  save( @RequestBody Question question) {
         return questionService.addQuestion(question);

    }

}
