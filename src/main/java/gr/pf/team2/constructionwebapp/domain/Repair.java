package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Repair")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Repair_id")
    private Long id;

    @Column(name = "Scheduled_Date_Of_Repair")
    private LocalDate scheduledDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "State_Of_Repair")
    private StateOfRepair state;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type_Of_Repair")
    private TypeOfRepair typeOfRepair;

    @Column(name = "Cost")
    private double cost;

    @Column(name = "Address")
    private String address;

    @Column(name = "Description")
    private String textDesc;

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "Owner_id")
    private Owner owner;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Repair{");
        sb.append("id=").append(id);
        sb.append(",Scheduled_Date_Of_Repair='").append(scheduledDate).append('\'');
        sb.append(",State_Of_Repair='").append(state.getFullName()).append('\'');
        sb.append(",Type_Of_Repair='").append(typeOfRepair.getFullName()).append('\'');
        sb.append(",Cost='").append(cost).append('\'');
        sb.append(",Address='").append(address).append('\'');
        sb.append(",Description='").append(textDesc).append('\'');
        sb.append(",owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }




}
