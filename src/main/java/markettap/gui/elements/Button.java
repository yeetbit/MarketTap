package markettap.gui.elements;

import javax.swing.JButton;
import java.awt.Color;

public class Button extends JButton {

    private static final long serialVersionUID = 3581672446431798828L;
    

    public Button(String name, int posX, int posY, String textColor, String buttonColor) {
        this.setText(name);
        this.setForeground(Color.decode(textColor));
        this.setBackground(Color.decode(buttonColor));

        this.setBounds(posX, posY, 0,0);
        this.setFocusable(false);   
        
    }


}
