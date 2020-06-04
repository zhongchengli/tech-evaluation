package com.telecom.demo.service;


import com.telecom.demo.entity.Counter;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface CounterService {

    List<Counter> search(String searchContext);

    List<Counter> search();

    Map<String, Integer> findByNames(Collection<String> names);
}
