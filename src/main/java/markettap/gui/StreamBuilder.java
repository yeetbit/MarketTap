package markettap.gui;

import markettap.gui.elements.IconLabel;
import markettap.gui.elements.TrackRecord;
import markettap.gui.models.StreamModel;

public class StreamBuilder extends Thread {
    private String name;
    private int id;
    // instances
    private IconLabel addTrackRecord;
    private IconLabel editTrackRecord;
    private IconLabel removeCrypto;
    private TrackRecord track;
    private StreamModel streamModel;
    // private Art art;

    StreamBuilder(String name, int iD) {
        this.name = name;
        this.id = iD;
        run();


    }

    @Override
    public void run() {


      
    }


    private void setStream(){
        

    }
    
}
