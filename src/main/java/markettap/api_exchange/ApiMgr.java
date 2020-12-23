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
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiMgr {

    private String apiconfig = "src/main/java/markettap/assets/apiconfig.json";
    FileReader file;


    /* 
    Api-manager: builds and stores "accesible Streams", and returns Arraylist<stream objects> 

     */
    
    ApiMgr(){
         
    }

    public void readFile(){

        try (Scanner scanner = new Scanner (new BufferedReader(new FileReader(apiconfig)))) {
            while(scanner.hasNextLine()){
                
            }
                        
            
        } catch (Exception e) {
            //TODO: handle exception
        }

        


    }
    

 

  


    
    
}
