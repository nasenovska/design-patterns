package com.uni.patterns.mediatorAndFactory.factory;

import com.uni.patterns.mediatorAndFactory.participant.Bot;
import com.uni.patterns.mediatorAndFactory.participant.User;

public abstract class ParticipantFactory {
    public UserFactory userFactory;
    public BotFactory botFactory;

    public User getUser(String name) {
        return userFactory.getUser(name);
    }

    public Bot getBot() {
        return botFactory.getBot();
    }
}
