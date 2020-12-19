package gr.pf.team2.constructionwebapp.repository;

import gr.pf.team2.constructionwebapp.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Long> {

    @Query(value="SELECT * FROM Repair ORDER BY Scheduled_Date_Of_Repair DESC", nativeQuery = true)
    List<Repair> firstTenRepairs();

    Optional<Repair> findById(Long id);

    @Query(value="SELECT * FROM Repair,Property WHERE Repair.Property_id=Property.Property_id AND Property.Afm=(:afm)", nativeQuery = true)
    List<Repair> findByAfm(String afm);

    @Query(value="SELECT * FROM Repair,Property WHERE Repair.Property_id=Property.Property_id AND Property.Afm=(:afm)", nativeQuery = true)
    List<Repair> advSearchAfm(String afm);

    @Query(value="SELECT * FROM Repair,Property WHERE Repair.Property_id=Property.Property_id AND Property.Afm=(:afm) AND Repair.Scheduled_Date_Of_Repair=(:startDate)", nativeQuery = true)
    List<Repair> advSearchAfmDate(String afm, LocalDate startDate);

    @Query(value="SELECT * FROM Repair,Property WHERE Repair.Property_id=Property.Property_id AND Property.Afm=(:afm) AND (Repair.Scheduled_Date_Of_Repair>=(:startDate) AND Repair.Scheduled_Date_Of_Repair<=(:endDate))", nativeQuery = true)
    List<Repair> advSearchAfmDateBandwidth(String afm, LocalDate startDate, LocalDate endDate);

    @Query(value="SELECT * FROM Repair,Property WHERE Repair.Property_id=Property.Property_id AND Repair.Scheduled_Date_Of_Repair=(:startDate)", nativeQuery = true)
    List<Repair> advSearchDate(LocalDate startDate);

    @Query(value="SELECT * FROM Repair,Property WHERE Repair.Property_id=Property.Property_id AND (Repair.Scheduled_Date_Of_Repair>=(:startDate) AND Repair.Scheduled_Date_Of_Repair<=(:endDate))", nativeQuery = true)
    List<Repair> advSearchDateBandwidth(LocalDate startDate, LocalDate endDate);

    @Transactional
    @Modifying
    @Query(value="UPDATE Repair SET Address=(:address) WHERE Repair.Property_id=(:id)", nativeQuery = true)
    void updateRepair(Long id,String address);

}
