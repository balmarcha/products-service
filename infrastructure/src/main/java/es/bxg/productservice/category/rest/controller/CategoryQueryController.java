package es.bxg.productservice.category.rest.controller;

import es.bxg.commonlib.rest.controllers.IGenericQueryController;
import es.bxg.commonlib.service.IGenericQueryHandler;
import es.bxg.productservice.category.model.dto.CategoryDto;
import es.bxg.productservice.category.service.CategoryQueryHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryQueryController implements IGenericQueryController<CategoryDto> {

  private final CategoryQueryHandler queryHandler;

  public CategoryQueryController(CategoryQueryHandler queryHandler) {
    this.queryHandler = queryHandler;
  }

  @Override
  public IGenericQueryHandler getQueryHandler() {
    return queryHandler;
  }
}
