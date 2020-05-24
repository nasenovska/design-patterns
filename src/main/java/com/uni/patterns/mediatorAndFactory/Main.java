package com.uni.patterns.mediatorAndFactory;

import com.uni.patterns.mediatorAndFactory.factory.Factory;
import com.uni.patterns.mediatorAndFactory.factory.ParticipantFactory;
import com.uni.patterns.mediatorAndFactory.participant.User;
import com.uni.patterns.mediatorAndFactory.room.ChatRoom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParticipantFactory factory = new Factory();

        List<User> users = getPredefinedParticipants(factory);
        ChatRoom.setName("Cat fans");
        ChatRoom.addUserToParticipants(users);
        users.get(0).sendMessage("Hello!");
        users.get(1).sendMessage("Ciao!");
        users.get(2).sendMessage("Hola!");
        users.get(3).sendMessage("Bonjour!");
        users.get(4).sendMessage("Do you like cats?");
        users.get(0).sendMessage("");
        users.get(4).sendMessage(null);
        users.get(1).sendMessage("Yes. But now I will addBot to this Chat and he will not give us to talk about them.");
        users.get(2).sendMessage("Noooo...I just waned talk abut cats!");
        users.get(5).sendMessage("Hey, are you there?");
        users.get(2).sendMessage("Yes, I am here! Do you hear me?");
    }

    private static List<User> getPredefinedParticipants(ParticipantFactory factory) {
        List<User> predefinedParticipants = new ArrayList<>();
        predefinedParticipants.add(factory.getUser("Ivan"));
        predefinedParticipants.add(factory.getUser("Boris"));
        predefinedParticipants.add(factory.getUser("Ani"));
        predefinedParticipants.add(factory.getUser("Ruska"));
        predefinedParticipants.add(factory.getUser("Georgi"));
        predefinedParticipants.add(factory.getUser("Yanka"));

        return predefinedParticipants;
    }
}
