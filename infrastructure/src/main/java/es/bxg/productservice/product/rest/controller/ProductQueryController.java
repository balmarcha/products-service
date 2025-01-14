package es.bxg.productservice.product.rest.controller;

import es.bxg.commonlib.rest.controllers.IGenericQueryController;
import es.bxg.commonlib.service.IGenericQueryHandler;
import es.bxg.productservice.color.model.dto.ColorDto;
import es.bxg.productservice.product.model.dto.ProductDto;
import es.bxg.productservice.product.service.ProductQueryHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductQueryController implements IGenericQueryController<ProductDto> {

  private final ProductQueryHandler queryHandler;

  public ProductQueryController(ProductQueryHandler queryHandler) {
    this.queryHandler = queryHandler;
  }

  @Override
  public IGenericQueryHandler getQueryHandler() {
    return queryHandler;
  }
}
