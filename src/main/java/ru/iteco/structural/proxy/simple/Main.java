package ru.iteco.structural.proxy.simple;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {
    public static void main(String[] args) {
//        Trainer object = new TrainerImpl();

        Trainer object = new TrainerProxy();
        object.process();
        object.process();
    }
}
