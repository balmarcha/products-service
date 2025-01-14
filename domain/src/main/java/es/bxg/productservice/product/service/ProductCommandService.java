package es.bxg.productservice.product.service;

import es.bxg.commonlib.port.IGenericCommandPort;
import es.bxg.commonlib.service.IGenericCommandService;
import es.bxg.productservice.product.model.pojo.ProductPojo;
import es.bxg.productservice.product.port.IProductCommandPort;

public class ProductCommandService implements IGenericCommandService<ProductPojo, Long> {

  private final IProductCommandPort commandPort;

  public ProductCommandService(IProductCommandPort commandPort) {
    this.commandPort = commandPort;
  }

  @Override
  public IGenericCommandPort<ProductPojo, Long> getPort() {
    return commandPort;
  }
}

