package User;

import Aggregation.AssociatedList;
import Poll.Poll;
import Messaging.Message;
import Timeline.Moment;
import Timeline.Tweet.Tweet;

public class Account {

    private String username;

    private String password;

    private Profile profile;

    private AssociatedList<Notification> followers;

    private AssociatedList<Notification> following;

    private AssociatedList<Message> sent;

    private AssociatedList<Message> received;

    private AssociatedList<Tweet> tweets;

    private AssociatedList<Poll> polls;

    private AssociatedList<SavedSearch> searches;

    private AssociatedList<Moment> moments;

    private AssociatedList<Thread> threads;
    
    private int passAttempt;
            
    private int maxAttempts;

    public Account(String username, String password, Profile profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
        this.maxAttempts = 3;
        this.followers = new AssociatedList<>();
        this.following = new AssociatedList<>();
        this.sent = new AssociatedList<>();
        this.received = new AssociatedList<>();
        this.tweets = new AssociatedList<>();
        this.polls = new AssociatedList<>();
        this.searches = new AssociatedList<>();
        this.moments = new AssociatedList<>();
        this.threads = new AssociatedList<>();
    }

    public String getUsername() {
        return username;
    }

    // TODO: C-style array acc[] --> Collection Framework
    public static boolean checkUsername(String entered, Account acc[]) throws DuplicateUserException {
        for (Account a : acc) {
            if (a.getUsername().equals(entered)) {
                throw new DuplicateUserException(entered);
            }
        }
        return true;
    }

    public void setUsername(String username) {
        
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public boolean checkPassword(String password) throws WrongPasswordException
    {
        if (this.getPassword().equals(password))
            return true;
        
        throw new WrongPasswordException(++this.passAttempt, this.maxAttempts);
    }
    
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean authenticate(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public void changePass(String newPassword) {
        this.password = newPassword;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;

        if(obj instanceof Account){
          Account acc = (Account) obj;
          return this.username.equals(acc.getUsername());
        }

        return false;
    }
    
    @Override
    public String toString() {
        return username;
    }

}
