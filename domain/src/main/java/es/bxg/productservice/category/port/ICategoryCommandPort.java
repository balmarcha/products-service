package es.bxg.productservice.category.port;

import es.bxg.commonlib.port.IGenericCommandPort;
import es.bxg.productservice.category.model.pojo.CategoryPojo;

public interface ICategoryCommandPort extends IGenericCommandPort<CategoryPojo, Long> {
}
