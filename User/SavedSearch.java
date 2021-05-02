package User;

public class SavedSearch {

    private AssociatedList<String> keywords;

    private Account account;

    public SavedSearch(String keywords, Account account) {
        this.keywords = keywords;
        this.account = account;
    }

    public String getKeyword() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Saved Search by: " + account;
    }
}
