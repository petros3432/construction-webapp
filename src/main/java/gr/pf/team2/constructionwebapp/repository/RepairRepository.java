package gr.pf.team2.constructionwebapp.repository;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Long> {

    @Query(value="SELECT TOP 10 * FROM Repair ORDER BY Scheduled_Date_Of_Repair DESC", nativeQuery = true)
    List<Repair> firstTenRepairs();
}
