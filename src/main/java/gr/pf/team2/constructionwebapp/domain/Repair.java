package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Repair")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repair_id)")
    private Long id;

    @Column(name = "Scheduled Date Of Repair")
    private Date scheduledDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "State Of Repair")
    private StateOfRepair state;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type Of Repair")
    private TypeOfRepair typeOfRepair;

    @Column(name = "Cost")
    private double cost;

    @Column(name = "Address")
    private String address;

    @Column(name = "Description")
    private String textDesc;

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Author{");
        sb.append("id=").append(id);
        sb.append(", Scheduled ='").append(scheduledDate).append('\'');
        sb.append(", State Of Repair='").append(state.getFullName()).append('\'');
        sb.append(", Type Of Repair='").append(typeOfRepair.getFullName()).append('\'');
        sb.append(", Cost='").append(cost).append('\'');
        sb.append(", Address='").append(address).append('\'');
        sb.append(", Decription='").append(textDesc).append('\'');
        sb.append(", Owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
