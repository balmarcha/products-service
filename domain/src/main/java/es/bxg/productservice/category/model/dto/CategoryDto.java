package es.bxg.productservice.category.model.dto;

import es.bxg.commonlib.model.dtos.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CategoryDto extends BaseDto {

  private String name;

  private String description;

  private CategoryDto categoryParent;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;
}