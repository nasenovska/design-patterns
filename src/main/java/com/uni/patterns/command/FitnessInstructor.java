package com.uni.patterns.command;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class FitnessInstructor {
    @NonNull
    private String name;
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void changeTraining() {
        System.out.println(String.format("Fitness instructor %s is changing the command...", name));
        this.command.executeCommand();
    }
}
