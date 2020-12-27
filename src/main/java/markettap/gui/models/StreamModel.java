package markettap.gui.models;

import javax.swing.JPanel;

import markettap.gui.elements.IconLabel;
import markettap.gui.elements.TrackRecord;

public class StreamModel extends JPanel{

    // TODO: make working concept of StreamModel with live update of testValue. Feed is implemented in ApiMgr.Class
       


    private static final long serialVersionUID = -1893482350513633850L;
    // variables
    private String cryptoName;
    private int enteringDate;
    private int enteringValue;
    private int enteringAmount;
    private int compareValue;
    private int currentValue;
    private int profitPercentage;
    private int profitAmount;
    private int testValue;
    
    
    // instances
    private IconLabel addTrackRecord;
    private IconLabel editTrackRecord;
    private IconLabel removeCrypto;
    private TrackRecord track;

    // private IconLabel editTrackRecord;
    // private IconLabel removeCrypto;
    // private TrackRecord track;



    public StreamModel(String cryptoName) {

        this.cryptoName = cryptoName;

        this.setSize(64, 128);
        // this.editTrackRecord = new IconLabel();
        // this.addTrackRecord = new IconLabel();
        // this.removeCrypto = new IconLabel();
        // this.add(editTrackRecord);
        // this.setVisible(true);

    }

    public void setTestValue(int v){

        this.testValue = v;

    }

    

}
