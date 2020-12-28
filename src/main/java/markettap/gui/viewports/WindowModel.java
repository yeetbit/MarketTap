package markettap.gui.viewports;

import java.awt.*;
import javax.swing.*;


public class WindowModel extends JFrame {
    
    private static final long serialVersionUID = 1135697020143459067L;
    private String windowTitle;
    private int sizeWidth;
    private int sizeHeight;
    
    
    public WindowModel(String title, int width, int height, String backGroundColor){
        this.windowTitle = title;
        this.sizeWidth = width;
        this.sizeHeight = height;
        
        this.setTitle(windowTitle);
        this.setSize(sizeWidth, sizeHeight);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.decode(backGroundColor));
        this.setLayout( new FlowLayout());
        // this.pack();
        // this.setVisible(true);

        
    }

    public void adjusthHeight(){

    }


}