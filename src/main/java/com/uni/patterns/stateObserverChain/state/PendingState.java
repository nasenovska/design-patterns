package com.uni.patterns.stateObserverChain.state;

import com.uni.patterns.stateObserverChain.observer.Shipment;

public class PendingState implements State {

    @Override
    public void changeState(Shipment shipment) {
        System.out.println("State is updated to: PENDING..");
        shipment.setState(this);
    }
}
