package ru.iteco.structural.decorator.coffee;

/**
 * CoffeeDecorator.
 *
 * @author Ilya_Sukhachev
 */
public abstract class CoffeeDecorator implements CoffeeIngredient {

    protected CoffeeIngredient innerIngredient;

    public CoffeeDecorator(CoffeeIngredient innerIngredient) {
        this.innerIngredient = innerIngredient;
    }


    @Override
    public void showIngredient() {
        innerIngredient.showIngredient();
    }
}
