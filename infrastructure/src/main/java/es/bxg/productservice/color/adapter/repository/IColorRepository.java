package es.bxg.productservice.color.adapter.repository;

import es.bxg.commonlib.adapter.repository.IGenericRepository;
import es.bxg.productservice.color.adapter.entity.ColorEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface IColorRepository extends IGenericRepository<ColorEntity, Long> {
}
