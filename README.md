# SpringBoot-Elasticsearch-docker

<br>
<br>

### Execute
```
cd SpringBoot-Elasticsearch-docker    (Folder)
```
```
AllStart.sh
```

<br>
<br>
<br>
<br>

### Feature

| Dependency | Version |
| :----: | :----: |
| Spring Boot | 2.3.7.RELEASE |
| Spring Web | by parent version |
| Spring Data Elasticsearch | / |
| Docker| v20.10.10 |

<br>
<br>
<br>
<br>

###  Api
| api | Service | Method |
| :----: | :----: | :----: |
| localhost:8220 |  |  |
| /read/{id} | 搜尋指定資料 | GET |
| /create | 創建資料 | POST |
| /update | 更新 | PUT |
| /delete/{id}} | 刪除資料 | DELETE |

<br>
<br>
<br>
<br>

### Troubleshooting

| Trouble | solve |
| :----: | :----: |
| 設定與依賴釐清 | application 設定檔 ~~cluster-nodes~~ Deprecated，<br>需要配置 spring-boot-starter-webflux，<br> 一般情況要自己寫 @Configuration 類。|
 搭建版本 | Elasticsearch 版本更迭快速，<br>在搭建以前一定要先查版本相依關係，<br>springboot ， spring Data ， Elasticsearch。|
 
<br>
<br>
<br>
<br>

### Note

| Note |
| :----: |
| 在 Springboot 中 創建完映射實體類即是創建表，<br>就可以直接進行 CRUL，不需再像 SQL 使用 DDL 創建等等。|
