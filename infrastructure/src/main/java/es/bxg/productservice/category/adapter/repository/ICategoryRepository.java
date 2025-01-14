package es.bxg.productservice.category.adapter.repository;

import es.bxg.commonlib.adapter.repository.IGenericRepository;
import es.bxg.productservice.category.adapter.entity.CategoryEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends IGenericRepository<CategoryEntity, Long> {
}
