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
    private MenuModel openTap;
    // private ArrayList<MenuItemModel> coinItems;
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


    public MenuBarModel(){
       
        edit = new MenuModel("edit");
        taps = new MenuModel("taps");
        openTap = new MenuModel("open");
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
    
    public MenuItemModel setOpenTap(String name) {
        MenuItemModel item = new MenuItemModel(name);
        openTap.add(item);
        return item;
            
    }

    public MenuItemModel getChangeTap() {
        return changeTap;
    }

    public MenuItemModel getCloseTap() {
        return closeTap;
    }

    public MenuItemModel getCreateNewTap() {
        return createNewTap;
    }

    public MenuItemModel getModifyConfig() {
        return modifyConfig;
    }

    public MenuItemModel getNewWarning() {
        return newWarning;
    }

    public MenuItemModel getChangeWarning() {
        return changeWarning;
    }

    public MenuItemModel getRemoveWarning() {
        return removeWarning;
    }

    public MenuModel getImportExport() {
        return importExport;
    }

    public MenuItemModel getPreferences() {
        return preferences;
    }

    public MenuItemModel getExit() {
        return exit;
    }

    public MenuItemModel getA() {
        return a;
    }

    public MenuItemModel getB() {
        return b;
    }

    public MenuItemModel getLarger() {
        return larger;
    }

    public MenuItemModel getSmaller() {
        return smaller;
    }
    
    public MenuItemModel getWelcome() {
        return welcome;
    }

    public MenuItemModel getDebug() {
        return debug;
    }

    public MenuItemModel getChat() {
        return chat;
    }

    public MenuItemModel getAbout() {
        return about;
    }

    public class MenuModel extends JMenu{
        
        private static final long serialVersionUID = 1L;

        public MenuModel(String name){

            this.setText(name);
        }

    }

    public class MenuItemModel extends JMenuItem{

        private static final long serialVersionUID = 1L;

        public MenuItemModel(String name){
            this.setText(name);
        }

    }



    
}
