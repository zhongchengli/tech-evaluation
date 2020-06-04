package com.telecom.demo.service;

import com.telecom.demo.domain.Counter;

import java.util.List;

public interface ICounterService {

    List<Counter> search(String searchContext);

    List<Counter> search();
}
