#!/bin/sh

mv -f ./SpringBootElasticsearchCRUD/target/SpringBootElasticsearchCRUD-SE-CRUD-100.jar ./

docker-compose up -d

sleep 8

curl -H "Content-Type: application/json" -X POST 'http://localhost:8220/create' -d '{"id":"3","title":"搭建微服務","content":"微服務內容","view":"1"}'

curl -X GET 'http://localhost:8220/read/3'
