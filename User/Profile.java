package User;

import Timeline.Tweet.Tweet;



public class Profile {

    private String email;

    private String description;

    private String profile_picture;

    private Tweet pin;

    private String phone;

    private AssociatedList<String> topic;

    private Gender gender;
    
    
    public Profile(String gender, String email, String phone) throws InvalidGenderException {
        setGender(gender);
        this.email = email;
        this.phone = phone;
    }

    public Profile(String gender, String email, String description, String phone, String topic) throws InvalidGenderException {
        this(gender, email, phone); 
        this.description = description;
        this.topic = topic;
    }

    public Profile(String gender, String email, String description, String profile_picture, String phone, String topic) throws InvalidGenderException {
        this(gender, email, description, phone, topic); 
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

    public String getTopic() {
        return topic;
    }

    public void setTopics(String topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Profile){
          Profile p = (Profile) obj;
          return this.email.equals(p.getEmail());
        }
        return false;
    }

    @Override
    public String toString() {
        return description;
    }

}
