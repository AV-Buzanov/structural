package ru.iteco.structural.decorator.coffee;

/**
 * Brandy.
 *
 * @author Ilya_Sukhachev
 */
public class Brandy implements CoffeeIngredient {

    @Override
    public void showIngredient() {
        System.out.println("Brandy");
    }
}
