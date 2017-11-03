# Spring Rest
>Backend Example Rest API with Spring Boot
 
## Stack
- Spring Boot

## Run Project
``` bash
$ ./gradlew bootRun
```
This application will run in `localhost:8080`

## Endpoint 
1. Simple Rest API
`localhost:8080/simple`
method  : GET
This endpoint will send simple string
2. Rest API with parameter
`localhost:8080/param?name={yourName}`
method  : GET
This endpoint will greet you
3. Rest API with path
`localhost:8080/path/{yourPath}`
method  : GET
This endpoint will add your path
4. Post JSON
`localhost:8080/person`
method  : POST
This endpoint will post JSON like 
```json
{
	"name":"hafidz",
	"birthDate":"1997-08-28"
}
```
and this endpoint will send `toString` object
```
Person(name=hafidz, birthDate=Thu Aug 28 07:00:00 CXT 1997)
```