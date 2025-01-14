package es.bxg.productservice.category.mapper;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.productservice.category.model.dto.CategoryDto;
import es.bxg.productservice.category.model.pojo.CategoryPojo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICategoryDtoMapper extends IGenericDtoMapper<CategoryPojo, CategoryDto> {
}
