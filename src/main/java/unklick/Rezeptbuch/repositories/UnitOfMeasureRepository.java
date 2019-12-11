package unklick.Rezeptbuch.repositories;

import org.springframework.data.repository.CrudRepository;
import unklick.Rezeptbuch.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
