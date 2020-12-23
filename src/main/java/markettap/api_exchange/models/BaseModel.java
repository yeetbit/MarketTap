package markettap.api_exchange.models;

import java.util.List;


public class BaseModel {

    private String name;
    private List<StreamObject> coinList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StreamObject> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<StreamObject> coinList) {
        this.coinList = coinList;
    }

    public void addStreamObject(StreamObject str){
        coinList.add(str);
    }
    
}
