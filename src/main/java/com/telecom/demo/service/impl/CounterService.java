package com.telecom.demo.service.impl;

import com.telecom.demo.domain.Counter;
import com.telecom.demo.service.ICounterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("counterService")
public class CounterService implements ICounterService {



    @Override
    public List<Counter> search(String searchContext) {
        return null;
    }

    @Override
    public List<Counter> search() {
        return null;
    }
}
