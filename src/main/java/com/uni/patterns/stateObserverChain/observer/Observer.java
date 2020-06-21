package com.uni.patterns.stateObserverChain.observer;

import com.uni.patterns.stateObserverChain.state.State;

public interface Observer {

    void update();

    void setEmployee(Observable observable);

    void setState(State state);
}
