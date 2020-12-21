package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.Role;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name="Owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Owner_id")
    private Long id;

    @Column(name = "AFM")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private String afm;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Address")
    private String address;

    @Column(name = "Telephone_number")
    private String tel;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @OneToMany(mappedBy = "owner", targetEntity = Property.class, orphanRemoval = true)
    private List<Property> property;

    public List<Property> getProperty() { return property; }

    public void setProperty(List<Property> property) { this.property = property; }

    public Owner() {
    }

    public Owner(String afm, String name, String surname, String address
            , String tel, String email, String password , Role role) {
        this.afm = afm;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getAfm() {
        return afm;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }



    public void setAfm(String afm) {
        this.afm = afm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("id=").append(id);
        sb.append(",Name='").append(name).append('\'');
        sb.append(",Surname='").append(surname).append('\'');
        sb.append(",AFM='").append(afm).append('\'');
        sb.append(",Address='").append(address).append('\'');
        sb.append(",Telephone_Number='").append(address).append('\'');
        sb.append(",Email='").append(email).append('\'');
        sb.append(",Password='").append(password).append('\'');
        sb.append(",Role='").append(role).append('\'');
        sb.append('}');
        return sb.toString();
    }



}
