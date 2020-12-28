package markettap.gui.models;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class StreamPick extends JPanel {

    private static final long serialVersionUID = -7042497925964036549L;

    public JComboBox<String> selector;
    private String[] items;
    
    public StreamPick(String items[]){
        this.items = items;
        this.selector = new JComboBox<String>(items);
        this.selector.setSelectedIndex(items.length-1);
        this.selector.addActionListener(selector);
        

    }
    
    
}
