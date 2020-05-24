package com.uni.patterns.mediatorAndFactory.factory;

import com.uni.patterns.mediatorAndFactory.participant.Bot;

public class BotFactory {
    Bot getBot() {
        return new Bot();
    }
}
