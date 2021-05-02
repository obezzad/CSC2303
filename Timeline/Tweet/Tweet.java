package Timeline.Tweet;

import java.util.GregorianCalendar;

public class Tweet {

    private String text;

    private GregorianCalendar posted;

    private int likes;

    private AssociatedList<HashTag> hashtag;

    private AssociatedList<Tweet> retweet;

    private String tweet_ID;

    private AssociatedList<Image> images;

		private 

    public Tweet(String tweet_ID, String text) {
        this.text = text;
        this.likes = 0;
        this.tweet_ID = tweet_ID;
        this.posted = new GregorianCalendar();
    }

    public Tweet(String tweet_ID, String text, Image images) {
        this(tweet_ID, text);
        this.images = images;
    }

    public Tweet(String tweet_ID, String text, HashTag hashtag) {
        this(tweet_ID, text);
        this.hashtag = hashtag;
    }

    public Tweet(String tweet_ID, String text, Image images, HashTag hashtag) {
        this(tweet_ID, text, images);
        this.hashtag = hashtag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GregorianCalendar getPosted() {
        return posted;
    }

    public void setPosted(GregorianCalendar posted) {
        this.posted = posted;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public HashTag getHashtags() {
        return hashtag;
    }

    public void setHashtags(HashTag hashtags) {
        this.hashtag = hashtags;
    }

    public Tweet getRetweet() {
        return retweet;
    }

    public void setRetweets(Tweet retweet) {
        this.retweet = retweet;
    }

    public String getTweet_ID() {
        return tweet_ID;
    }

    public void setTweet_ID(String tweet_ID) {
        this.tweet_ID = tweet_ID;
    }

    public Image getImage() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return tweet_ID;
    }

}
