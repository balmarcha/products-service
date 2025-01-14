package es.bxg.productservice.product.port;

import es.bxg.commonlib.port.IGenericCommandPort;
import es.bxg.productservice.product.model.pojo.ProductPojo;

public interface IProductCommandPort extends IGenericCommandPort<ProductPojo, Long> {
}
