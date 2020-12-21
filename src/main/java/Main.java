


public class Main {
    public static void main(String[] args) {

        new GuiBuilder();
        

        ApiCtrl con = new ApiCtrl("wss://echo.websocket.org");
        con.connect();

    }
    
}
