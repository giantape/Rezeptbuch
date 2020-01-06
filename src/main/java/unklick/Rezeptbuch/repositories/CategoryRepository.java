package unklick.Rezeptbuch.repositories;

import org.springframework.data.repository.CrudRepository;
import unklick.Rezeptbuch.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);

}
