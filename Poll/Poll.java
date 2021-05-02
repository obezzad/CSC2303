package Poll;

import Aggregation.CustomCollection;

public class Poll {

    private String question;

    private int duration;

    private CustomCollection<PollAnswerOption> answers;

    public Poll(String question, int duration) {
        this.question = question;
        this.duration = duration;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public CustomCollection<PollAnswerOption> getanswers() {
        return answers;
    }

    public void setAnswers(CustomCollection<PollAnswerOption> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return question;
    }
}
