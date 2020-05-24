package com.uni.patterns.mediatorAndFactory.factory;

public class Factory extends ParticipantFactory {

    public Factory() {
        userFactory = new UserFactory();
        botFactory = new BotFactory();
    }
}
