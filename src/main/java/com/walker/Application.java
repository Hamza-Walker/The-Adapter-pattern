package com.walker;

import com.walker.adapter.FacebookAdapter;
import com.walker.model.User;
import com.walker.notificationSender.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        List<User> users = generateRandomUsers();

        // Create instances of the notification adapters
        NotificationAdapter smsAdapter = new SmsSender();
        NotificationAdapter emailAdapter = new EmailSender();
        NotificationAdapter toastAdapter = new ToastNotificationSender();
        NotificationAdapter facebookAdapter = new FacebookAdapter(new FacebookMessengerSender());


        for (User user : users) {
            smsAdapter.sendNotification(user.phoneNumber(), "Hello!");
            emailAdapter.sendNotification(user.email(), "Codecool, Notification,  Hello!");
            toastAdapter.sendNotification(user.userName(), "Hello!");
            facebookAdapter.sendNotification(user.userName(), "marksncuker flucker");
        }
    }

    private static List<User> generateRandomUsers() {

        Random random = new Random();

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy"};
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "aol.com"};
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            String name = names[random.nextInt(names.length)];
            String domain = domains[random.nextInt(domains.length)];
            String email = name + "@" + domain;
            String phone = "(" + random.nextInt(1000) + ") " + random.nextInt(1000) + "-" + random.nextInt(10000);

            User user = new User(name, email, phone);
            users.add(user);
        }
        return users;
    }
}
