package com.uni.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FitnessInstructor {
    private String name;
    private Trainer trainer;

    public void changeTraining(Training training) {
        System.out.println(String.format("Fitness instructor %s is changing the command...", name));
        trainer.setTraining(training);
    }
}
