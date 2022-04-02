package SpringBootElasticsearchCRUD.dao;

import SpringBootElasticsearchCRUD.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ArticleDao  extends ElasticsearchRepository<Article, String> {

    List<Article> findArticleById(String id);
}

