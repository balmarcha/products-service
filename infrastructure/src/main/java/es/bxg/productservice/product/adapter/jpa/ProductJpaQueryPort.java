package es.bxg.productservice.product.adapter.jpa;

import es.bxg.commonlib.adapter.mapper.IGenericDboMapper;
import es.bxg.commonlib.adapter.port.GenericJpaQueryPort;
import es.bxg.commonlib.adapter.repository.IGenericRepository;
import es.bxg.productservice.product.adapter.entity.ProductEntity;
import es.bxg.productservice.product.adapter.mapper.ProductDboMapper;
import es.bxg.productservice.product.adapter.repository.IProductRepository;
import es.bxg.productservice.product.model.pojo.ProductPojo;
import es.bxg.productservice.product.port.IProductQueryPort;
import org.springframework.stereotype.Repository;

@Repository
public class ProductJpaQueryPort
    extends GenericJpaQueryPort<ProductEntity, ProductPojo, Long>
    implements IProductQueryPort {

  private final ProductDboMapper mapper;
  private final IProductRepository repository;

  public ProductJpaQueryPort(ProductDboMapper mapper, IProductRepository repository) {
    this.mapper = mapper;
    this.repository = repository;
  }


  @Override
  protected IGenericDboMapper<ProductEntity, ProductPojo> getMapper() {
    return mapper;
  }

  @Override
  protected IGenericRepository<ProductEntity, Long> getRepository() {
    return repository;
  }

  @Override
  protected Class<ProductEntity> getEntityClass() {
    return ProductEntity.class;
  }
}
