package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.repositories.jpa;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BestellungRepository extends JpaRepository<Bestellung, Long> {

    @Query("update Bestellung set status = :status where bestellid = :bestellid")
    Bestellung updateStatus(@Param("status") String status, @Param("bestellid") String bestellid);

    List<Bestellung> findAll();
}
