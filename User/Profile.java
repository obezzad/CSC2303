package User;

import Aggregation.CustomCollection;
import Timeline.Tweet.Tweet;



public class Profile {

    private String email;

    private String description;

    private String profile_picture;

    private Tweet pin;

    private String phone;

    private CustomCollection<String> topic;

    private Gender gender;

    // TODO: Add all constructors to make all combinations of Phone, Description, and Profile Picture optional.
    
    public Profile(String gender, String email, String phone) throws InvalidGenderException {
        setGender(gender);
        this.email = email;
        this.phone = phone;
        this.topic = new CustomCollection<>();
    }

    public Profile(String gender, String email, String description, String phone) throws InvalidGenderException {
        this(gender, email, phone); 
        this.description = description;
    }

    public Profile(String gender, String email, String description, String profile_picture, String phone) throws InvalidGenderException {
        this(gender, email, description, phone);
        this.profile_picture = profile_picture;
    }
    

    public Gender getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidGenderException {
        
        for(Gender g: Gender.values()){
            if(gender.equalsIgnoreCase(g.name())){
                this.gender = g;
                return;
            }
        }
        throw new InvalidGenderException(gender);
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public Tweet getPin() {
        return pin;
    }

    public void setPin(Tweet pin) {
        this.pin = pin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CustomCollection<String> getTopic() {
        return topic;
    }

    public void setTopics(CustomCollection<String> topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Profile) {
            Profile p = (Profile) obj;
            return this.email.equals(p.getEmail());
        }
        return false;
    }

    /*

    // TODO: UPDATE TOSTRING
    @Override
    public String toString() {
        return description;
    }

     */

}