# customer-service-demo
A sample spring boot-crud application with spring jpa

## save customer by service endpoint

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

## save customer by repository endpoint

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
