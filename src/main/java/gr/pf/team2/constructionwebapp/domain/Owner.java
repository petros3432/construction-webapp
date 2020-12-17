package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.enums.UserRole;
import lombok.Data;

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
    @Column(name = "Type_of_Property")
    private TypeOfProperty typeOfProperty;

    @Enumerated(EnumType.STRING)
    @Column(name = "Role")
    private UserRole role;

    @OneToMany(mappedBy = "owner", targetEntity = Repair.class, orphanRemoval = true )
    private List<Repair> repairs;


    public Owner() {
    }

    public Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }



    public Owner(String afm, String name, String surname, String address, String tel, String email, String password , TypeOfProperty typeOfProperty , UserRole role) {
        this.afm = afm;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.password = password;
        this.typeOfProperty = typeOfProperty;
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

    public TypeOfProperty getTypeOfProperty() {
        return typeOfProperty;
    }

    public List<Repair> getRepairs() {
        return repairs;
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


    public void setTypeOfProperty(TypeOfProperty typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }


    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
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
        sb.append(",Type_of_Property='").append(typeOfProperty.getFullName()).append('\'');
        sb.append(",Role='").append(role).append('\'');
        sb.append('}');
        return sb.toString();
    }



}
