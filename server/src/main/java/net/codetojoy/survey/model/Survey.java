package net.codetojoy.survey.model;

import java.util.*;

public class Survey {
    private final long userId;
    private final String content;
    private List<Question> questions = new ArrayList<>();

    public Survey(long userId, String content, List<Question> questions) {
        this.userId = userId;
        this.content = content;
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public long getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }
}
