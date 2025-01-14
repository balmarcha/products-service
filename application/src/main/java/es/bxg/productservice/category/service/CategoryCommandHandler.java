package es.bxg.productservice.category.service;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.commonlib.service.IGenericCommandHandler;
import es.bxg.commonlib.service.IGenericCommandService;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.category.mapper.ICategoryDtoMapper;
import es.bxg.productservice.category.model.dto.CategoryDto;
import es.bxg.productservice.category.model.pojo.CategoryPojo;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandHandler implements IGenericCommandHandler<CategoryPojo, CategoryDto, Long> {

  private final ICategoryDtoMapper mapper;
  private final CategoryQueryService queryService;
  private final CategoryCommandService commandService;

  public CategoryCommandHandler(ICategoryDtoMapper mapper, CategoryQueryService queryService, CategoryCommandService commandService) {
    this.mapper = mapper;
    this.queryService = queryService;
    this.commandService = commandService;
  }

  @Override
  public IGenericDtoMapper<CategoryPojo, CategoryDto> getMapper() {
    return mapper;
  }

  @Override
  public IGenericQueryService<CategoryPojo, Long> getQueryService() {
    return queryService;
  }

  @Override
  public IGenericCommandService<CategoryPojo, Long> getCommandService() {
    return commandService;
  }
}
