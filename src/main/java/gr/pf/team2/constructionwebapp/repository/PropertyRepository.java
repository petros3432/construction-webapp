package gr.pf.team2.constructionwebapp.repository;

import gr.pf.team2.constructionwebapp.domain.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Long> {
    @Query(value = "SELECT * FROM Property ", nativeQuery = true)
    List<Property> firstTenProperties();

    @Query(value = "SELECT * FROM Property WHERE Address = (:address)", nativeQuery = true)
    Optional<Property> findPropertyByAddress(String address);

    @Query(value = "SELECT * FROM Property WHERE Afm = (:afm)", nativeQuery = true)
    Optional<Property> findPropertyByAfm(String afm);

    @Query(value="SELECT * FROM Property WHERE Property.PropertyE9=(:propertyE9)", nativeQuery = true)
    List<Property> advSearchE9(String propertyE9);

    @Query(value="SELECT * FROM Property WHERE Property.Afm=(:afm)", nativeQuery = true)
    List<Property> advSearchAfm(String afm);

    @Query(value="SELECT * FROM Property WHERE Property.PropertyE9=(:propertyE9) AND Property.Afm=(:afm)", nativeQuery = true)
    List<Property> advSearchE9Afm(String propertyE9,String afm);

    @Query(value="SELECT * FROM Property,Owner WHERE Property.Owner_id = Owner.Owner_id AND Property.Owner_id = (:id) ", nativeQuery = true)
    List<Property> findPropertyByOwner(Long id);

    @Transactional
    @Modifying
    @Query(value="UPDATE Property SET Afm=(:afm) WHERE Property.Owner_id=(:id)", nativeQuery = true)
    void updateProperty(Long id,String afm);

    @Query(value="SELECT * FROM Property WHERE Property.PropertyE9=(:propertyE9)",nativeQuery = true)
    Optional<Property> findPropertyByE9Property(String propertyE9);
}
