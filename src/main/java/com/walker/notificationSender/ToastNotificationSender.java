package com.walker.notificationSender;

public class ToastNotificationSender implements NotificationAdapter {
    @Override
    public void sendNotification(String username, String message) {
        System.out.println("Sending toast notification to " + username + " with message: " + message);
    }

}
