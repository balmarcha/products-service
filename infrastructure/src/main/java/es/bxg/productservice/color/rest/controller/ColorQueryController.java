package es.bxg.productservice.color.rest.controller;

import es.bxg.commonlib.rest.controllers.IGenericQueryController;
import es.bxg.commonlib.service.IGenericQueryHandler;
import es.bxg.productservice.color.model.dto.ColorDto;
import es.bxg.productservice.color.service.ColorQueryHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colors")
public class ColorQueryController implements IGenericQueryController<ColorDto> {

  private final ColorQueryHandler queryHandler;

  public ColorQueryController(ColorQueryHandler queryHandler) {
    this.queryHandler = queryHandler;
  }

  @Override
  public IGenericQueryHandler getQueryHandler() {
    return queryHandler;
  }
}
