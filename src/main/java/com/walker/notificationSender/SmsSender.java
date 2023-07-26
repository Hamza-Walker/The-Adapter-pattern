package com.walker.notificationSender;

public class SmsSender implements NotificationAdapter {
    @Override
    public void sendNotification(String toNumber, String message) {
        System.out.println("Sending SMS to " + toNumber + " with message: " + message);
    }
}
