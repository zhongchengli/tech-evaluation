package com.telecom.demo.service;

import java.util.stream.Stream;

public interface FileService {
    
    Stream<String> readFile();

    Stream<String> readFile(String fileName);
}
