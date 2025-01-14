package es.bxg.productservice.category.adapter.jpa;

import es.bxg.commonlib.adapter.mapper.IGenericDboMapper;
import es.bxg.commonlib.adapter.port.GenericJpaQueryPort;
import es.bxg.commonlib.adapter.repository.IGenericRepository;
import es.bxg.productservice.category.adapter.entity.CategoryEntity;
import es.bxg.productservice.category.adapter.mapper.ICategoryDboMapper;
import es.bxg.productservice.category.adapter.repository.ICategoryRepository;
import es.bxg.productservice.category.model.pojo.CategoryPojo;
import es.bxg.productservice.category.port.ICategoryQueryPort;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryJpaQueryPort
    extends GenericJpaQueryPort<CategoryEntity, CategoryPojo, Long>
    implements ICategoryQueryPort {

  private final ICategoryDboMapper mapper;
  private final ICategoryRepository repository;

  public CategoryJpaQueryPort(ICategoryDboMapper mapper, ICategoryRepository repository) {
    this.mapper = mapper;
    this.repository = repository;
  }


  @Override
  protected IGenericDboMapper<CategoryEntity, CategoryPojo> getMapper() {
    return mapper;
  }

  @Override
  protected IGenericRepository<CategoryEntity, Long> getRepository() {
    return repository;
  }

  @Override
  protected Class<CategoryEntity> getEntityClass() {
    return CategoryEntity.class;
  }
}
