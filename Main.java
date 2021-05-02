import Timeline.Fleet;
import Timeline.Tweet.HashTag;
import Timeline.Tweet.Image;
import Timeline.Tweet.Tweet;
import User.Account;
import User.DuplicateUserException;
import User.WrongPasswordException;
import User.Gender;
import User.InvalidGenderException;
import User.Profile;
import java.util.Scanner;
import Aggregation.AssociatedList;

public class Main {

    /*
    private static List<Account> accounts;
    private static List<HashTag> hashtags;
    private static List<SavedSearch> searches;
     */
     /*
     private static AssociatedList<Account> accounts;
     private static AssociatedList<HashTag> hashtags;
     private static AssociatedList<SavedSearch> searches;
     we should import Aggregation.AssociatedList in all the classes we need to use collections
     so in account, hashtags, messages, savedsearch, 
     */
    private static int newID = 0;

    public static void main(String[] args) {
        Profile bob_profile, steve_profile, julia_profile;
        Account bob_account, steve_account, julia_account, chosen_acc = null;
        Tweet tweet_all, tweet_without_hashtag, tweet_without_image;
        Image img_1, img_2, img_3;
        HashTag hashtag_1, hashtag_2;
        Tweet[] tweets = new Tweet[5];
        Account[] accounts = new Account[3];
        Scanner sc = new Scanner(System.in);
        try {
            // bob_profile = new Profile(Gender.UNSPECIFIED.name(), "bob@marlook.me", "Programming is my life", "/images/bobmarlook.png", "202-555-0174", "music");
            // steve_profile = new Profile(Gender.MALE.name(), "stevedoe@email.com", "Gamer and content creator", "/images/stevedoe.png", "111-555-9999", "programming");
            // julia_profile = new Profile(Gender.FEMALE.name(), "juliadoe@email.com", "Feminist till I die ", "/images/juliadoe.png", "555-999-1111", "programming");
            bob_profile = new Profile(Gender.UNSPECIFIED.name(), "bob@marlook.me", "Programming is my life", "/images/bobmarlook.png", "202-555-0174");
            bob_profile.getTopic().addElement("music");
            steve_profile = new Profile(Gender.MALE.name(), "stevedoe@email.com", "Gamer and content creator", "/images/stevedoe.png", "111-555-9999");
            steve_profile.getTopic().addElement("programming");
            julia_profile = new Profile(Gender.FEMALE.name(), "juliadoe@email.com", "Feminist till I die ", "/images/juliadoe.png", "555-999-1111");
            julia_profile.getTopic().addElement("programming");

            bob_account = new Account("BobMarlook", "RitaForever", bob_profile);
            accounts[0] = bob_account;
            steve_account = new Account("SteveDoe", "Coffee++", steve_profile);
            accounts[1] = steve_account;
            julia_account = new Account("JuliaDoe", "Steve2021", julia_profile);
            accounts[2] = julia_account;


            // TODO: Use Collection Framework's .add()
            img_1 = new Image("/images/tweet00000000001.png");
            img_2 = new Image("/images/tweet00000000010.png");
            img_3 = new Image("/images/tweet00000000011.png");

            // TODO: Use Collection Framework's .add()
            hashtag_1 = new HashTag("TwitterForever");
            hashtag_2 = new HashTag("30DaysCodingChallenges");

            // tweet_all = new Tweet(Integer.toString(newID++), "This twitter thing is cool!", img_1, hashtag_1);
            tweet_all = new Tweet(Integer.toString(newID++), "This twitter thing is cool!");
            tweet_all.getImages().addElement(img_1);
            tweet_all.getHashtags().addElement(hashtag_1);
            tweets[0] = tweet_all;
            // tweet_without_hashtag = new Tweet(Integer.toString(newID++), "This twitter thing is cool!", img_2);
            tweet_without_hashtag = new Tweet(Integer.toString(newID++), "This twitter thing is cool!");
            tweet_without_hashtag.getImages().addElement(img_2);
            tweets[1] = tweet_without_hashtag;
            // tweet_without_image = new Tweet(Integer.toString(newID++), "I can C in the dark!", hashtag_2);
            tweet_without_image = new Tweet(Integer.toString(newID++), "I can C in the dark!");
            tweet_without_image.getHashtags().addElement(hashtag_2);
            tweets[2] = tweet_without_image;

            // Tweet fleet_from_tweet = new Fleet(Integer.toString(newID++), "Exclusive meme!", img_3, bob_account);
            Tweet fleet_from_tweet = new Fleet(Integer.toString(newID++), "Exclusive meme!", bob_account);
            fleet_from_tweet.getImages().addElement(img_3);
            tweets[3] = fleet_from_tweet;

            // Fleet fleet_from_fleet = new Fleet(Integer.toString(newID++), "How are non-programmers surviving lockdown?", hashtag_2, julia_account);
            Fleet fleet_from_fleet = new Fleet(Integer.toString(newID++), "How are non-programmers surviving lockdown?", julia_account);
            fleet_from_fleet.getHashtags().addElement(hashtag_2);
            tweets[4] = fleet_from_fleet;

            boolean repeat;
            String str;

            System.out.println("Welcome to Twitter!");
            do {
                System.out.println("Please Select an Account to Update:");
                System.out.println("1. Bob (password: RitaForever)");
                System.out.println("2. Steve (password: Coffee++)");
                System.out.println("3. Julia (password: Steve2021)");

                System.out.println("Please choose an option (1-3)>> ");
                int c = Integer.parseInt(sc.nextLine());

                switch (c) {
                    case 1:
                        chosen_acc = bob_account;
                        break;
                    case 2:
                        chosen_acc = steve_account;
                        break;
                    case 3:
                        chosen_acc = julia_account;
                        break;
                    default:
                        System.err.println("INVALID INPUT!\n");
                }
            } while (chosen_acc == null);

            while (true) {
                try {
                    System.out.println("Please enter your password>> ");
                    str = sc.nextLine();
                    if (chosen_acc.checkPassword(str)) {
                        System.out.println("Welcome " + chosen_acc.getUsername() + "!");
                        break;
                    }
                } catch (WrongPasswordException ex) {
                    System.err.println(ex.getMessage());
                    if (ex.getRemainingAttempts() <= 0) {
                        return;
                    }
                }
            }

            System.out.println("Your chosen account is: " + chosen_acc + "\n");

            do {
                // TODO: Add aggregation options (Add topic, remove following...)
                System.out.println("==================== Menu =================");
                System.out.println("1. Get Username");
                System.out.println("2. Change Username");
                System.out.println("3. Get Password");
                System.out.println("4. Change Password");
                System.out.println("5. Get Email");
                System.out.println("6. Change Email");
                System.out.println("7. Get Gender");
                System.out.println("8. Modify Gender");
                System.out.println("9. Get all posts");

                System.out.println("Please choose an option (1-9)>> ");
                int c = Integer.parseInt(sc.nextLine());

                switch (c) {
                    case 1:
                        System.out.println(chosen_acc.getUsername());
                        break;
                    case 2:
                        while (true) {
                            try {
                                System.out.println("Please enter the new username>> ");
                                str = sc.nextLine();
                                if (Account.checkUsername(str, accounts)) {
                                    chosen_acc.setUsername(str);
                                    System.out.println("Username changed successfully!");
                                    break;
                                }
                            } catch (DuplicateUserException ex) {
                                System.err.println(ex.getMessage());
                                System.out.println("Here are suggested usernames: ");
                                for (String name : ex.suggestUsernames(chosen_acc)) {
                                    System.out.println("\t" + name);
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.println(chosen_acc.getPassword());
                        break;
                    case 4:
                        System.out.print("Please enter the new password>> ");
                        str = sc.nextLine();
                        chosen_acc.setPassword(str);
                        System.out.println("Password changed successfully!");
                        break;
                    case 5:
                        System.out.println(chosen_acc.getProfile().getEmail());
                        break;
                    case 6:
                        System.out.print("Please enter the new email>> ");
                        str = sc.nextLine();
                        chosen_acc.getProfile().setEmail(str);
                        System.out.println("Email changed successfully!");
                        break;
                    case 7:
                        System.out.println(chosen_acc.getProfile().getGender());
                        break;
                    case 8:
                        while (true) {
                            try {
                                System.out.print("Please enter the new gender (Male, Female, or Unspecified)>> ");
                                str = sc.nextLine();
                                chosen_acc.getProfile().setGender(str);
                                System.out.println("Gender changed successfully!");
                                break;
                            } catch (InvalidGenderException ex) {
                                System.err.println(ex.getMessage());
                                System.out.println(" Here are valid genders: ");
                                for (String s : ex.getValidGenders()) {
                                    System.out.println("\t" + s);
                                }
                            }
                        }
                        break;
                    case 9:
                        for (Tweet tweet : tweets) {
                            System.out.println(tweet.toString());
                            if (tweet instanceof Fleet) {
                                System.out.println(((Fleet) tweet).getSeenBy());
                            }
                        }
                        break;
                    default:
                        System.err.println("INVALID INPUT!\n");
                }

                System.out.println("Do you want to continue (True/False)>> ");
                repeat = Boolean.parseBoolean(sc.nextLine());

            } while (repeat);
        } catch (InvalidGenderException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
