package Messaging;

import User.Account;
import java.util.GregorianCalendar;

public class Message {

    private String text;

    private GregorianCalendar date;

    private Account sender_receiver;

    private Status status;

    public Message(String text, GregorianCalendar date, Account sender_receiver, Status status) {
        this.text = text;
        this.date = date;
        this.sender_receiver = sender_receiver;
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public Account getSender_receiver() {
        return sender_receiver;
    }

    public void setSender_receiver(Account sender_receiver) {
        this.sender_receiver = sender_receiver;
    }

    public Status getStatus() {
        return status;
    }

    public void updateStatus(Status status) {
        this.status = status.getStatusByCode(status.getCode() + 1);
    }

    @Override
    public String toString() {
        return text;
    }
}
