package com.unitedcoder.jsontutorial;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Quiz {
    @JsonProperty("Questions")
    List<Question> questions;

    public Quiz() {
    }

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
