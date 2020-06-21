package com.uni.patterns.stateObserverChain.chain;

import com.uni.patterns.stateObserverChain.observer.Forwarder;

public class ForwarderHandler extends EmployeeHandler<Forwarder> {

    public ForwarderHandler(Forwarder forwarder) {
        super(forwarder);
    }

    @Override
    public void setNextEmployee(EmployeeHandler<Forwarder> handler) {
        super.setNextEmployee(handler);
    }
}
