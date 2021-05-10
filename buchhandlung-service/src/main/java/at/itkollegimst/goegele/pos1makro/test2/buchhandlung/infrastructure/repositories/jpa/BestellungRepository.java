package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.repositories.jpa;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellung;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellungid;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BestellungRepository extends JpaRepository<Bestellung, Long> {

    @Modifying
    @Query("update Bestellung set status = :status where bestellid = :bestellid")
    void updateStatus(@Param("status") Status status, @Param("bestellid") Bestellungid bestellid);

}
