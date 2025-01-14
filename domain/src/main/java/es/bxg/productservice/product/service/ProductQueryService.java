package es.bxg.productservice.product.service;

import es.bxg.commonlib.port.IGenericQueryPort;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.product.model.pojo.ProductPojo;
import es.bxg.productservice.product.port.IProductQueryPort;

public class ProductQueryService implements IGenericQueryService<ProductPojo, Long> {

  private final IProductQueryPort queryPort;

  public ProductQueryService(IProductQueryPort queryPort) {
    this.queryPort = queryPort;
  }

  @Override
  public IGenericQueryPort<ProductPojo, Long> getPort() {
    return queryPort;
  }
}
