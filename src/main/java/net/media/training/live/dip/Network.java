package net.media.training.live.dip;

import java.io.InputStreamReader;
import java.net.URL;

public class Network {
    URL url;
    public Network(URL url) {
        this.url = new url;
    }

    public Reader getReader() {
        return new InputStreamReader(url.openStream());
    }
}
