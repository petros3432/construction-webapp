package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="Repair")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Repair_id")
    private Long id;

    @DateTimeFormat
    @Column(name = "Scheduled_Date_Of_Repair")
    private LocalDate scheduledDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "State_Of_Repair")
    private StateOfRepair state;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type_Of_Repair")
    private TypeOfRepair typeOfRepair;

    @Column(name = "Cost")
    private String cost;

    @Column(name = "Address")
    private String address;

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "Property_id")
    private Property property;

    @Column(name = "Description")
    private String textDesc;


    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public StateOfRepair getState() {
        return state;
    }

    public void setState(StateOfRepair state) {
        this.state = state;
    }

    public TypeOfRepair getTypeOfRepair() {
        return typeOfRepair;
    }

    public void setTypeOfRepair(TypeOfRepair typeOfRepair) {
        this.typeOfRepair = typeOfRepair;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTextDesc() {
        return textDesc;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }


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
        sb.append('}');
        return sb.toString();
    }




}
