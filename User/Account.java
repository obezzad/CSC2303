package User;

import Aggregation.CustomCollection;
import Poll.Poll;
import Messaging.Message;
import Timeline.Moment;
import Timeline.Tweet.Tweet;

public class Account {

    private String username;

    private String password;

    private Profile profile;

    private CustomCollection<Notification> followers;

    private CustomCollection<Notification> following;

    private CustomCollection<Message> sent;

    private CustomCollection<Message> received;

    private CustomCollection<Tweet> tweets;

    private CustomCollection<Poll> polls;

    private CustomCollection<SavedSearch> searches;

    private CustomCollection<Moment> moments;

    private CustomCollection<Thread> threads;
    
    private int passAttempt;
            
    private final int maxAttempts;

    public Account(String username, String password, Profile profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
        this.maxAttempts = 3;
        this.followers = new CustomCollection<>();
        this.following = new CustomCollection<>();
        this.sent = new CustomCollection<>();
        this.received = new CustomCollection<>();
        this.tweets = new CustomCollection<>();
        this.polls = new CustomCollection<>();
        this.searches = new CustomCollection<>();
        this.moments = new CustomCollection<>();
        this.threads = new CustomCollection<>();
    }

    public CustomCollection<Notification> getFollowing() {
        return following;
    }

    public void setFollowing(CustomCollection<Notification> following) {
        this.following = following;
    }

    public String getUsername() {
        return username;
    }

    // TODO: C-style array acc[] --> Collection Framework
    public static boolean checkUsername(String entered, CustomCollection<Account> acc) throws DuplicateUserException {
        for (Account a : acc.getElements()) {
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
        return (this.username.equals(username) && this.password.equals(password));
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

    public CustomCollection<Message> getSent() {
        return sent;
    }

    public void setSent(CustomCollection<Message> sent) {
        this.sent = sent;
    }

    public CustomCollection<Message> getReceived() {
        return received;
    }

    public void setReceived(CustomCollection<Message> received) {
        this.received = received;
    }

    public CustomCollection<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(CustomCollection<Tweet> tweets) {
        this.tweets = tweets;
    }

    public CustomCollection<Poll> getPolls() {
        return polls;
    }

    public void setPolls(CustomCollection<Poll> polls) {
        this.polls = polls;
    }

    public CustomCollection<SavedSearch> getSearches() {
        return searches;
    }

    public void setSearches(CustomCollection<SavedSearch> searches) {
        this.searches = searches;
    }

    public CustomCollection<Moment> getMoments() {
        return moments;
    }

    public void setMoments(CustomCollection<Moment> moments) {
        this.moments = moments;
    }

    public CustomCollection<Thread> getThreads() {
        return threads;
    }

    public void setThreads(CustomCollection<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public String toString() {
        return username;
    }

}
