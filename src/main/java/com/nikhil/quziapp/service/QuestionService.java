package com.nikhil.quziapp.service;

import com.nikhil.quziapp.Question;
import com.nikhil.quziapp.repository.QuestionsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionsDao questionsDao;

    public List<Question> getAllQuestions() {
        return questionsDao.findAll();
    }

    public List<Question> getAllQuestionByCategory(String category) {
        return  questionsDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
         questionsDao.save(question);
        return "Question added successfully";
    }
}
