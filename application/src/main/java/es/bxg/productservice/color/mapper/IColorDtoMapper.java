package es.bxg.productservice.color.mapper;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.productservice.color.model.dto.ColorDto;
import es.bxg.productservice.color.model.pojo.ColorPojo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IColorDtoMapper extends IGenericDtoMapper<ColorPojo, ColorDto> {
}
