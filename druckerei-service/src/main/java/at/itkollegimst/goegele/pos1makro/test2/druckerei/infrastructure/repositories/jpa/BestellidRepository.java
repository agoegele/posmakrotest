package at.itkollegimst.goegele.pos1makro.test2.druckerei.infrastructure.repositories.jpa;

import at.itkollegimst.goegele.pos1makro.test2.druckerei.domain.model.aggregates.Bestellid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestellidRepository extends JpaRepository<Bestellid, Long> {
}
