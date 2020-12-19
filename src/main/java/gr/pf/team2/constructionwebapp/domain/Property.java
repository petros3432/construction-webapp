package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name="Property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Property_id")
    private Long id;

    @Column(name = "PropertyE9")
    private String propertyE9;

    @Column(name = "Address")
    private String address;

    @Column(name = "Year")
    private String year;

    @Column(name = "Afm")
    private String afm;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type_of_Property")
    private TypeOfProperty typeOfProperty;

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "Owner_id")
    private Owner owner;

    @OneToMany(mappedBy = "property", targetEntity = Repair.class, orphanRemoval = true )
    private List<Repair> repairs;

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyE9() {
        return propertyE9;
    }

    public void setPropertyE9(String propertyE9) {
        this.propertyE9 = propertyE9;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public TypeOfProperty getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(TypeOfProperty typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }
}
