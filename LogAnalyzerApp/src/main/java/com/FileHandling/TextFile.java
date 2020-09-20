package com.FileHandling;

import java.io.IOException;

public interface TextFile {
    void writeFile(String lLine);
    String readFile(String filepath) throws IOException;
}
