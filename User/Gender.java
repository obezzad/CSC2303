package User;

public enum Gender {
    MALE(1),
    FEMALE(2),
    UNSPECIFIED(3);
    private int gender_code;

    private Gender(int gender_code) {
        this.gender_code = gender_code;
    }

    public int getGenderCode() {
        return gender_code;
    }

    public static Gender getGenderByCode(int gender_code) {
        Gender gender = null;

        switch (gender_code) {
            case 1:
                gender = MALE;
                break;
            case 2:
                gender = FEMALE;
                break;
            case 3:
                gender = UNSPECIFIED;
                break;
        }

        return gender;
    }
}
