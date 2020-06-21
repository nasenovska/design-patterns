package com.uni.patterns.stateObserverChain.observer;

import com.uni.patterns.stateObserverChain.state.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Employee implements Observable {
    private State state;
    private ShipmentType shipmentType;
    private Observer observer;
}
