package es.bxg.productservice.color.rest.controller;

import es.bxg.commonlib.rest.controllers.IGenericCommandController;
import es.bxg.commonlib.service.IGenericCommandHandler;
import es.bxg.productservice.color.model.dto.ColorDto;
import es.bxg.productservice.color.service.ColorCommandHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colors")
public class ColorCommandController implements IGenericCommandController<ColorDto> {

  private final ColorCommandHandler commandHandler;

  public ColorCommandController(ColorCommandHandler commandHandler) {
    this.commandHandler = commandHandler;
  }


  @Override
  public IGenericCommandHandler getCommandHandler() {
    return commandHandler;
  }
}