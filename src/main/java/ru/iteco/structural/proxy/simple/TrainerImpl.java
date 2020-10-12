package ru.iteco.structural.proxy.simple;


public class TrainerImpl implements Trainer {

    public TrainerImpl() {
        System.out.println("create TrainerImpl");
    }

    @Override
    public void process() {
        System.out.println("processing complete.");
    }
}
