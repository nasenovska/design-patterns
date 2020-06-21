package com.uni.patterns.stateObserverChain.observer;


import com.uni.patterns.stateObserverChain.state.State;

public interface Observable {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();

    State getUpdate();
}
