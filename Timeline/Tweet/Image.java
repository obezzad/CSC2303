package Timeline.Tweet;

import Aggregation.CustomCollection;
import User.Account;

public class Image {

    private String file;

    private String caption;

    private CustomCollection<Account> tagged;

    public Image(String file) {
        this.file = file;
    }

    public Image(String file, String caption) {
        this.file = file;
        this.caption = caption;
        this.tagged = new CustomCollection<>();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public CustomCollection<Account> getTagged() {
        return tagged;
    }

    public void setTagged(CustomCollection<Account> tagged) { this.tagged = tagged; }

    @Override
    public String toString() {
        return caption;
    }
}
