package es.bxg.productservice.color.service;

import es.bxg.commonlib.port.IGenericCommandPort;
import es.bxg.commonlib.service.IGenericCommandService;
import es.bxg.productservice.color.model.pojo.ColorPojo;
import es.bxg.productservice.color.port.IColorCommandPort;

public class ColorCommandService implements IGenericCommandService<ColorPojo, Long> {

  private final IColorCommandPort commandPort;

  public ColorCommandService(IColorCommandPort commandPort) {
    this.commandPort = commandPort;
  }

  @Override
  public IGenericCommandPort<ColorPojo, Long> getPort() {
    return commandPort;
  }
}

