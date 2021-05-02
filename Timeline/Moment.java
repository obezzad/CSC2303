package Timeline;

import Timeline.Tweet.Tweet;

public class Moment {

    private String title;

    private String description;

    private String cover_image;

    private AssociatedList<Tweet> tweets;

    public Moment(String title, String description, String cover_image) {
        this.title = title;
        this.description = description;
        this.cover_image = cover_image;
    }

    public Moment(String title, String description, String cover_image, Tweet tweets) {
        this(title, description, cover_image);
        this.tweets = tweets;
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
        return tweets;
    }

    public void setTweet(Tweet tweets) {
        this.tweets = tweets;
    }

    @Override
    public String toString() {
        return title;
    }
}
