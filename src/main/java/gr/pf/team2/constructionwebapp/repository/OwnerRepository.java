package gr.pf.team2.constructionwebapp.repository;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {

    @Query(value = "SELECT * FROM Owner WHERE AFM = (:afm)", nativeQuery = true)
    Optional<OwnerModel> findOwnerByAfm(String afm);

    @Query(value = "SELECT * FROM Owner WHERE AFM = (:afm)", nativeQuery = true)
    Optional<Owner> findOwnerByAfmOwner(String afm);

    @Query(value = "SELECT * FROM Owner WHERE Email = (:email)", nativeQuery = true)
    Owner findOwnerByEmail(String email);

    @Query(value = "SELECT * FROM Owner ORDER BY Name DESC", nativeQuery = true)
    List<Owner> firstTenOwners();

    Optional<Owner> findById(Long id);



    @Query(value = "SELECT * FROM Owner WHERE Owner.AFM=(:afm)", nativeQuery = true)
    List<Owner> advSearchAfm(String afm);

    @Query(value = "SELECT * FROM Owner WHERE Owner.Email=(:email)", nativeQuery = true)
    List<Owner> advSearchEmail(String email);

    @Query(value = "SELECT * FROM Owner WHERE Owner.AFM=(:afm) AND Owner.Email=(:email)", nativeQuery = true)
    List<Owner> advSearchAfmEmail(String afm,String email);

}
