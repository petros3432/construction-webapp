package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Long id;

    @Column(name = "ΑΦΜ", nullable = false)
    private String afm;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Address")
    private String address;

    @Column(name = "Telephone number")
    private String tel;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type of Property")
    private TypeOfProperty typeOfProperty;

    @OneToMany(mappedBy = "Repair", targetEntity = Repair.class)
    private List<Repair> repairs;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(name).append('\'');
        sb.append(", lastName='").append(surname).append('\'');
        sb.append(", ΑΦΜ='").append(afm).append('\'');
        sb.append(", Email='").append(email).append('\'');
        sb.append(", Password='").append(password).append('\'');
        sb.append(", Type of Property='").append(typeOfProperty.getFullName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
