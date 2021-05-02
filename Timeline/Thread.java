package Timeline;

import Aggregation.CustomCollection;
import Timeline.Tweet.Tweet;

public class Thread {

    private Tweet tweet;
    private CustomCollection<Tweet> replies;

    public Thread(Tweet tweet) {
        this.tweet = tweet;
        this.replies = new CustomCollection<>();
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public CustomCollection<Tweet> getreplies() {
        return replies;
    }

    public void setreplies(CustomCollection<Tweet> replies) {
        this.replies = replies;
    }

  
    @Override
    public String toString() {
        return tweet;
    }
}
