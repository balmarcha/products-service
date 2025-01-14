package es.bxg.productservice.category.adapter.mapper;

import es.bxg.commonlib.adapter.mapper.IGenericDboMapper;
import es.bxg.productservice.category.adapter.entity.CategoryEntity;
import es.bxg.productservice.category.model.pojo.CategoryPojo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICategoryDboMapper extends IGenericDboMapper<CategoryEntity, CategoryPojo> {
}

