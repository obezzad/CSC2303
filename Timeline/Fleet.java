package Timeline;

import Timeline.Tweet.HashTag;
import Timeline.Tweet.HashTag;
import Timeline.Tweet.Image;
import Timeline.Tweet.Image;
import Timeline.Tweet.Tweet;
import Timeline.Tweet.Tweet;
import User.Account;

public class Fleet extends Tweet {

    private Account seen_by;

    public Fleet(String tweet_ID, String text, Account account) {
        super(tweet_ID, text);
        this.seen_by = account;
    }

    public Fleet(String tweet_ID, String text, Image images, Account account) {
        super(tweet_ID, text, images);
        this.seen_by = account;
    }

    public Fleet(String tweet_ID, String text, HashTag hashtag, Account account) {
        super(tweet_ID, text, hashtag);
        this.seen_by = account;
    }

    public Fleet(String tweet_ID, String text, Image images, HashTag hashtag, Account account) {
        super(tweet_ID, text, images, hashtag);
        this.seen_by = account;
    }

    public Account getSeen_by() {
        return seen_by;
    }

    /*
    public void view() {
        // TODO: No aggregation yet.
    }
     */
    @Override
    public String toString() {
        return "Fleet with:\n\t" + super.toString() + "\n\tseen_by = " + seen_by + "\n";
    }
}
