package es.bxg.productservice.product.mapper;

import es.bxg.commonlib.mapper.IGenericDtoMapper;
import es.bxg.productservice.category.mapper.ICategoryDtoMapper;
import es.bxg.productservice.color.mapper.IColorDtoMapper;
import es.bxg.productservice.product.model.dto.ProductDto;
import es.bxg.productservice.product.model.pojo.ProductPojo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {IColorDtoMapper.class, ICategoryDtoMapper.class})
public interface IProductDtoMapper extends IGenericDtoMapper<ProductPojo, ProductDto> {
}
