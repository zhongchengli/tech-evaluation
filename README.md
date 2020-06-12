# Tech-evaluation

This Maven project is developed in Java 8, Spring Boot, Spring Security and JPA.
It's running on spring boot embedded Tomcat and in-memory H2 database. 

### Task 1:
Implement RESTful Services, which provide the solution of the following tasks, given the sample paragraphs. Also protect the services with Spring Security

##### POST request with basic authorization
```shell script
$ curl –X POST http://localhost:8080/counter-api/search -H"Authorization: Basic b3B0dXM6Y2FuZGlkYXRlcw==" -d'{"searchText":["Duis", "Sed", "Donec", "Augue", "Pellentesque", "123"]}' -H"Content-Type: application/json"
```

##### POST request without basic authorization
```shell script
$ curl –X POST http://localhost:8080/counter-api/search -d'{"searchText":["Duis", "Sed", "Donec", "Augue", "Pellentesque", "123"]}' -H"Content-Type: application/json"
```


##### Result in JSON
```json
{"counts": [{"Duis": 11}, {"Sed": 16}, {"Donec": 8}, {"Augue": 7}, {"Pellentesque": 6}, {"123": 0}]}
```

### Task 2:
Provide the top 20 (as Path Variable) Texts, which has the highest counts in the Sample Paragraphs provided. As a user, I will be able to execute the following curl command and expecting result in csv format. I will be able to put 10, 20, 30 or 5 as the top listing. 

##### GET request with basic authorization to get top limit text
```shell script
$ curl –X POST http://localhost:8080/counter-api/top/5 -H"Authorization: Basic b3B0dXM6Y2FuZGlkYXRlcw==" -H"Content-Type: text/csv"
```

continue...