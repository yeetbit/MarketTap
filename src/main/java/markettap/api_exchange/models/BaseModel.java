package markettap.api_exchange.models;

import java.util.ArrayList;


public class BaseModel {

    private String name;
    private ArrayList<StreamObject> coinList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<StreamObject> getCoinList() {
        return coinList;
    }

    public void setCoinList(ArrayList<StreamObject> coinList) {
        this.coinList = coinList;
    }

    public void addStreamObject(StreamObject str){
        coinList.add(str);
    }

    /*
        TODO: the removeStreamObject is not correct, need to use equals() instanceOf() methods
        Example:
        Probably use method chaing something like:

            coinlist.remove(equals(StreamObject str){
                ..code beneath here..
            })

            public boolean equals(Object obj) {
                if (obj == null) {return false};
                if (obj == this) {return true};
                if (!(obj instanceof ArrayTest)) {return false};
                ArrayTest o = (ArrayTest) obj;
                return o.i == this.i;
        }
    */

    public void removeStreamObject(StreamObject str){
        coinList.remove(str);
    }
    
}
