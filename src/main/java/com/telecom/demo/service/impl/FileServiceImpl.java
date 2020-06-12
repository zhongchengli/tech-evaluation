package com.telecom.demo.service.impl;

import com.telecom.demo.service.FileService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileServiceImpl implements FileService {
    private String fileName;

    public FileServiceImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Stream<String> readFile() {
        return this.getStream(this.fileName);
    }

    @Override
    public Stream<String> readFile(String fileName) {
        return this.getStream(fileName);
    }

    private Stream<String> getStream(String fileName){
        Stream<String> result = null;
        try{
            result = Files.lines(Paths.get(fileName));
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return result;
    }
}
