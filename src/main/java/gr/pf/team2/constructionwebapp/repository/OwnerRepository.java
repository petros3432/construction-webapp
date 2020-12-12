package gr.pf.team2.constructionwebapp.repository;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {

    @Query(value="SELECT * FROM Owner WHERE AFM = (:afm)")
    Optional<Owner> findOwnerByAfm(String afm);

    @Query(value="SELECT * FROM Owner WHERE Email = (:email)")
    Optional<Owner> findOwnerByEmail(String email);

    @Query(value="UPDATE Owner SET Address=(:address) WHERE Owner_id = (:id)")
    void updateAddress(Long id,String address);
}
