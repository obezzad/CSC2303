package Timeline;

import Timeline.Tweet.Tweet;

public class Thread {

    private Tweet tweet;

    private Tweet reply;

    public Thread(Tweet tweet) {
        this.tweet = tweet;
    }

    public Thread(Tweet tweet, Tweet reply) {
        this(tweet);
        this.reply = reply;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public Tweet getReply() {
        return reply;
    }

    public void setReply(Tweet reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "Thread\t:\t" + "\n\t\ttweet\t=\t" + tweet + "\n\t\treply\t=\t" + reply;
    }
}
