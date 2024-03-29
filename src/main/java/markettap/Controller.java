package markettap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import markettap.api_exchange.ApiMgr;
import markettap.gui.art.Art;
import markettap.gui.models.MenuBarModel;
import markettap.gui.models.StreamModel;
import markettap.gui.models.StreamPick;
import markettap.gui.models.topModel;
import markettap.gui.models.MenuBarModel.MenuModel;
import markettap.gui.viewports.WindowModel;
import markettap.api_exchange.StaticMethods;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

/* 
 TODO: 
 XX-12-2020
 Need to populate this Controller class with the API handling of some sort,
 this because the Java-WebSocket class has Overridden "listener" methods which cannot
 be accessed from outside. At least not in the way that I want, so i have to rearrange a little bit.

 10-02-2021
 Rethinking the pattern design, scheduled lessons for design patterns to fix multiple problems.
 Based on new theory's we have to work more with classes and intefaces, and create more abstraction.
 example, create classes with abstract methods or more like interfaces which inherit the Super class
 properties and modify actions within the interface. 

 02-02-2021
 Working on eventhandler solutions
 */

public class Controller extends Thread {

    // GUI builder builds de global window with the on first hand the User controls to initiate Streams
    // used Color Theme light to dark: F8B195   F67280   C06C84   6C5B7B   355C7D 
    // or more greenisch light to dark: E5FCC2   9DE0AD   45ADA8   547980   594F4F 

    // Instances
    private WindowModel window;
    private topModel topBar;
    private MenuBarModel menu;
    private JTextArea ta;
    private StreamPick pick;
    private WebSocketClient wsc;
    private ArrayList<ApiMgr> apiStack = new ArrayList<>();
    private ArrayList<StreamModel> strStack = new ArrayList<>();
    private ArrayList<MenuBarModel.MenuItemModel> eventStack = new ArrayList<>();
    private ApiMgr apiMgr = new ApiMgr();
    

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
        
    // Global Variables
    private boolean messageState = false;

    public Controller() {
        // initIcons(); // load icons outside in global thread
        initThemeColor("a");
        run(); // start new thread to create base window with menu buttons
    }

    @Override
    public void run(){

        baseWindow();
    };

    

    private void baseWindow(){
        
        window = new WindowModel("Crypto Listener", 388, 512, backgroundcolor);
        menu = new MenuBarModel();
        window.setJMenuBar(menu);
        window.setVisible(true);
        //window.pack();
        String[] ar = apiMgr.getArrayOfAllCoins();


        /* 
        TODO:
            Make actionlisteners dynamically generated, use with innerclasses/anonymous classes
        
        */

        Double returnValues[] = StaticMethods.change(12.34, 100.39);

        
        menu.getChangeTap().addActionListener((ae) -> clickEvent());
        menu.getCloseTap().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                clickEvent2();
            }
        });

        /* 
            Implementation for eventhandling is on its way, but needs more finetuning to be dynamic
        */
        // menu.getCreateNewTap().addActionListener();
        // menu.getModifyConfig().addActionListener(this);
        // menu.getNewWarning().addActionListener(this);
        // menu.getChangeWarning().addActionListener(this);
        // menu.getRemoveWarning().addActionListener(this);
        // menu.getImportExport().addActionListener(this);
        // menu.getPreferences().addActionListener(this);
        // menu.getExit().addActionListener(this);
        // menu.getA().addActionListener(this);
        // menu.getB().addActionListener(this);
        // menu.getLarger().addActionListener(this);
        // menu.getSmaller().addActionListener(this);
        // menu.getWelcome().addActionListener(this);
        // menu.getDebug().addActionListener(this);
        // menu.getChat().addActionListener(this);
        // menu.getAbout().addActionListener(this);




        

    }

    public void clickEvent(){
        System.out.println("The lambda expression worked!");
    };
    private void clickEvent2(){
        System.out.println("The Anonymous method worked!");

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

    private String newStream(){
        apiMgr.readObjects();
        String[] arrayOf = apiMgr.getArrayOfAllCoins();
        pick = new StreamPick(arrayOf);
        window.add(pick);
        
        StreamModel str;

        return null;
    }

    private void initStreamUI(String name){
        
    }

   

    private void initWebSocket(String uri){

        ta.append("\n"+"Create WSS instance");
        try {
            wsc = new WebSocketClient(new URI(uri), new Draft_6455()) {
                @Override
                public void onMessage(String message) {
                    // JSONObject obj = new JSONObject(message);
                    // String channel = obj.getString("channel");
                    // messageState = true;
                    // ta.append("\n"+"Echo from server: "+message);
                    // InetSocketAddress addr = this.getRemoteSocketAddress();
                    // ta.append("\n"+"IPv4 Address: "+addr.toString());

                    newStream();
                }

                @Override
                public void onOpen(ServerHandshake handshake) {
                    send("connection Str7634");
                    ta.append("\n"+"opened connection, handshake: "+"\n"+handshake.getHttpStatusMessage());
                }

                @Override
                public void onClose(int code, String reason, boolean remote) {
                    ta.append("\n"+"closed connection");
                }

                @Override
                public void onError(Exception ex) {
                    ex.printStackTrace();
                }

            };
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
