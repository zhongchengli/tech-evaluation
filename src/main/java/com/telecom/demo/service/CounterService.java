package com.telecom.demo.service;


import com.telecom.demo.entity.Counter;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CounterService {

    List<Counter> search(String searchContext);

    List<Counter> search();
}
