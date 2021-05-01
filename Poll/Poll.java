package Poll;

public class Poll {

    private String question;

    private int duration;

    private PollAnswerOption answer;

    public Poll(String question, int duration, PollAnswerOption answer) {
        this.question = question;
        this.duration = duration;
        this.answer = answer;
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

    public PollAnswerOption getAnswer() {
        return answer;
    }

    public void setAnswer(PollAnswerOption answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Poll\t:\t" + "\n\t\tquestion\t=\t" + question + "\n\t\tduration\t=\t" + duration + "\n\t\tanswers\t=\t" + answer;
    }
}
