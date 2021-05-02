package Timeline;

import Timeline.Tweet.Tweet;

public class Thread {

    private Tweet tweet;

    private AssociatedList<Tweet> replies;

    public Thread(Tweet tweet) {
        this.tweet = tweet;
    }

    public Thread(Tweet tweet, Tweet replies) {
        this(tweet);
        this.replies = replies;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public Tweet getreplies() {
        return replies;
    }

    public void setreplies(Tweet replies) {
        this.replies = replies;
    }

    @Override
    public String toString() {
        return tweet;
    }
}
