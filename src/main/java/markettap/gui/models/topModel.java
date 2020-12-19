package markettap.gui.models;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import markettap.gui.elements.Button;

public class topModel extends JPanel{
   

    private static final long serialVersionUID = 7280652693506778109L;
    public Button addStreamButton;
    public Button importButton;
    public Button accountButton;
    public Button aboutButton;

    public topModel(String backgroundcolor, String colorLayer1, String colorLayer2){
        addStreamButton = new Button("add Stream", 0, 0, colorLayer1, colorLayer2);
        importButton = new Button("import", 0, 0, colorLayer1, colorLayer2);
        accountButton = new Button("account", 0, 0, colorLayer1, colorLayer2);
        aboutButton = new Button("about", 0, 0, colorLayer1, colorLayer2);

        this.setPreferredSize(new Dimension(320, 32));
        this.setBackground(Color.decode(backgroundcolor));  
        this.add(importButton);        
        this.add(accountButton);
        this.add(aboutButton);
        this.add(addStreamButton);
        //this.setBackground(Color.BLACK);
    
    }

    
    
}
