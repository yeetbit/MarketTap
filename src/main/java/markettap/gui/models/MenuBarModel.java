package markettap.gui.models;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.util.ArrayList;

public class MenuBarModel extends JMenuBar{
    
    private static final long serialVersionUID = -1965926954804999754L;

    private MenuModel edit;
    private MenuModel taps;
    private MenuItemModel openTap;
    private MenuItemModel changeTap;
    private MenuItemModel closeTap;
    private MenuItemModel createNewTap;
    private MenuItemModel modifyConfig;

    private MenuModel warnings;
    private MenuItemModel newWarning;
    private MenuItemModel changeWarning;
    private MenuItemModel removeWarning;
    private MenuModel importExport;
    private MenuItemModel preferences;
    private MenuItemModel exit;
    
    private MenuModel view;
    private MenuModel theme;
    private MenuItemModel a;
    private MenuItemModel b;
    private MenuModel window;
    private MenuItemModel larger;
    private MenuItemModel smaller;

    private MenuModel help;
    private MenuItemModel welcome;
    private MenuItemModel debug;
    private MenuItemModel chat;
    private MenuItemModel about;


    // private ArrayList<MenuModel> menus;
    // private ArrayList<MenuItemModel> items;


    public MenuBarModel(){

        // this.menus = new ArrayList<MenuModel>();
        // this.items = new ArrayList<MenuItemModel>();
        
        edit = new MenuModel("edit");
        taps = new MenuModel("taps");
        openTap = new MenuItemModel("open");
        changeTap = new MenuItemModel("modify");
        closeTap = new MenuItemModel("delete");
        createNewTap = new MenuItemModel("new entry");
        modifyConfig = new MenuItemModel("edit connections");

        warnings = new MenuModel("warnings");
        newWarning = new MenuItemModel("new");
        changeWarning = new MenuItemModel("modify");
        removeWarning = new MenuItemModel("delete");
    
        importExport = new MenuModel("import export");
        preferences = new MenuItemModel("preferences");
        exit = new MenuItemModel("exit");

        view = new MenuModel("view");
        theme = new MenuModel("theme");
        a = new MenuItemModel("theme A");
        b = new MenuItemModel("theme B");
        window = new MenuModel("window");
        larger = new MenuItemModel("larger");
        smaller = new MenuItemModel("smaller");
    
        help = new MenuModel("help");
        welcome = new MenuItemModel("welcome");
        debug = new MenuItemModel("debug");
        chat = new MenuItemModel("chat");
        about = new MenuItemModel("about");

        taps.add(openTap);
        taps.add(changeTap);
        taps.add(closeTap);
        taps.add(createNewTap);
        taps.add(modifyConfig);
        edit.add(taps);

        warnings.add(newWarning);
        warnings.add(changeWarning);
        warnings.add(removeWarning);
        edit.add(warnings);

        edit.add(importExport);
        edit.add(preferences);
        edit.add(exit);
        
        theme.add(a);
        theme.add(b);
        view.add(theme);

        window.add(larger);
        window.add(smaller);
        view.add(window);

        help.add(welcome);
        help.add(debug);
        help.add(chat);
        help.add(about);
        this.add(edit);
        this.add(view);
        this.add(help);

    }
    // public void setName(String name){
    //     this.setName(name);
    // }

    // public String getName(){
    //     return this.getName();
    // }
    
    // public void setBackground(String bgHex){
    //     this.setBackground(Color.decode(bgHex));
    // }
    
    // public void setMenus(MenuModel m){
    //     this.menus.add(m);
    // }
    
    public class MenuModel extends JMenu{
        
        private static final long serialVersionUID = 1L;
        // private ArrayList<MenuModel> menus; 
        // private ArrayList<MenuItemModel> items;

        // public MenuModel(){
        //     this.menus = new ArrayList<MenuModel>();
        //     this.items = new ArrayList<MenuItemModel>();
        // }

        public MenuModel(String name){

            this.setText(name);
            
        }


        // public void setName(String name){
        //     this.setName(name);
        // }

        // public String getName(){
        //     return this.getName();
        // }

        // public void setBackground(String bgHex){
        //     this.setBackground(Color.decode(bgHex));
        // }

        // public void setMenus(MenuModel m){
        //     this.add(m);
        // }

        // public void setItems(String item){      
        //     this.add(item);
        // }
    }

    public class MenuItemModel extends JMenuItem{

        private static final long serialVersionUID = 1L;

        public MenuItemModel(String name){
            this.setText(name);
        }

        // public MenuItemModel(){
        // }

        // public void setName(String name){
        //     this.setName(name);
        // }

        // public String getName(){
        //     return this.getName();
        // }

        // public void setBackground(String bgHex){
        //     this.setBackground(Color.decode(bgHex));
        // }

    }
    
}
