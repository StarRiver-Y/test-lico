package com.example.test.thread;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Thread2 extends Thread{

    public void down() throws IOException {
        FileUtils.copyURLToFile(new URL("qq"),new File("test"));
    }
}
