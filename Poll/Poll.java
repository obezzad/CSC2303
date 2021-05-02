package Poll;

public class Poll {

    private String question;

    private int duration;

    private AssociatedList<PollanswersOption> answers;

    public Poll(String question, int duration, PollAnswerOption answers) {
        this.question = question;
        this.duration = duration;
        this.answers = answers;
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

    public PollanswersOption getanswers() {
        return answers;
    }

    public void setanswers(PollanswersOption answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return question;
    }
}
