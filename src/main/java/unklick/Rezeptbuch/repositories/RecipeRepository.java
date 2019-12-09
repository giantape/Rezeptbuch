package unklick.Rezeptbuch.repositories;

import org.springframework.data.repository.CrudRepository;
import unklick.Rezeptbuch.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
