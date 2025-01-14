package es.bxg.productservice.category.service;

import es.bxg.commonlib.port.IGenericQueryPort;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.category.model.pojo.CategoryPojo;
import es.bxg.productservice.category.port.ICategoryQueryPort;

public class CategoryQueryService implements IGenericQueryService<CategoryPojo, Long> {

  private final ICategoryQueryPort queryPort;

  public CategoryQueryService(ICategoryQueryPort queryPort) {
    this.queryPort = queryPort;
  }

  @Override
  public IGenericQueryPort<CategoryPojo, Long> getPort() {
    return queryPort;
  }
}
