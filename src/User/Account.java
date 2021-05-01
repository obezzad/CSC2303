package User;

import Poll.Poll;
import Messaging.Message;
import Timeline.Moment;
import Timeline.Tweet.Tweet;

public class Account {

    private String username;

    private String password;

    private Profile profile;

    private Notification followers;

    private Notification following;

    private Message sent;

    private Message received;

    private Tweet tweets;

    private Poll polls;

    private SavedSearch searches;

    private Moment moments;

    private Thread threads;
    
    private int passAttempt;
            
    private int maxAttempts;

    public Account(String username, String password, Profile profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
        this.maxAttempts = 3;
    }

    public Account(String username, String password, Profile profile, Notification following, Notification followers, Message sent, Message received, Tweet tweets, Poll polls, SavedSearch searches, Moment moments, Thread threads) {
        this(username, password, profile);
        this.followers = followers;
        this.following = following;
        this.sent = sent;
        this.received = received;
        this.tweets = tweets;
        this.polls = polls;
        this.searches = searches;
        this.moments = moments;
        this.threads = threads;
    }

    public String getUsername() {
        return username;
    }
    
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
        if (this.username.equals(username)) {
            if (this.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void changePass(String newPassword) {
        this.password = newPassword;
    }

    
    @Override
    public String toString() {
        return "Account\t:\n" + "\t\tUsername\t=\t" + username + "\n\t\tPassword\t=\t" + password + "\n\t\tProfile\t=\t" + profile + "\n\t\tFollowers\t=\t" + followers + "\n\t\tFollowing\t=\t" + following + "\n\t\tSent\t=\t\t" + sent + "\n\t\tReceived\t=\t" + received + "\n\t\tTweets\t=\t" + tweets + "\n\t\tPolls\t=\t" + polls + "\n\t\tSearches\t=\t" + searches + "\n\t\tMoments\t=\t" + moments + "\n\t\tThreads\t=\t" + threads;
    }

}
