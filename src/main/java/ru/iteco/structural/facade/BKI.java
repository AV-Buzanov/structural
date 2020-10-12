package ru.iteco.structural.facade;

/**
 * BKI.
 *
 * @author Ilya_Sukhachev
 */
public interface BKI {

    int getDebt(String username);
    boolean isExpired(String username);

}
