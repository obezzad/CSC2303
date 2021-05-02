package Timeline;

import Aggregation.AssociatedList;
import Timeline.Tweet.HashTag;
import Timeline.Tweet.HashTag;
import Timeline.Tweet.Image;
import Timeline.Tweet.Image;
import Timeline.Tweet.Tweet;
import Timeline.Tweet.Tweet;
import User.Account;

public class Fleet extends Tweet {

    private AssociatedList<Account> seen_by;

    public Fleet(String tweet_ID, String text, Account account) {
        super(tweet_ID, text);
        this.seen_by = new AssociatedList<>();
    }

    public AssociatedList<Account> getSeenBy() {
        return seen_by;
    }
    public void setSeenBy(AssociatedList<Account> seen_by) { this.seen_by = seen_by; }

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
