package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.repositories.jpa;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestellungRepository extends JpaRepository<Bestellung, Integer> {


}
