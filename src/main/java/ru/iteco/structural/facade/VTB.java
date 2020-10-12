package ru.iteco.structural.facade;

/**
 * VTB.
 *
 * @author Ilya_Sukhachev
 */
public class VTB implements Bank {
    @Override
    public int getCurrentAmount(String username) {
        switch (username) {
            case "Vasya":
                return 1_000;
            case "Petya":
                return 2_000;
            default:
                return 0;

        }
    }
}
