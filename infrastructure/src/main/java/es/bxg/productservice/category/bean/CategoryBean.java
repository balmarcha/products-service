package es.bxg.productservice.category.bean;

import es.bxg.productservice.category.port.ICategoryCommandPort;
import es.bxg.productservice.category.port.ICategoryQueryPort;
import es.bxg.productservice.category.service.CategoryCommandService;
import es.bxg.productservice.category.service.CategoryQueryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryBean {

  @Bean
  public CategoryQueryService categoryQueryService(ICategoryQueryPort port){
    return new CategoryQueryService(port);
  }

  @Bean
  public CategoryCommandService categoryCommandService(ICategoryCommandPort port){
    return new CategoryCommandService(port);
  }

}
