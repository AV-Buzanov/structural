package ru.iteco.structural.decorator.coffee;

/**
 * Sugar.
 *
 * @author Ilya_Sukhachev
 */
public class Sugar implements CoffeeIngredient {


    @Override
    public void showIngredient() {
        System.out.println("Sugar");
    }
}
