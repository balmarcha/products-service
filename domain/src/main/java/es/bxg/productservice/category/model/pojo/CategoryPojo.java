package es.bxg.productservice.category.model.pojo;

import es.bxg.commonlib.model.pojo.BasePojo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CategoryPojo extends BasePojo {

  private String name;

  private String description;

  private CategoryPojo categoryParent;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;
}