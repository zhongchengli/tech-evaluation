# tech-evaluation


### POST request with basic authorization
```
$ curl –X POST http://localhost:8080/counter-api/search -H"Authorization: Basic b3B0dXM6Y2FuZGlkYXRlcw==" -d'{"searchText":["Duis", "Sed", "Donec", "Augue", "Pellentesque", "123"]}' -H"Content-Type: application/json"
```

### POST request without basic authorization
```
$ curl –X POST http://localhost:8080/counter-api/search -d'{"searchText":["Duis", "Sed", "Donec", "Augue", "Pellentesque", "123"]}' -H"Content-Type: application/json"
```