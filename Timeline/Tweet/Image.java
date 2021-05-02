package Timeline.Tweet;

import User.Account;

public class Image {

    private String file;

    private String caption;

    private AssociatedList<Account> tagged;

    public Image(String file) {
        this.file = file;
    }

    public Image(String file, String caption) {
        this.file = file;
        this.caption = caption;
    }

    public Image(String file, String caption, Account tagged) {
        this(file, caption);
        this.tagged = tagged;
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

    public Account getTagged() {
        return tagged;
    }

    public void addTag(Account tag) {
        // TODO: No aggregation yet.
        this.tagged = tag;
    }

    @Override
    public String toString() {
        return caption;
    }
}
