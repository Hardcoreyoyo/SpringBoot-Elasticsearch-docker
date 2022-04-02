package SpringBootElasticsearchCRUD.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Data
@Document(indexName = "blog")
public class Article {

    @Id
    private String id;

    @Field(type = FieldType.Text, name = "title")
    private String title;

    @Field(type = FieldType.Integer, name = "view")
    private Integer view;

    @Field(type = FieldType.Text, analyzer = "content")
    private String content;

//    @Field(type = FieldType.Date, format = DateFormat.custom,
//            pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
//    private Date createTime;
//
//    @Field(type = FieldType.Date, format = DateFormat.custom,
//            pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
//    private Date updateTime;

}
