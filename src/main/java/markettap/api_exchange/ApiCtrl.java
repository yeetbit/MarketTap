package markettap.api_exchange;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
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

public class ApiCtrl {

    private String uri;
    private String port;
    WebSocketClient wss;

    public ApiCtrl(String uri, String port) {

        this.uri = uri;
        this.port = port;

        try {
            wss = new WebSocketClient(new URI(uri + port), new Draft_6455()) {
                @Override
                public void onMessage(String message) {
                    JSONObject obj = new JSONObject(message);
                    String channel = obj.getString("channel");
                }

                @Override
                public void onOpen(ServerHandshake handshake) {
                    System.out.println("opened connection");
                }

                @Override
                public void onClose(int code, String reason, boolean remote) {
                    System.out.println("closed connection");
                }

                @Override
                public void onError(Exception ex) {
                    ex.printStackTrace();
                }

            };
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

     


    // public void loadApiConfigFile(){

    //     String pattern = "";
    //     try {
    //         scanner = new Scanner(new BufferedReader(new FileReader("src/api_listener/apiconfig.json")));
    //         scanner.useDelimiter(pattern);

            
    //     } catch (IOException e) {

    //         e.getMessage();
    //         //TODO: handle exception
    //     }


    // }



    
    
}
