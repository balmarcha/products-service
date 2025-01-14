package es.bxg.productservice.color.adapter.jpa;

import es.bxg.commonlib.adapter.mapper.IGenericDboMapper;
import es.bxg.commonlib.adapter.port.GenericJpaQueryPort;
import es.bxg.commonlib.adapter.repository.IGenericRepository;
import es.bxg.productservice.color.adapter.entity.ColorEntity;
import es.bxg.productservice.color.adapter.mapper.IColorDboMapper;
import es.bxg.productservice.color.adapter.repository.IColorRepository;
import es.bxg.productservice.color.model.pojo.ColorPojo;
import es.bxg.productservice.color.port.IColorQueryPort;
import org.springframework.stereotype.Repository;

@Repository
public class ColorJpaQueryPort
    extends GenericJpaQueryPort<ColorEntity, ColorPojo, Long>
    implements IColorQueryPort {

  private final IColorDboMapper mapper;
  private final IColorRepository repository;

  public ColorJpaQueryPort(IColorDboMapper mapper, IColorRepository repository) {
    this.mapper = mapper;
    this.repository = repository;
  }


  @Override
  protected IGenericDboMapper<ColorEntity, ColorPojo> getMapper() {
    return mapper;
  }

  @Override
  protected IGenericRepository<ColorEntity, Long> getRepository() {
    return repository;
  }

  @Override
  protected Class<ColorEntity> getEntityClass() {
    return ColorEntity.class;
  }
}
