package ru.iteco.structural.decorator.coffee;

/**
 * Milk.
 *
 * @author Ilya_Sukhachev
 */
public class Milk implements CoffeeIngredient {

    @Override
    public void showIngredient() {
        System.out.println("Milk");
    }
}
