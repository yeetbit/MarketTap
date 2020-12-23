package markettap.api_exchange.models;

import java.util.List;

public class StreamObject {

    // endPointA and endPointB combined, == endpoint URI 

    private String name;
    private String endPointA;
    private List<EndPointB> bEndPoints;
    


    public void addEndPointB(String name, String endPoint){
        EndPointB endb = new EndPointB();
        endb.setName(name);
        endb.setEndPointB(endPoint);
        bEndPoints.add(endb);        
        
    }

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

    public List<EndPointB> getbEndPoints() {
        return bEndPoints;
    }

    public void setbEndPoints(List<EndPointB> bEndPoints) {
        this.bEndPoints = bEndPoints;
    }

    

}

