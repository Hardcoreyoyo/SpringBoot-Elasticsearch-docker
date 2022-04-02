#!/bin/sh

mv -f ./SpringBootElasticsearchCRUD/target/SpringBootElasticsearchCRUD-SE-CRUD-100.jar ./

docker-compose up -d


# curl -H "Content-Type: application/json" -X POST 'http://localhost:8220/create' -d '{"id":"3","title":"搭建微服務","text":"微服務內容","viewnumber":"1"}'

# curl -X GET 'http://localhost:8220/read/3'
