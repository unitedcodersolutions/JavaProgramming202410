package com.unitedcoder.jsontutorial;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.A;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonWriteDemo2 {
    //write a json file with multiple questions
    public static void main(String[] args) {
        Quiz mathQuiz=new Quiz();
        List<Question> questions=new ArrayList<>();
        questions.add(new Question("5+5=","1","5","7","10","D"));
        questions.add(new Question("10-5=","5","3","4","0","A"));
        questions.add(new Question("2*20=","20","30","35","40","D"));
        questions.add(new Question("100-85=","75","15","20","10","B"));
        questions.add(new Question("10/2=","2","5","10","1","B"));
        mathQuiz.setQuestions(questions);
        ObjectMapper objectMapper=new ObjectMapper();
        String mathQuestions= null;
        try {
            mathQuestions = objectMapper.writeValueAsString(mathQuiz);
            System.out.println(mathQuestions);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.write(new File("doc/mathquiz.json"),mathQuestions);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
