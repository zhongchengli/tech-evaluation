package com.telecom.demo.repository;

import com.telecom.demo.entity.Counter;

import java.util.List;

public interface ICounterRepositoryCustom {
    List<Counter> findByName(String name);
}
