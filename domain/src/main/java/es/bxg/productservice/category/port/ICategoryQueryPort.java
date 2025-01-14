package es.bxg.productservice.category.port;

import es.bxg.commonlib.port.IGenericQueryPort;
import es.bxg.productservice.category.model.pojo.CategoryPojo;

public interface ICategoryQueryPort extends IGenericQueryPort<CategoryPojo, Long> {
}