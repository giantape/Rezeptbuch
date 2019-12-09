package unklick.Rezeptbuch.repositories;

import org.springframework.data.repository.CrudRepository;
import unklick.Rezeptbuch.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
