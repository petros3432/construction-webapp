package gr.pf.team2.constructionwebapp.repository;

import gr.pf.team2.constructionwebapp.domain.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Long> {

    @Query(value = "SELECT * FROM Property WHERE Address = (:address)", nativeQuery = true)
    Optional<Property> findPropertyByAddress(String address);

    @Query(value = "SELECT * FROM Property WHERE Afm = (:afm)", nativeQuery = true)
    Optional<Property> findPropertyByAfm(String afm);

}
