package net.media.training.live.dip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class File {
    private String fileName;
    public File(String fileName) {
        this.fileName = fileName;
    }
    public Reader getReader() {
        return new BufferedReader(new FileReader(fileName));
    }
    public Writer getWriter() {
        return new BufferedWriter(new FileWriter(fileName));
    }
}
