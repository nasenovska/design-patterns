package com.uni.patterns.observer;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Trainer implements Observable {
    @NonNull
    private String name;
    private List<Observer> observers = new ArrayList<>();
    private Training training;

    public void setTraining(Training training) {
        this.training = training;
        System.out.println(String.format("Trainer %s is following: %s", name, training.getValue()));
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        observer.setTrainer(this);
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public Training getUpdate() {
        return training;
    }
}
