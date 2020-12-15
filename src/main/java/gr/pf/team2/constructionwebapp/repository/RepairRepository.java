package gr.pf.team2.constructionwebapp.repository;

import gr.pf.team2.constructionwebapp.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Long> {

    @Query(value="SELECT * FROM Repair ORDER BY Scheduled_Date_Of_Repair DESC", nativeQuery = true)
    List<Repair> firstTenRepairs();

    Optional<Repair> findById(Long id);

    @Query(value="SELECT * FROM Repair,Owner WHERE Repair.Owner_id=Owner.Owner_id AND Owner.AFM=(:afm)", nativeQuery = true)
    List<Repair> findByAfm(String afm);

    @Query(value="SELECT * FROM Repair,Owner WHERE Repair.Owner_id=Owner.Owner_id AND Owner.AFM=(:afm)", nativeQuery = true)
    Optional<List<Repair>> advSearchAfm(String afm);

    @Query(value="SELECT * FROM Repair,Owner WHERE Repair.Owner_id=Owner.Owner_id AND Owner.AFM=(:afm) AND Repair.Scheduled_Date_Of_Repair=(:startDate)", nativeQuery = true)
    Optional<List<Repair>> advSearchAfmDate(String afm, LocalDate startDate);

    @Query(value="SELECT * FROM Repair,Owner WHERE Repair.Owner_id=Owner.Owner_id AND Owner.AFM=(:afm) AND (Repair.Scheduled_Date_Of_Repair>=(:startDate) AND Repair.Scheduled_Date_Of_Repair<=(:endDate))", nativeQuery = true)
    Optional<List<Repair>> advSearchAfmDateBandwidth(String afm, LocalDate startDate, LocalDate endDate);

    @Query(value="SELECT * FROM Repair,Owner WHERE Repair.Owner_id=Owner.Owner_id AND Repair.Scheduled_Date_Of_Repair=(:startDate)", nativeQuery = true)
    Optional<List<Repair>> advSearchDate(LocalDate startDate);

    @Query(value="SELECT * FROM Repair,Owner WHERE Repair.Owner_id=Owner.Owner_id AND (Repair.Scheduled_Date_Of_Repair>=(:startDate) AND Repair.Scheduled_Date_Of_Repair<=(:endDate))", nativeQuery = true)
    Optional<List<Repair>> advSearchDateBandwidth(LocalDate startDate, LocalDate endDate);

}
