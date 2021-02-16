package markettap.api_exchange;

public class StaticMethods {

    
    public static Double[] change(Double oldPrice, Double newPrice) {
        Double change[]= {-1.0,-1.0};
        change[0] = (newPrice-oldPrice)/oldPrice;
        change[1] = change[0]*100;

        return change;

    }


    
}
