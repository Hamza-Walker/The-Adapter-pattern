package com.walker.adapter;

import com.walker.notificationSender.FacebookMessengerSender;
import com.walker.notificationSender.NotificationAdapter;

public class FacebookAdapter implements NotificationAdapter {

    private final FacebookMessengerSender facebookMessengerSender;

    public FacebookAdapter(FacebookMessengerSender facebookMessengerSender) {
        this.facebookMessengerSender = facebookMessengerSender;
    }

    @Override
    public void sendNotification(String recipient, String message) {
        // For Facebook Messenger, we assume the recipient is the user's ID
        facebookMessengerSender.sendFacebookMessage(recipient, message);
    }
}