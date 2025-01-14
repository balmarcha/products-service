package es.bxg.productservice.color.adapter.jpa;

import es.bxg.commonlib.adapter.mapper.IGenericDboMapper;
import es.bxg.commonlib.adapter.port.GenericJpaCommandPort;
import es.bxg.commonlib.adapter.repository.IGenericRepository;
import es.bxg.productservice.color.adapter.entity.ColorEntity;
import es.bxg.productservice.color.adapter.mapper.IColorDboMapper;
import es.bxg.productservice.color.adapter.repository.IColorRepository;
import es.bxg.productservice.color.model.pojo.ColorPojo;
import es.bxg.productservice.color.port.IColorCommandPort;
import org.springframework.stereotype.Repository;

@Repository
public class ColorJpaCommandPort
    extends GenericJpaCommandPort<ColorEntity, ColorPojo, Long>
    implements IColorCommandPort {

  private final IColorDboMapper mapper;
  private final IColorRepository repository;

  public ColorJpaCommandPort(IColorDboMapper mapper, IColorRepository repository) {
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
}
