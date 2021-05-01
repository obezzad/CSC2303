package Messaging;

public enum Status {
    SENT(0),
    DELIEVERED(1),
    READ(2);

    private Status(int status_code) {
        this.status_code = status_code;
    }

    int status_code;

    public int getCode() {
        return status_code;
    }

    public Status getStatusByCode(int code) {
        switch (code) {
            case 0:
                return Status.SENT;
            case 1:
                return Status.DELIEVERED;
            case 2:
                return Status.READ;
        }
        return Status.READ;
    }
}
