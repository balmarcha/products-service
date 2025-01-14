package es.bxg.productservice.product.adapter.mapper;

import es.bxg.commonlib.adapter.mapper.IGenericDboMapper;
import es.bxg.productservice.category.adapter.mapper.ICategoryDboMapper;
import es.bxg.productservice.color.adapter.mapper.IColorDboMapper;
import es.bxg.productservice.product.adapter.entity.ProductEntity;
import es.bxg.productservice.product.model.pojo.ProductPojo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {IColorDboMapper.class, ICategoryDboMapper.class})
public interface ProductDboMapper extends IGenericDboMapper<ProductEntity, ProductPojo> {
}

