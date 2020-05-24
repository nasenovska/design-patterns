package com.uni.patterns.mediatorAndFactory.room;

import com.uni.patterns.mediatorAndFactory.factory.Factory;
import com.uni.patterns.mediatorAndFactory.participant.Bot;
import com.uni.patterns.mediatorAndFactory.participant.User;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    @Setter
    private static String name;

    @Setter
    private static List<User> participants = new ArrayList<>();

    @Setter
    private static Bot bot;

    private static final Factory factory = new Factory();

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void processMessage(User user, String message) {

        if (!participants.contains(user)) {
            System.out.println(String.format("Info message: %s is not joined in %s Chat Room!", user.getName(), name));
            return;
        }

        if (message == null || message.isEmpty()) {
            System.out.println(String.format("Info message: %s, you cannot send an empty message!", user.getName()));
            return;
        }

        System.out.println(String.format("New message: %s - %s: \033[3m %s \033[0m", LocalDateTime.now().format(dateTimeFormatter), user.getName(), message));

        giveBotToCheck(user, message);

    }

    public static void addUserToParticipants(User user) {
        if (user != null) {
            participants.add(user);
            System.out.println(String.format("%s is successfully added to %s Chat Room", user.getName(), name));
        }
    }

    public static void addUserToParticipants(List<User> users) {
        if (users != null && !users.isEmpty()) {
            participants.addAll(users);
            System.out.println("Some users are successfully added to " + name + " Chat Room: " + users.stream().map(User::getName).toString());
        }
    }

    public static void removeUserFromParticipants(User user) {
        if (user != null && participants.contains(user)) {
            participants.remove(user);
            System.out.println(String.format("%s is removed from %s Chat Room", user.getName(), name));
        }
    }

    private static void giveBotToCheck(User user, String message) {

        if (bot != null && message.contains("cat")) {
            bot.denyAccess(user);
            bot.inform();
        }

        if (message.contains("addBot")) {
            bot = factory.getBot();
        }
    }
}
