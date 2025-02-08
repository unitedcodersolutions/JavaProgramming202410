package com.unitedcoder.jsontutorial;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Question {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("A")
    private String a;
    @JsonProperty("B")
    private String b;
    @JsonProperty("C")
    private String c;
    @JsonProperty("D")
    private String d;
    @JsonProperty("Answer")
    private String answer;
    public Question() {
    }

    public Question(String title, String a, String b, String c, String d, String answer) {
        this.title = title;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.answer = answer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
