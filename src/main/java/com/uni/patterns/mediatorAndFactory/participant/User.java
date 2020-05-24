package com.uni.patterns.mediatorAndFactory.participant;

import lombok.AllArgsConstructor;
import lombok.Data;

import static com.uni.patterns.mediatorAndFactory.room.ChatRoom.processMessage;

@Data
@AllArgsConstructor
public class User {
    private String name;

    public void sendMessage(String message) {
        processMessage(this, message);
    }
}
