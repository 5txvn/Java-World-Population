package lib;

import java.net.*;
import java.io.*;

public class population {
    public static String get() {
        //try to send a get request to the api
        try {
            URL url = new URL("https://apihub.therealenny1.repl.co/world-population");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                return inputLine;
            in.close();
        }
        //if there is an error, return an error message
        catch (Exception e) {
            return ("Error: " + e.getMessage());
        }
        return "";
    }
}
