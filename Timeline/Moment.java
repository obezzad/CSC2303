package Timeline;

import Timeline.Tweet.Tweet;

public class Moment {

    private String title;

    private String description;

    private String cover_image;

    private Tweet tweet;

    public Moment(String title, String description, String cover_image) {
        this.title = title;
        this.description = description;
        this.cover_image = cover_image;
    }

    public Moment(String title, String description, String cover_image, Tweet tweet) {
        this(title, description, cover_image);
        this.tweet = tweet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover_image() {
        return cover_image;
    }

    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    @Override
    public String toString() {
        return "Moment\t:\t" + "\n\t\ttitle\t=\t" + title + "\n\t\tdescription\t=\t" + description + "\n\t\tcover_image\t=\t" + cover_image + "\n\t\ttweets\t=\t" + tweet;
    }
}
