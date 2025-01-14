package es.bxg.productservice.product.adapter.jpa;

import es.bxg.commonlib.adapter.mapper.IGenericDboMapper;
import es.bxg.commonlib.adapter.port.GenericJpaCommandPort;
import es.bxg.commonlib.adapter.repository.IGenericRepository;
import es.bxg.productservice.product.adapter.entity.ProductEntity;
import es.bxg.productservice.product.adapter.mapper.ProductDboMapper;
import es.bxg.productservice.product.adapter.repository.IProductRepository;
import es.bxg.productservice.product.model.pojo.ProductPojo;
import es.bxg.productservice.product.port.IProductCommandPort;
import org.springframework.stereotype.Repository;

@Repository
public class ProductJpaCommandPort
    extends GenericJpaCommandPort<ProductEntity, ProductPojo, Long>
    implements IProductCommandPort {

  private final ProductDboMapper mapper;
  private final IProductRepository repository;

  public ProductJpaCommandPort(ProductDboMapper mapper, IProductRepository repository) {
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
}
