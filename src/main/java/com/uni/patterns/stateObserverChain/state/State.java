package com.uni.patterns.stateObserverChain.state;

import com.uni.patterns.stateObserverChain.observer.Shipment;

public interface State {

    void changeState(Shipment shipment);
}
