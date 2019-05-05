package net.codetojoy.survey;

import net.codetojoy.survey.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import java.util.*;

@Path("/survey")
public class SurveyResource {

    /*
    @Context
    UriInfo uriInfo;

    @Context
    Request request;

    public SurveyResource(UriInfo uriInfo, Request request) {
        this.uriInfo = uriInfo;
        this.request = request;
    }
    */

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Survey getSurvey(@QueryParam("userId") long userId) {
        String template = "Hello, %s!";
        String content = String.format(template, "" + userId);

        List<Answer> q1Answers = new ArrayList<>();
        q1Answers.add(new Answer(500, "Blue"));
        q1Answers.add(new Answer(501, "Green"));
        q1Answers.add(new Answer(502, "Purple"));
        q1Answers.add(new Answer(503, "Red"));
        Question q1 = new Question(10, "Q1", "What is your favourite colour?", q1Answers);

        List<Answer> q2Answers = new ArrayList<>();
        q2Answers.add(new Answer(600, "Random Thai Joint"));
        q2Answers.add(new Answer(601, "Random Chinese Food"));
        q2Answers.add(new Answer(602, "Random Italian Place"));
        Question q2 = new Question(20, "Q2", "What is your favourite restaurant?", q2Answers);

        List<Answer> q2aAnswers = new ArrayList<>();
        q2aAnswers.add(new Answer(702, "Yes"));
        q2aAnswers.add(new Answer(703, "No"));
        Question q2a = new Question(21, "Q2a", "Do you eat there often?", q2aAnswers);

        List<Answer> q3Answers = new ArrayList<>();
        q3Answers.add(new Answer(800, "Rock"));
        q3Answers.add(new Answer(801, "HipHop"));
        q3Answers.add(new Answer(802, "Country"));
        q3Answers.add(new Answer(803, "Jazz"));
        Question q3 = new Question(30, "Q3", "What is your favourite style of music?", q3Answers);

        List<Question> questions = new ArrayList<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q2a);
        questions.add(q3);

        Survey survey = new Survey(userId, content, questions);
        return survey;
    }
}
