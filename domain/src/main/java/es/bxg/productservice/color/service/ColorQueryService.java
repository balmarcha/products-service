package es.bxg.productservice.color.service;

import es.bxg.commonlib.port.IGenericQueryPort;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.color.model.pojo.ColorPojo;
import es.bxg.productservice.color.port.IColorQueryPort;

public class ColorQueryService implements IGenericQueryService<ColorPojo, Long> {

  private final IColorQueryPort queryPort;

  public ColorQueryService(IColorQueryPort queryPort) {
    this.queryPort = queryPort;
  }

  @Override
  public IGenericQueryPort<ColorPojo, Long> getPort() {
    return queryPort;
  }
}
