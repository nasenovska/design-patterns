package com.uni.patterns.stateObserverChain.observer;

import com.uni.patterns.stateObserverChain.state.PendingState;
import com.uni.patterns.stateObserverChain.state.ReadyState;
import com.uni.patterns.stateObserverChain.state.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Forwarder extends Employee {

    public Forwarder(ShipmentType shipmentType) {
        this.setShipmentType(shipmentType);
    }

    @Override
    public void subscribe(Observer observer) {
        observer.setEmployee(this);
        observer.setState(new ReadyState());
        this.setState(new ReadyState());
    }

    @Override

    public void unsubscribe(Observer observer) {
        observer.setState(new PendingState());
        this.setObserver(observer);
        this.setState(new PendingState());
    }

    @Override
    public void notifyObservers() {
        getObserver().update();
    }

    @Override
    public State getUpdate() {
        return getState();
    }
}
