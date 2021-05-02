package Poll;

public class PollAnswerOption {

    private String option;

    private int answer;

    public PollAnswerOption(String option, int answer) {
        this.option = option;
        this.answer = answer;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return option;
    }
}
