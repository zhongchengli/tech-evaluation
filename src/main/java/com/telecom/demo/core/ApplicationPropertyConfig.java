package com.telecom.demo.core;

import com.telecom.demo.service.FileService;
import com.telecom.demo.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationPropertyConfig {

    @Autowired
    private Environment env;

    /*
    Define file service bean here due to the config of the file to read
     */
    @Bean(name = "fileService")
    public FileService fileService() {
        String fileName = this.getProperties().get("file.name").toString();
        return new FileServiceImpl(fileName);
    }

    private Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<String, Object>();

        // Retrieving property value by name
        String fileName = env.getProperty("file.name");
        properties.put("file.name", "");
        return properties;
    }
}
