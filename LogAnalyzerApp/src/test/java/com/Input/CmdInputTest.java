package com.Input;

import org.junit.Test;

import static org.junit.Assert.*;

public class CmdInputTest {
    @Test
    public void should_return_filepath() {
        String filepath = "D:\\last\\Log_Analyzer\\LogAnalyzerApp\\src\\main\\java\\resources\\sample.txt";
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        assertTrue(absulutePath.endsWith("D:\\last\\Log_Analyzer\\LogAnalyzerApp\\src\\main\\java\\resources\\sample.txt"));

    }
}
