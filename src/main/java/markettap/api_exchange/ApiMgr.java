package markettap.api_exchange;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import com.alibaba.fastjson.JSON;

import markettap.api_exchange.models.BaseModel;
import markettap.api_exchange.models.StreamObject;

public class ApiMgr {

    private String apiconfig = "src/main/java/markettap/assets/apiconfig.json";
    private FileReader file;
    private BaseModel base;
    private String jStr;

    private StreamObject btc;
    private StreamObject eth;


    public ApiMgr(){
        String jStr = createObj();
    }
    
    /* 
    Api-manager: builds and stores "accesible Streams", and returns Arraylist<stream objects> 

    */

    public String createObj(){

        base = new BaseModel();
        base.setName("Binance Stream configuration");
        btc = new StreamObject();
        eth = new StreamObject();

        btc.setName("Bitcoin");
        btc.setEndPointA("btc");
        


        btc.addEndPointB("Ethereum", "eth");
        btc.addEndPointB("Ripple", "xrp");
        btc.addEndPointB("Lite Coin", "ltc");
        btc.addEndPointB("Bitcoin Cash", "bch");
        btc.addEndPointB("Euro", "eur");

        eth.setName("Ethereum");
        eth.setEndPointA("eth");
        eth.addEndPointB("Bitcoin", "btc");
        eth.addEndPointB("Ripple", "xrp");
        eth.addEndPointB("Lite Coin", "ltc");
        eth.addEndPointB("Bitcoin Cash", "bch");
        eth.addEndPointB("Euro", "eur");

        base.addStreamObject(btc);
        base.addStreamObject(eth);

        String jsonString = JSON.toJSONString(base);
        System.out.println(jsonString);

        return jsonString;

    }

    public void exportWipe(){
        

        try(FileWriter writer = new FileWriter(apiconfig)) {

            writer.write(jsonString);
            writer.close();           
        } catch (IOException e) {
            e.printStackTrace();
            
        } 


    }




    



    
    
}
