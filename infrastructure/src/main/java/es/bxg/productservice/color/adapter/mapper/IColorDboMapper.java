package es.bxg.productservice.color.adapter.mapper;

import es.bxg.commonlib.adapter.mapper.IGenericDboMapper;
import es.bxg.productservice.color.adapter.entity.ColorEntity;
import es.bxg.productservice.color.model.pojo.ColorPojo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IColorDboMapper extends IGenericDboMapper<ColorEntity, ColorPojo> {
}

