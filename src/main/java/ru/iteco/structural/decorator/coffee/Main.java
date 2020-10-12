package ru.iteco.structural.decorator.coffee;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee(new Milk());
        coffee.showIngredient();
    }
}
