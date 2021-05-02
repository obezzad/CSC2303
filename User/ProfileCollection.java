package User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ProfileCollection{

    List<Profile> profiles;

    public ProfileCollection(){

    }
    public boolean addProfile(Profile p) {
        // comparison then add

            return false;
        }

    public boolean removeProfile(Profile p) {
        return false;
    }

    public void modifyProfile(Profile search, Profile newProfile) {
    }

    public Profile getProfileWithEmail(String email) {

        return null;
    }


    public void sortProfiles(Comparator<Profile> comp) {
    }

    public ListIterator<Profile> getProfiles() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

}