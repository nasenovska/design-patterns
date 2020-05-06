package com.uni.patterns.observer;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Viewer implements Observer {
    @NonNull
    private String name;
    private Training training;
    private Observable observable;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update() {
        if (observable == null) {
            System.out.println("Trainer is not found.");
            return;
        }

        training = observable.getUpdate();
        System.out.println(String.format("%s at this moment is following the command: %s", name, training.getValue()));
    }

    @Override
    public void setTrainer(Observable observable) {
        this.observable = observable;
    }
}
