package com.telecom.demo.repository;

import com.telecom.demo.entity.Counter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@RunWith(SpringRunner.class)
@DataJpaTest
public class CounterRepositoryTest {

//    @Qualifier("counterRepository")
//    @Autowired
//    private CounterRepository counterRepository;


    public void testFindByName() {

//       List<Counter> results = counterRepository.findByName("Duis");

//        assertThat(results).extracting(Counter::getName).containsOnly("Duis");

    }
}
