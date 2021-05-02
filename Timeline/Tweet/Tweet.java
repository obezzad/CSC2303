package Timeline.Tweet;

import Aggregation.CustomCollection;

import java.util.GregorianCalendar;

public class Tweet {

    private String text;

    private GregorianCalendar posted;

    private int likes;

    private CustomCollection<HashTag> hashtag;

    private CustomCollection<Tweet> retweet;

    private String tweet_ID;

    private CustomCollection<Image> images;

	//	private

    public Tweet(String tweet_ID, String text) {
        this.text = text;
        this.likes = 0;
        this.tweet_ID = tweet_ID;
        this.posted = new GregorianCalendar();
        this.images = new CustomCollection<>();
        this.hashtag = new CustomCollection<>();
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

    public CustomCollection<HashTag> getHashtags() {
        return hashtag;
    }

    public void setHashtags(CustomCollection<HashTag> hashtags) {
        this.hashtag = hashtags;
    }

    public CustomCollection<Tweet> getRetweet() {
        return retweet;
    }

    public void setRetweets(CustomCollection<Tweet> retweet) {
        this.retweet = retweet;
    }

    public String getTweet_ID() {
        return tweet_ID;
    }

    public void setTweet_ID(String tweet_ID) {
        this.tweet_ID = tweet_ID;
    }

    public CustomCollection<Image> getImages() {
        return images;
    }

    public void setImages(CustomCollection<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return tweet_ID;
    }

}
