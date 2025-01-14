package es.bxg.productservice.product.service;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.commonlib.service.IGenericQueryHandler;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.product.mapper.IProductDtoMapper;
import es.bxg.productservice.product.model.dto.ProductDto;
import es.bxg.productservice.product.model.pojo.ProductPojo;
import org.springframework.stereotype.Component;

@Component
public class ProductQueryHandler implements IGenericQueryHandler<ProductPojo, ProductDto, Long> {

  private final IProductDtoMapper mapper;
  private final ProductQueryService queryService;

  public ProductQueryHandler(IProductDtoMapper mapper, ProductQueryService queryService) {
    this.mapper = mapper;
    this.queryService = queryService;
  }

  @Override
  public IGenericDtoMapper<ProductPojo, ProductDto> getMapper() {
    return mapper;
  }

  @Override
  public IGenericQueryService<ProductPojo, Long> getQueryService() {
    return queryService;
  }
}
