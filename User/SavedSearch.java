package User;

public class SavedSearch {

    private String keyword;

    private Account account;

    public SavedSearch(String keyword, Account account) {
        this.keyword = keyword;
        this.account = account;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeywords(String keyword) {
        this.keyword = keyword;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "SavedSearch{" + "keywords\t=\t" + keyword + "\n Account\t=\t" + account + '}';
    }
}
