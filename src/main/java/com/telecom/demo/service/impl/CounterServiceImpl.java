package com.telecom.demo.service.impl;

import com.telecom.demo.entity.Counter;
import com.telecom.demo.exception.CounterNotFoundException;
import com.telecom.demo.repository.CounterRepository;
import com.telecom.demo.service.CounterService;
import com.telecom.demo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Stream;

@Service
public class CounterServiceImpl implements CounterService {

    @Autowired
    private CounterRepository counterRepository;

    @Autowired
    private FileService fileService = null;

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

        // throw custom exception if no result found
        if (result.size() == 0) {
            throw new CounterNotFoundException("No counter found");
        }

        return result;
    }

    @Override
    public Map<String, Integer> findTopText(int limit) {
        Map<String, Integer> wordMap = new HashMap<>();

        Stream<String> stream = fileService.readFile();
        stream.forEach(line -> {
            line = line.replace("[,.\"“”'‘’`!@#$%^&*()-_+=~{}<>?/|\\:1-9;\\s\\n]", " ");

            StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()) {
                String temp = st.nextToken().toLowerCase();
                if (wordMap.containsKey(temp)) {
                    wordMap.put(temp, wordMap.get(temp) + 1);
                } else {
                    wordMap.put(temp, 1);
                }
            }
        });

        Map<String, Integer> result = new HashMap<>();

        // sort result by interface default method and return top ${limit} result
        CounterService.super.sortByValue(wordMap).subList(0, limit)
                .forEach(entry-> result.put(entry.getKey(), entry.getValue()));

        return result;
    }
}
