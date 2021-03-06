package ru.iteco.structural.bridge.component.components;

import ru.iteco.structural.bridge.component.color.Color;

/**
 * ComboBox.
 *
 * @author Ilya_Sukhachev
 */
public class ComboBox extends Component {
    public ComboBox(Color color) {
        super(color);
    }

    @Override
    public void work() {
        System.out.println("i work with color" + color.applyColor());
    }
}
