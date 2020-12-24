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
    
}
