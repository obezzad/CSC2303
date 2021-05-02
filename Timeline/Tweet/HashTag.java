package Timeline.Tweet;

import Aggregation.AssociatedList;

public class HashTag {

    private String hashtag;

    private AssociatedList<Tweet> tweets;

    public HashTag(String hashtag) {
        this.hashtag = hashtag;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public AssociatedList<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(AssociatedList<Tweet> tweets) {
        this.tweets = tweets;
    }

    @Override
    public String toString() {
        return hashtag;
    }
}
