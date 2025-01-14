package es.bxg.productservice.category.rest.controller;

import es.bxg.commonlib.rest.controllers.IGenericCommandController;
import es.bxg.commonlib.service.IGenericCommandHandler;
import es.bxg.productservice.category.model.dto.CategoryDto;
import es.bxg.productservice.category.service.CategoryCommandHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryCommandController implements IGenericCommandController<CategoryDto> {

  private final CategoryCommandHandler commandHandler;

  public CategoryCommandController(CategoryCommandHandler commandHandler) {
    this.commandHandler = commandHandler;
  }


  @Override
  public IGenericCommandHandler getCommandHandler() {
    return commandHandler;
  }
}