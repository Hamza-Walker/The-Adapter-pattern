package com.walker.notificationSender;

public class EmailSender implements NotificationAdapter {
    @Override
    public void sendNotification(String toEmail, String body) {
        System.out.println("Sending email to " + toEmail + " with message: " + body);
    }
}
