package com.uni.patterns.mediatorAndFactory.participant;

import static com.uni.patterns.mediatorAndFactory.room.ChatRoom.removeUserFromParticipants;

public class Bot {

    public void inform() {
        System.out.println("Info message from Bot: Cat is not allowed word!");
    }

    public void denyAccess(User user) {
        removeUserFromParticipants(user);
    }
}
