package es.bxg.productservice.category.service;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.commonlib.service.IGenericQueryHandler;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.category.mapper.ICategoryDtoMapper;
import es.bxg.productservice.category.model.dto.CategoryDto;
import es.bxg.productservice.category.model.pojo.CategoryPojo;
import org.springframework.stereotype.Component;

@Component
public class CategoryQueryHandler implements IGenericQueryHandler<CategoryPojo, CategoryDto, Long> {

  private final ICategoryDtoMapper mapper;
  private final CategoryQueryService queryService;

  public CategoryQueryHandler(ICategoryDtoMapper mapper, CategoryQueryService queryService) {
    this.mapper = mapper;
    this.queryService = queryService;
  }

  @Override
  public IGenericDtoMapper<CategoryPojo, CategoryDto> getMapper() {
    return mapper;
  }

  @Override
  public IGenericQueryService<CategoryPojo, Long> getQueryService() {
    return queryService;
  }
}
