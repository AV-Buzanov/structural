package ru.iteco.structural.decorator.coffeeshop;

/**
 * Brandy.
 *
 * @author Ilya_Sukhachev
 */
public class Brandy extends CoffeeDecorator implements CoffeeIngredient {

    public Brandy(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        super.showIngredient();
        System.out.println("Brandy");
    }
}
