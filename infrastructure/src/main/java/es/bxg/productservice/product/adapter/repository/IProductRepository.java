package es.bxg.productservice.product.adapter.repository;

import es.bxg.commonlib.adapter.repository.IGenericRepository;
import es.bxg.productservice.product.adapter.entity.ProductEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends IGenericRepository<ProductEntity, Long> {
}
