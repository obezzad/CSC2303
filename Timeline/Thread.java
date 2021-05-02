package Timeline;

import Aggregation.AssociatedList;
import Timeline.Tweet.Tweet;

public class Thread {

    private Tweet tweet;

    private AssociatedList<Tweet> replies;

    public Thread(Tweet tweet) {
        this.tweet = tweet;
        this.replies = new AssociatedList<>();
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public AssociatedList<Tweet> getreplies() {
        return replies;
    }

    public void setreplies(AssociatedList<Tweet> replies) {
        this.replies = replies;
    }

    // TODO: UPDATE TOSTRING
/*    @Override
    public String toString() {
        return tweet;
    } */
}
