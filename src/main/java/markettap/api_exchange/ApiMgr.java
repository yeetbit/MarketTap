package markettap.api_exchange;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.alibaba.fastjson.JSON;

import markettap.api_exchange.models.BaseModel;
import markettap.api_exchange.models.StreamObject;

public class ApiMgr {

    private String apiconfig = "src/main/java/markettap/assets/apiconfig.json";
    //private FileReader file;
    private BaseModel base;
    private String jStr;

    private StreamObject btc;
    private StreamObject eth;


    public ApiMgr(){
        //this.jStr = objToStr();
        readObjects();

        System.out.println(this.base.getCoinList(this.btc.getName().toString(),this.eth.getName().toString()));
    }
    
    /* 
    Api-manager: builds and stores "accesible Streams", and returns Arraylist<stream objects> 

    TODO: The idea behind objToStr() is to save configuration schemes.. 
        Example: appearantly the specified method has noticed that an B endpoint has changed, or is no longer supported.
        If that is the case, the specific streamObject wil get an state update and wil directly be serialized or written in json format.
        Also, the enduser can manually add new streamObjects. I have still to figure out what works most convienent.

    */

    public String setBaseToStr(){

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

    public void addStreamObject(StreamObject o){

        base.addStreamObject(o);

    }

    public void

    public void writeObjects(){
        
        try(FileWriter writer = new FileWriter(apiconfig)) {
            writer.write(this.jStr);
            writer.close();           
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
    }

    public void readObjects(){

        try (Stream<String> lines = Files.lines(Paths.get(apiconfig))) {
            this.jStr = lines.collect(Collectors.joining());
            this.base = JSON.parseObject(jStr, BaseModel.class);             
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }




    



    
    
}
