package ru.iteco.structural.bridge.component.components;

import ru.iteco.structural.bridge.component.color.Color;

/**
 * Button.
 *
 * @author Ilya_Sukhachev
 */
public class Button extends Component {
    public Button(Color color) {
        super(color);
    }

    @Override
    public void work() {
        System.out.println("i work with color" + color.applyColor());
    }
}
