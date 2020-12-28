package markettap.gui.models;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.util.ArrayList;

public class MenuBarModel extends JMenuBar{
    
    private static final long serialVersionUID = -1965926954804999754L;

    private JMenu edit;
    private JMenu taps;
    private JMenuItem openTap;
    private JMenuItem changeTap;
    private JMenuItem closeTap;
    private JMenuItem createNewTap;
    private JMenuItem modifyConfig;

    private JMenu warnings;
    private JMenuItem newWarning;
    private JMenuItem changeWarning;
    private JMenuItem removeWarning;
    private JMenu importExport;
    private JMenuItem preferences;
    private JMenuItem exit;
    
    private JMenu view;
    private JMenu theme;
    private JMenuItem a;
    private JMenuItem b;
    private JMenu window;
    private JMenuItem larger;
    private JMenuItem smaller;

    private JMenu help;
    private JMenuItem welcome;
    private JMenuItem debug;
    private JMenuItem chat;
    private JMenuItem about;


    private ArrayList<MenuModel> menus;
    private ArrayList<MenuItemModel> items;


    public MenuBarModel(){

        this.menus = new ArrayList<MenuModel>();
        this.items = new ArrayList<MenuItemModel>();


        
        edit = new JMenu("edit");
        taps = new JMenu("taps");
        openTap = new JMenuItem("open");
        changeTap = new JMenuItem("modify");
        closeTap = new JMenuItem("delete");
        createNewTap = new JMenuItem("new entry");
        modifyConfig = new JMenuItem("edit connections");

        warnings = new JMenu("warnings");
        newWarning = new JMenuItem("new");
        changeWarning = new JMenuItem("modify");
        removeWarning = new JMenuItem("delete");
    
        importExport = new JMenu("import export");
        preferences = new JMenu("preferences");
        exit = new JMenuItem("exit");

        view = new JMenu("view");
        theme = new JMenu("theme");
        a = new JMenuItem("theme A");
        b = new JMenuItem("theme B");
        window = new JMenu("window");
        larger = new JMenuItem("larger");
        smaller = new JMenuItem("smaller");
    
        help = new JMenu("help");
        welcome = new JMenuItem("welcome");
        debug = new JMenuItem("debug");
        chat = new JMenuItem("chat");
        about = new JMenuItem("about");

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
    public void setName(String name){
        this.setName(name);
    }

    public String getName(){
        return this.getName();
    }

    public void setBackground(String bgHex){
        this.setBackground(Color.decode(bgHex));
    }

    public void setMenus(MenuModel m){
        this.menus.add(m);
    }

    public class MenuModel extends JMenu{
        
        private ArrayList<MenuModel> menus;
        private ArrayList<MenuItemModel> items;

        public MenuModel(){
            this.menus = new ArrayList<MenuModel>();
            this.items = new ArrayList<MenuItemModel>();
        }

        private static final long serialVersionUID = 1L;

        public void setName(String name){
            this.setName(name);
        }

        public String getName(){
            return this.getName();
        }

        public void setBackground(String bgHex){
            this.setBackground(Color.decode(bgHex));
        }

        public void setMenus(MenuModel m){
            this.add(m);
        }

        public void setItems(String item){
            
            this.add(item);
            
        }
    }

    public class MenuItemModel extends JMenuItem{

        private static final long serialVersionUID = 1L;

        public void setName(String name){
            this.setName(name);
        }

        public String getName(){
            return this.getName();
        }

        public void setBackground(String bgHex){
            this.setBackground(Color.decode(bgHex));
        }


    }
    
}
