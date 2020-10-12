package ru.iteco.structural.proxy.simple;


public class TrainerProxy implements Trainer {

    private static Trainer trainer;

    @Override
    public void process() {
        if(trainer == null) {
            trainer = new TrainerImpl();
        }
        trainer.process();
        System.out.println("proxy complete.");
    }
}
