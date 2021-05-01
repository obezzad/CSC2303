package User;

public class Notification {

    private boolean notif;

    public Notification(boolean notif) {
        this.notif = notif;
    }

    public boolean isNotif() {
        return notif;
    }

    public void setNotif(boolean notif) {
        this.notif = notif;
    }

    @Override
    public String toString() {
        return "Notification\t:\t" + "\n\t\tnotif\t=\t" + notif;
    }
}
