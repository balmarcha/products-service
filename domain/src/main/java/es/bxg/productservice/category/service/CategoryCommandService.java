package es.bxg.productservice.category.service;

import es.bxg.commonlib.port.IGenericCommandPort;
import es.bxg.commonlib.service.IGenericCommandService;
import es.bxg.productservice.category.model.pojo.CategoryPojo;
import es.bxg.productservice.category.port.ICategoryCommandPort;

public class CategoryCommandService implements IGenericCommandService<CategoryPojo, Long> {

  private final ICategoryCommandPort commandPort;

  public CategoryCommandService(ICategoryCommandPort commandPort) {
    this.commandPort = commandPort;
  }

  @Override
  public IGenericCommandPort<CategoryPojo, Long> getPort() {
    return commandPort;
  }
}

