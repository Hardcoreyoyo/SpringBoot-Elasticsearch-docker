FROM adoptopenjdk/openjdk11:jdk-11.0.14.1_1-alpine-slim
WORKDIR /app
COPY SpringBootElasticsearchCRUD-SE-CRUD-100.jar /app/SpringBootElasticsearchCRUD-SE-CRUD-100.jar
ENTRYPOINT ["java","-jar","/app/SpringBootElasticsearchCRUD-SE-CRUD-100.jar"]
