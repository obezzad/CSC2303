package Timeline.Tweet;

public class HashTag {

    private String hashtag;

    private Tweet tweets;

    public HashTag(String hashtag) {
        this.hashtag = hashtag;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public Tweet getTweets() {
        return tweets;
    }

    public void setTweets(Tweet tweets) {
        this.tweets = tweets;
    }

    @Override
    public String toString() {
        return "Hashtag\t:\t" + "\n\t\thashtag\t=\t" + hashtag + "\n\t\ttweets\t=\t" + tweets;
    }
}
