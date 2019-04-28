package net.codetojoy.survey.model;

import java.util.*;

public class Question {
    private final long id;
    private final String logicalName;
    private final String content;
    private List<Answer> answers;
    // private Response response;

    public Question(long id, String logicalName, String content, List<Answer> answers) {
        this.id = id;
        this.logicalName = logicalName;
        this.content = content;
        this.answers = answers;
    }

    public long getId() {
        return id;
    }

    public String getLogicalName() {
        return logicalName;
    }

    public String getContent() {
        return content;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
