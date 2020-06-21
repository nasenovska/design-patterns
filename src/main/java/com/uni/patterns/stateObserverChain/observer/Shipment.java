package com.uni.patterns.stateObserverChain.observer;

import com.uni.patterns.stateObserverChain.state.PendingState;
import com.uni.patterns.stateObserverChain.state.State;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Shipment implements Observer {
    @NonNull
    private String id;
    private State state = new PendingState();
    private Observable observable;

    @Override
    public void update() {
        System.out.println("The state of the shipment is changed...");
        this.state = observable.getUpdate();
    }

    @Override
    public void setEmployee(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }
}
