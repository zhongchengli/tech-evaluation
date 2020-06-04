package com.telecom.demo.controller;


import com.telecom.demo.entity.Counter;
import com.telecom.demo.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/counter-api")
public class CounterController {

    private static final Logger log = LoggerFactory.getLogger(CounterController.class);

    @Autowired
    private CounterService counterService;

    @GetMapping("/counters")
    public List<Counter> getAll(){
        log.info("**************************");
        log.error("**************************");
        log.warn("**************************");
        return counterService.search();
    }


}
