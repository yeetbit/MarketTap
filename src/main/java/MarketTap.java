import markettap.api_exchange.ApiCtrl;
import markettap.gui.GuiBuilder;




public class MarketTap {
    public static void main(String[] args) {

        new GuiBuilder();
        

        ApiCtrl con = new ApiCtrl("wss://echo.websocket.org");
        con.connect();

    }
    
}
