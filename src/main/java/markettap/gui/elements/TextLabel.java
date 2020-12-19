package markettap.gui.elements;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class TextLabel extends JLabel{

   
    private static final long serialVersionUID = 2135697020143459068L;
    private String labelText;

    protected TextLabel(String text){
        this.labelText = text;
        this.setText(labelText);
        this.setFont(new Font("Courier", Font.PLAIN, 20));
        this.setForeground(Color.WHITE);


    }

}
