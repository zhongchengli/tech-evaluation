package com.telecom.demo.service.impl;

import com.telecom.demo.entity.Counter;
import com.telecom.demo.repository.CounterRepository;
import com.telecom.demo.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("counterService")
public class CounterServiceImpl implements CounterService {

    @Autowired
    private CounterRepository counterRepository;

    @Override
    public List<Counter> search(String searchContext) {
        return this.counterRepository.findByName(searchContext);
    }

    @Override
    public List<Counter> search() {
        return counterRepository.findAll();
    }
}
