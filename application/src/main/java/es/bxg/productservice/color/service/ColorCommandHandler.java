package es.bxg.productservice.color.service;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.commonlib.service.IGenericCommandHandler;
import es.bxg.commonlib.service.IGenericCommandService;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.color.mapper.IColorDtoMapper;
import es.bxg.productservice.color.model.dto.ColorDto;
import es.bxg.productservice.color.model.pojo.ColorPojo;
import org.springframework.stereotype.Component;

@Component
public class ColorCommandHandler implements IGenericCommandHandler<ColorPojo, ColorDto, Long> {

  private final IColorDtoMapper mapper;
  private final ColorQueryService queryService;
  private final ColorCommandService commandService;

  public ColorCommandHandler(IColorDtoMapper mapper, ColorQueryService queryService, ColorCommandService commandService) {
    this.mapper = mapper;
    this.queryService = queryService;
    this.commandService = commandService;
  }

  @Override
  public IGenericDtoMapper<ColorPojo, ColorDto> getMapper() {
    return mapper;
  }

  @Override
  public IGenericQueryService<ColorPojo, Long> getQueryService() {
    return queryService;
  }

  @Override
  public IGenericCommandService<ColorPojo, Long> getCommandService() {
    return commandService;
  }
}
