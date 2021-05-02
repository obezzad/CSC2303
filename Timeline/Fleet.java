package Timeline;

import Aggregation.CustomCollection;
import Timeline.Tweet.HashTag;
import Timeline.Tweet.HashTag;
import Timeline.Tweet.Image;
import Timeline.Tweet.Image;
import Timeline.Tweet.Tweet;
import Timeline.Tweet.Tweet;
import User.Account;

public class Fleet extends Tweet {

    private CustomCollection<Account> seen_by;

    public Fleet(String tweet_ID, String text, Account account) {
        super(tweet_ID, text);
        this.seen_by = new CustomCollection<>();
    }

    public CustomCollection<Account> getSeenBy() {
        return seen_by;
    }
    public void setSeenBy(CustomCollection<Account> seen_by) { this.seen_by = seen_by; }

    /*
    public void view() {
        // TODO: No aggregation yet.
    }
     */
    
    @Override
    public String toString() {
        return "Fleet seen by: " + seen_by;
    }
}
