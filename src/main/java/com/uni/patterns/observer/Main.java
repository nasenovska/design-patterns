package com.uni.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Trainer 2");
        FitnessInstructor fitnessInstructor = new FitnessInstructor("Instructor 2", trainer);

        List<Observer> viewers = getViewers();
        viewers.forEach(trainer::subscribe);

        System.out.println("\n    ---> Stand up <---    \n");
        fitnessInstructor.changeTraining(Training.STAND_UP);

        System.out.println("\n    ---> Lie down <---    \n");
        fitnessInstructor.changeTraining(Training.LIE_DOWN);

        System.out.println(String.format("\nViewer %s is unsubscribed... \n", viewers.get(1).getName()));
        trainer.unsubscribe(viewers.get(1));

        System.out.println("\n    ---> Stand up <---    \n");
        fitnessInstructor.changeTraining(Training.STAND_UP);

        System.out.println("\n    ---> Lie down <---    \n");
        fitnessInstructor.changeTraining(Training.LIE_DOWN);
    }

    private static List<Observer> getViewers() {
        List<Observer> viewers = new ArrayList<>();
        viewers.add(new Viewer("Viewer 4"));
        viewers.add(new Viewer("Viewer 5"));
        viewers.add(new Viewer("Viewer 6"));

        return viewers;
    }
}
