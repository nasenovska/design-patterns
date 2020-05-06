package com.uni.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FitnessInstructor fitnessInstructor = new FitnessInstructor("Instructor 1");
        Trainer trainer = new Trainer("Trainer 1");

        List<Viewer> viewers = getViewers();
        viewers.forEach(trainer::watchTraining);

        Command standUpCommand = new StandUpCommand(trainer);
        Command lieDownCommand = new LieDownCommand(trainer);

        System.out.println("\n    ---> Stand up <---    \n");
        fitnessInstructor.setCommand(standUpCommand);
        fitnessInstructor.changeTraining();

        System.out.println("\n    ---> Lie down <---    \n");
        fitnessInstructor.setCommand(lieDownCommand);
        fitnessInstructor.changeTraining();

        System.out.println("\n    ---> Stand up <---    \n");
        fitnessInstructor.setCommand(standUpCommand);
        fitnessInstructor.changeTraining();

        System.out.println("\n    ---> Lie down <---    \n");
        fitnessInstructor.setCommand(lieDownCommand);
        fitnessInstructor.changeTraining();
    }

    private static List<Viewer> getViewers() {
        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("Viewer 1"));
        viewers.add(new Viewer("Viewer 2"));
        viewers.add(new Viewer("Viewer 3"));

        return viewers;
    }
}
