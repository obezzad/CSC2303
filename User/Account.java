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
            
    private final int maxAttempts;

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

    public AssociatedList<Notification> getFollowing() {
        return following;
    }

    public void setFollowing(AssociatedList<Notification> following) {
        this.following = following;
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

    public AssociatedList<Message> getSent() {
        return sent;
    }

    public void setSent(AssociatedList<Message> sent) {
        this.sent = sent;
    }

    public AssociatedList<Message> getReceived() {
        return received;
    }

    public void setReceived(AssociatedList<Message> received) {
        this.received = received;
    }

    public AssociatedList<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(AssociatedList<Tweet> tweets) {
        this.tweets = tweets;
    }

    public AssociatedList<Poll> getPolls() {
        return polls;
    }

    public void setPolls(AssociatedList<Poll> polls) {
        this.polls = polls;
    }

    public AssociatedList<SavedSearch> getSearches() {
        return searches;
    }

    public void setSearches(AssociatedList<SavedSearch> searches) {
        this.searches = searches;
    }

    public AssociatedList<Moment> getMoments() {
        return moments;
    }

    public void setMoments(AssociatedList<Moment> moments) {
        this.moments = moments;
    }

    public AssociatedList<Thread> getThreads() {
        return threads;
    }

    public void setThreads(AssociatedList<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public String toString() {
        return username;
    }

}
