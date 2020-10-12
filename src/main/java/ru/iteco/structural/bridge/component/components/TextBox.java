package ru.iteco.structural.bridge.component.components;

import ru.iteco.structural.bridge.component.color.Color;

/**
 * TextBox.
 *
 * @author Ilya_Sukhachev
 */
public class TextBox extends Component {
    public TextBox(Color color) {
        super(color);
    }

    @Override
    public void work() {
        System.out.println("i work with color" + color.applyColor());
    }
}
