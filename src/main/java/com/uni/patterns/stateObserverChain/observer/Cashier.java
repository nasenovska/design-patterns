package com.uni.patterns.stateObserverChain.observer;

import com.uni.patterns.stateObserverChain.state.PendingState;
import com.uni.patterns.stateObserverChain.state.PrepareState;
import com.uni.patterns.stateObserverChain.state.ReadyState;
import com.uni.patterns.stateObserverChain.state.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cashier extends Employee {
    private String name;

    public Cashier(String name, ShipmentType shipmentType) {
        this.name = name;
        this.setShipmentType(shipmentType);
    }

    @Override
    public void subscribe(Observer observer) {
        observer.setEmployee(this);
        observer.setState(new PrepareState());
        this.setState(new PrepareState());
        this.setObserver(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observer.setState(new ReadyState());
        this.setState(new PendingState());
        this.setObserver(null);
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
