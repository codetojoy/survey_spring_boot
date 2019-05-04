$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/survey?userId=888"
    }).then(function(data) {
       $('.survey-content').append(data.content);

       $('.survey-q1-logicalName').append(data.questions[0].logicalName);
       $('.survey-q1-content').append(data.questions[0].content);

       $('.survey-q2-logicalName').append(data.questions[1].logicalName);
       $('.survey-q2-content').append(data.questions[1].content);
    });
});
