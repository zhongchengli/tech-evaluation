package com.telecom.demo.service;

import com.telecom.demo.entity.Counter;
import com.telecom.demo.repository.CounterRepository;
import javafx.application.Application;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = Application.class)
public class CounterServiceTest {

    @Autowired
    private CounterRepository counterRepository;

    @Autowired
    private CounterService counterService;

    @BeforeEach
    public void setUp() {
        List<String> names = new ArrayList<>();
        names.add("Duis");
        names.add("Augue");

        List<Counter> list = new ArrayList<>();
        names.forEach(name -> list.add(new Counter(name)));

        when(counterRepository.findByNames(names))
                .thenReturn(list);
    }

    @Test
    public void testFindByNames() {
        List<String> names = new ArrayList<>();
        names.add("Duis");
        names.add("Augue");
        Map<String, Integer> result = counterService.findByNames(names);

        assertEquals(result.size(), 2);
    }
}
