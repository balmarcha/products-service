package es.bxg.productservice.product.rest.controller;

import es.bxg.commonlib.rest.controllers.IGenericCommandController;
import es.bxg.commonlib.service.IGenericCommandHandler;
import es.bxg.productservice.color.model.dto.ColorDto;
import es.bxg.productservice.product.model.dto.ProductDto;
import es.bxg.productservice.product.service.ProductCommandHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductCommandController implements IGenericCommandController<ProductDto> {

  private final ProductCommandHandler commandHandler;

  public ProductCommandController(ProductCommandHandler commandHandler) {
    this.commandHandler = commandHandler;
  }


  @Override
  public IGenericCommandHandler getCommandHandler() {
    return commandHandler;
  }
}