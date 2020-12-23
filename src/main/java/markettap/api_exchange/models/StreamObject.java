package markettap.api_exchange.models;

import java.util.ArrayList;

public class StreamObject {

    // endPointA and endPointB combined, == endpoint URI 

    private String name;
    private String endPointA;
    private ArrayList<EndPointB> endPointB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndPointA() {
        return endPointA;
    }

    public void setEndPointA(String endPointA) {
        this.endPointA = endPointA;
    }

    public ArrayList<EndPointB> getEndPointB() {
        return endPointB;
    }

    public void setEndPointB(ArrayList<EndPointB> endPointB) {
        this.endPointB = endPointB;
    }
    
}
