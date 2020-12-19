package markettap.api_exchange;

import java.net.URI;
import java.net.URL;

public class UniformResourceIdentifier {

    private boolean connectionActive = false;


    public boolean setupConnection(){

        try {

            URI baseUri = new URI("http://username.password@myserver.com:5000");
            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=1234");
    
            URI resolvedUri1 = baseUri.resolve(uri1);
            URI resolvedUri2 = baseUri.resolve(uri2);
            URI resolvedUri3 = baseUri.resolve(uri3);
    
            URL url = resolvedUri1.toURL();
            
        } catch (Exception e) {
            //TODO: handle exception
        }

        return connectionActive;
    }


    
}
