package com.telecom.demo.controller;


import com.telecom.demo.entity.Counter;
import com.telecom.demo.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/counter-api")
public class CounterController {

    private static final Logger log = LoggerFactory.getLogger(CounterController.class);

    @Autowired
    private CounterService counterService;

    @GetMapping("/counters")
    public List<Counter> getAll() {
        return counterService.search();
    }

    @PostMapping("/search")
    public Map<String, Integer> searchNames(@RequestBody Map<String, Object[]> search) {

        List<String> names = new ArrayList<>();
        if (search != null && search.size() > 0) {
            search.values().forEach(val -> {
                for(Object obj: val){
                    names.add(obj.toString());
                }
            });
        }

        return counterService.findByNames(names);
    }


}
