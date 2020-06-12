package com.telecom.demo.service;


import com.telecom.demo.entity.Counter;

import java.util.*;

public interface CounterService {

    List<Counter> search(String searchContext);

    List<Counter> search();

    Map<String, Integer> findByNames(Collection<String> names);

    Map<String, Integer> findTopText(int limit);

    default List<Map.Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap) {
        Set<Map.Entry<String, Integer>> set = wordMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        return list;
    }
}
