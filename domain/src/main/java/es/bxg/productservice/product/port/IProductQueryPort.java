package es.bxg.productservice.product.port;

import es.bxg.commonlib.port.IGenericQueryPort;
import es.bxg.productservice.product.model.pojo.ProductPojo;

public interface IProductQueryPort extends IGenericQueryPort<ProductPojo, Long> {
}