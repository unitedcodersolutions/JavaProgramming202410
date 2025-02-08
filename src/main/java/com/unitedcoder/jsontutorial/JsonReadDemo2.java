package com.unitedcoder.jsontutorial;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JsonReadDemo2 {
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        Quiz quiz1=new Quiz();
        System.out.println("Start the quiz");
        Scanner scanner=new Scanner(System.in);
        int rightAnswer=0;
        int wrongAnswer=0;
        int totalQuestions=0;
        try {
            quiz1=objectMapper.readValue(new File("doc/questions.json"),Quiz.class);
            totalQuestions= quiz1.getQuestions().size();
            System.out.println("total questions: "+totalQuestions);
            for(Question question : quiz1.getQuestions())
            {

                System.out.println(question.getTitle());
                System.out.println("A: "+question.getA());
                System.out.println("B: " +question.getB());
                System.out.println("C: "+question.getC());
                System.out.println("D:" +question.getD());
                System.out.println("Please select and type your answer");
                String myAnswer=scanner.next();
                if(myAnswer.toUpperCase().equals(question.getAnswer()))
                {
                    rightAnswer++;
                    System.out.println("Your answer is correct");
                }
                else
                {
                    wrongAnswer++;
                    System.out.println("Your answer is wrong");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double score=(float)rightAnswer/totalQuestions *100;
        System.out.println("Final score" + score);
        System.out.println("Wrong answer count: "+wrongAnswer);
    }
}
