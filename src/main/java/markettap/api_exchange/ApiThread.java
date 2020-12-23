package markettap.api_exchange;

import markettap.gui.StreamBuilder;

public class ApiThread extends Thread {

    StreamBuilder stream;


    ApiThread(StreamBuilder stream){

        this.stream = stream;
        run();

    }

  


    
}
