package com.uni.patterns.mediatorAndFactory.factory;

import com.uni.patterns.mediatorAndFactory.participant.User;

public class UserFactory {
    User getUser(String name) {
        return new User(name);
    }
}
