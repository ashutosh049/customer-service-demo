# customer-service-demo
A sample spring boot-crud application with spring jpa

## Setup
- uses spring-boot `2.3.2`
- uses mysql 8
- Clone the repo
- make changes as:
 - in `application.yml` replace mysql username and password from root/root to your username/password
 - if you want to use h2 database, configure it as shown below
- tested for mysql 8 with below endpoints requests 

### 1. save customer by service endpoint

```shell
curl --location --request POST 'http://localhost:8181/byService' \
--header 'Content-Type: application/json' \
--data-raw '{
    "nickName":"user1",
    "name":"user1",
    "e_mail":"user1@email.com",
    "password":"User1@"
}
'
```
#### Response

```jshell
{
    "nickName": "user1",
    "name": "user1",
    "e_mail": "user1@email.com",
    "password": "User1@"
}
```

### 2. save customer by repository endpoint

```shell
curl --location --request POST 'http://localhost:8181/byRepository' \
--header 'Content-Type: application/json' \
--data-raw '{
    "nickName":"user2",
    "name":"user2",
    "e_mail":"user2@email.com",
    "password":"User2@"
}
'
```

### Response

```jshell
{
    "nickName": "user2",
    "name": "user2",
    "e_mail": "user2@email.com",
    "password": "User2@"
}
```

### With h2 database
In `application.yml` file

```
spring:
  datasource:
    type: ""
    driver-class-name: org.h2.Driver
    url: jdbc:h2:mem:sirf-db-test;MODE=MYSQL;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
    username: sa
    password: sa
  hibernate:
    ddl-auto: create
    dialect: org.hibernate.dialect.H2Dialect
    show_sql: true
    format_sql:  true
  jpa:
    open-in-view: false
    properties:
      javax.persistence.validation.mode: none
      hibernate:
        enable_lazy_load_no_trans: false #@TODO : Should Be False
  h2:
    console:
      enabled: true
      path: /h2-console
```
