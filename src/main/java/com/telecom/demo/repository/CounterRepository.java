package com.telecom.demo.repository;

import com.telecom.demo.entity.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface CounterRepository extends JpaRepository<Counter, Long>, ICounterRepositoryCustom {

}
