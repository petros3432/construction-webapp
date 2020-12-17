package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import lombok.Data;

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
    private int year;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type_of_Property")
    private TypeOfProperty typeOfProperty;

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "Owner_id")
    private Owner owner;

    @OneToMany(mappedBy = "Property", targetEntity = Property.class, orphanRemoval = true )
    private List<Repair> repairs;


}
