package com.uni.patterns.command;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Viewer {
    @NonNull
    private String name;
    private Training training;

    public void setTraining(Training training) {
        this.training = training;
        System.out.println(String.format("%s at this moment is following the command: %s", name, training.getValue()));
    }
}
