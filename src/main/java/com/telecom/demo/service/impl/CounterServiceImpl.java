package com.telecom.demo.service.impl;

import com.telecom.demo.entity.Counter;
import com.telecom.demo.repository.CounterRepository;
import com.telecom.demo.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public Map<String, Integer> findByNames(Collection<String> names) {
        Map<String, Integer> result = new HashMap<>();
        counterRepository.findByNames(names).forEach(counter -> {
            result.put(counter.getName(), counter.getNumber());
        });
        return result;
    }
}
