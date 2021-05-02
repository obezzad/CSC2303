package User;

import Aggregation.AssociatedList;

public class SavedSearch {

    private AssociatedList<String> keywords;

    private Account account;

    // public SavedSearch(String keywords, Account account) {
    public SavedSearch(Account account) {
        // this.keywords = keywords;
        this.account = account;
    }

    public AssociatedList<String> getKeyword() {
        return keywords;
    }

    public void setKeywords(AssociatedList<String> keywords) {
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
