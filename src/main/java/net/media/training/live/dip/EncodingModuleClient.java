package net.media.training.live.dip;

import java.io.IOException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule  = new EncodingModule();
        File readFile = new File("src/main/java/net/media/tyraining/live/dip/beforeEncryption.txt");
        File writeFile = new File("src/main/java/net/media/tyraining/live/dip/afterEncryption.txt");
        encodingModule.encode(readFile.getReader(), writeFile.getWriter());
        
        Network network = new Network(new URL("http", "myfirstappwith.appspot.com", "index.html"));
        encodingModule.encode(network.getReader(), new MyDatabase());
    }
}
