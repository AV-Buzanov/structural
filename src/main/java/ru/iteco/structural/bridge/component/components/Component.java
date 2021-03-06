package ru.iteco.structural.bridge.component.components;

import ru.iteco.structural.bridge.component.color.Color;

/**
 * Component.
 *
 * @author Ilya_Sukhachev
 */
public abstract class Component {

    protected Color color;

    public Component(Color color) {
        this.color = color;
    }

    public abstract void work();
}
