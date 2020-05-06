package com.uni.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandUpCommand implements Command {

    private Trainer trainer;

    @Override
    public void executeCommand() {
        this.trainer.setTraining(Training.STAND_UP);
    }
}
