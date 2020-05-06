package com.uni.patterns.observer;

public interface Observable {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();

    Training getUpdate();
}
