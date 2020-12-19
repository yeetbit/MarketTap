package markettap.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import markettap.gui.art.Art;
import markettap.gui.models.StreamPick;
import markettap.gui.models.topModel;
import markettap.gui.viewports.WindowModel;


public class GuiBuilder extends Thread implements ActionListener, MouseListener{

    // GUI builder builds de global window with the on first hand the User controls to initiate Streams

    // used Color Theme light to dark: F8B195   F67280   C06C84   6C5B7B   355C7D 
    // or more greenisch light to dark: E5FCC2   9DE0AD   45ADA8   547980   594F4F 

    WindowModel window;

    // Art
    private String backgroundcolor;
    private String colorLayer1;
    private String colorLayer2;
    private String colorLayer3;
    private String colorLayer4;
    private ImageIcon trackRecordIcon;
    private ImageIcon addTrackRecordIcon;
    private ImageIcon removeCryptoIcon;
    private Art art;
    private topModel topBar;
    private StreamPick pick;
    

    public GuiBuilder() {
        // initIcons(); // load icons outside in global thread
        initThemeColor("a");
        run(); // start new thread to create base window with menu buttons
    }

    @Override
    public void run(){
        
        baseWindow();
        //initIcons();
    };

    private void baseWindow(){
        
        window = new WindowModel("Crypto Listener", 388, 512, backgroundcolor);
        topBar = new topModel(backgroundcolor, colorLayer3, colorLayer4);
        window.setLayout(new BorderLayout());
        window.add(topBar, BorderLayout.NORTH);
        window.setVisible(true);
        topBar.addStreamButton.addActionListener(this);;
        topBar.importButton.addActionListener(this);
        topBar.accountButton.addActionListener(this);
        topBar.aboutButton.addActionListener(this);
    }

    private void initThemeColor(String selection){
        if(selection == "a"){
            backgroundcolor = "#355C7D";
            colorLayer1 = "#F67280";
            colorLayer2 = "#C06C84";
            colorLayer3 = "#6C5B7B";
            colorLayer4 = "#5F67280";
      
        }else if(selection == "b"){
            backgroundcolor = "#E5FCC2";
            colorLayer1 = "#9DE0AD";
            colorLayer2 = "#45ADA8";
            colorLayer3 = "#547980";
            colorLayer4 = "#594F4F";
      
        }else{
            defaultTheme();
        }
    }

    public void defaultTheme(){
        initThemeColor("a");
    }

    private void initIcons(){
        trackRecordIcon = new ImageIcon(art.getCoinmenu()); 
        addTrackRecordIcon = new ImageIcon(art.getCoinnodes32());
        removeCryptoIcon = new ImageIcon(art.getCoinedit32());

    }

    private void newStream(){
        window.add(pick);
        // streamModel = new StreamModel(name);
        

    }

    // private String[] collectStreamableItems(){
    //     String jeMoeder[];

    //     return jeMoeder;

    // }

    @Override
    public void actionPerformed(ActionEvent e){
       
        if(e.getSource()==topBar.addStreamButton){
            System.out.println("pressed add stream button");
            newStream();
        }else if(e.getSource()==topBar.importButton){
            System.out.println("pressed import button");
        }else if(e.getSource()==topBar.aboutButton){
            System.out.println("pressed about button");
        }else if(e.getSource()==topBar.accountButton){
            System.out.println("pressed account button");            
        }else{
            System.out.println("something went wrong, button id is: "+e.getSource());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }


    // // static methods
    // protected static void EventHandling(int iD){
    //     if(iD==1){
    //         System.out.println("pressed add stream button");
    //     }else if(iD==2){
    //         System.out.println("pressed import button");
    //     }else if(iD==4){
    //         System.out.println("pressed about button");
    //     }else if(iD==3){
    //         System.out.println("pressed account button");            
    //     }else{
    //         System.out.println("something went wrong, button id is: "+iD);
    //     }
    // }





    


}
