package net.codetojoy.survey.model;

public class Answer {
    private final long id;
    private final String content;

    public Answer(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
