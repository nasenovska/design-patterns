package com.uni.patterns.command;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Trainer {
    @NonNull
    private String name;
    private Training training;
    private List<Viewer> viewers = new ArrayList<>();

    public void setTraining(Training training) {
        this.training = training;
        System.out.println(String.format("Trainer %s is following: %s", name, training.getValue()));
        viewers.forEach(viewer -> viewer.setTraining(training));
    }

    public void watchTraining(Viewer viewer) {
        this.viewers.add(viewer);
    }
}
