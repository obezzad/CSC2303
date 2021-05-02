package User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class AccountCollection{

    List<Account> accounts;

    public AccountCollection(){

    }
    public boolean addAccount(Account acc) {
        // comparison then add

            return false;
        }

    public boolean removeAccount(Account acc) {
        return false;
    }

    public void modifyAccount(Account search, Account newAcc) {
    }

    public Account getAccountWithUsername(String username) {

        return null;
    }


    public void sortAccounts(Comparator<Account> comp) {
    }

    public ListIterator<Account> getAccounts() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

}