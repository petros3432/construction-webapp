package gr.pf.team2.constructionwebapp.repository;

import gr.pf.team2.constructionwebapp.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Long> {

    @Query(value="SELECT * FROM Repair ORDER BY Scheduled_Date_Of_Repair DESC", nativeQuery = true)
    List<Repair> firstTenRepairs();

    Optional<Repair> findById(Long id);

    @Query(value="SELECT * FROM Repair,Owner WHERE Repair.Owner_id=Admin.Owner_id AND Owner.AFM=(:afm)", nativeQuery = true)
    List<Repair> findByAfm(String afm);

}
