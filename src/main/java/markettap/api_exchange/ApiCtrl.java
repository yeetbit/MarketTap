package markettap.api_exchange;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.alibaba.fastjson.JSON;


public class ApiCtrl {

    Scanner scanner;

    public ApiCtrl(){

    }


    public void loadApiConfigFile(){

        String pattern = "";
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("src/api_listener/apiconfig.json")));
            scanner.useDelimiter(pattern);

            
        } catch (IOException e) {

            e.getMessage();
            //TODO: handle exception
        }


    }



    
    
}
