package com.telecom.demo.repository;

import com.telecom.demo.entity.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CounterRepository extends JpaRepository<Counter, Long>, ICounterRepositoryCustom {

    @Query(value = "SELECT c FROM Counter c WHERE c.name IN :names")
    List<Counter> findByNames(@Param("names") Collection<String> names);
}
