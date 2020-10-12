package ru.iteco.structural.decorator.coffeeshop;

/**
 * Milk.
 *
 * @author Ilya_Sukhachev
 */
public class Milk extends CoffeeDecorator implements CoffeeIngredient {

    public Milk(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        super.showIngredient();
        System.out.println("Milk");
    }
}
