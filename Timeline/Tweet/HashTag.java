package Timeline.Tweet;

import Aggregation.CustomCollection;

public class HashTag {

    private String hashtag;

    private CustomCollection<Tweet> tweets;

    public HashTag(String hashtag) {
        this.hashtag = hashtag;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public CustomCollection<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(CustomCollection<Tweet> tweets) {
        this.tweets = tweets;
    }

    @Override
    public String toString() {
        return hashtag;
    }
}
