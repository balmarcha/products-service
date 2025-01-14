package es.bxg.productservice.product.service;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.commonlib.service.IGenericCommandHandler;
import es.bxg.commonlib.service.IGenericCommandService;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.product.mapper.IProductDtoMapper;
import es.bxg.productservice.product.model.dto.ProductDto;
import es.bxg.productservice.product.model.pojo.ProductPojo;
import org.springframework.stereotype.Component;

@Component
public class ProductCommandHandler implements IGenericCommandHandler<ProductPojo, ProductDto, Long> {

  private final IProductDtoMapper mapper;
  private final ProductQueryService queryService;
  private final ProductCommandService commandService;

  public ProductCommandHandler(IProductDtoMapper mapper, ProductQueryService queryService, ProductCommandService commandService) {
    this.mapper = mapper;
    this.queryService = queryService;
    this.commandService = commandService;
  }

  @Override
  public IGenericDtoMapper<ProductPojo, ProductDto> getMapper() {
    return mapper;
  }

  @Override
  public IGenericQueryService<ProductPojo, Long> getQueryService() {
    return queryService;
  }

  @Override
  public IGenericCommandService<ProductPojo, Long> getCommandService() {
    return commandService;
  }
}
