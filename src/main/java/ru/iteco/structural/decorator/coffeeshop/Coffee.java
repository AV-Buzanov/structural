package ru.iteco.structural.decorator.coffeeshop;

/**
 * Coffee.
 *
 * @author Ilya_Sukhachev
 */
public class Coffee extends CoffeeDecorator {
    public Coffee(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("Coffee ");
        super.showIngredient();
    }
}
