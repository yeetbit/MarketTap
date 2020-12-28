package markettap.gui.models;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarModel extends JMenuBar{
    
    private static final long serialVersionUID = -1965926954804999754L;

    private JMenu edit;
    private JMenuItem taps;
    private JMenuItem warnings;
    private JMenuItem importExport;
    private JMenuItem preferences;
    private JMenuItem exit;
    
    private JMenu view;
    private JMenuItem theme;
    private JMenuItem window;

    private JMenu help;
    private JMenuItem welcome;
    private JMenuItem debug;
    private JMenuItem chat;
    private JMenuItem about;



    public MenuBarModel(){

        
        edit = new JMenu("edit");
        taps = new JMenuItem("taps");
        warnings = new JMenuItem("warnings");
        importExport = new JMenuItem("import export");
        preferences = new JMenuItem("preferences");
        exit = new JMenuItem("exit");

        view = new JMenu("view");
        theme = new JMenuItem("theme");
        window = new JMenuItem("window");

        help = new JMenu("help");
        welcome = new JMenuItem("welcome");
        debug = new JMenuItem("debug");
        chat = new JMenuItem("chat");
        about = new JMenuItem("about");

        edit.add(taps);
        edit.add(warnings);
        edit.add(importExport);
        edit.add(preferences);
        edit.add(exit);

        view.add(theme);
        view.add(window);

        help.add(welcome);
        help.add(debug);
        help.add(chat);
        help.add(about);
        this.add(edit);
        this.add(view);
        this.add(help);

    }


    
}
