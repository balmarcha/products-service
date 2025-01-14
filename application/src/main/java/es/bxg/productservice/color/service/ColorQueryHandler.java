package es.bxg.productservice.color.service;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.commonlib.service.IGenericQueryHandler;
import es.bxg.commonlib.service.IGenericQueryService;
import es.bxg.productservice.color.mapper.IColorDtoMapper;
import es.bxg.productservice.color.model.dto.ColorDto;
import es.bxg.productservice.color.model.pojo.ColorPojo;
import org.springframework.stereotype.Component;

@Component
public class ColorQueryHandler implements IGenericQueryHandler<ColorPojo, ColorDto, Long> {

  private final IColorDtoMapper mapper;
  private final ColorQueryService queryService;

  public ColorQueryHandler(IColorDtoMapper mapper, ColorQueryService queryService) {
    this.mapper = mapper;
    this.queryService = queryService;
  }

  @Override
  public IGenericDtoMapper<ColorPojo, ColorDto> getMapper() {
    return mapper;
  }

  @Override
  public IGenericQueryService<ColorPojo, Long> getQueryService() {
    return queryService;
  }
}
