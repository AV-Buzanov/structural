package ru.iteco.structural.composite;

/**
 * MenuComponent.
 *
 * @author Ilya_Sukhachev
 */
public abstract class MenuComponent {

    protected String name;

    protected MenuComponent(String name) {
        this.name = name;
    }

    public abstract boolean isAvailable();

    public abstract String render();
}
