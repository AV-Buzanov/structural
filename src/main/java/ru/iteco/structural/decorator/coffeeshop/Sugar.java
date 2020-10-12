package ru.iteco.structural.decorator.coffeeshop;

/**
 * Sugar.
 *
 * @author Ilya_Sukhachev
 */
public class Sugar
        extends CoffeeDecorator
        implements CoffeeIngredient {

    public Sugar(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        innerIngredient.showIngredient();
        System.out.println("Sugar");
    }
}
