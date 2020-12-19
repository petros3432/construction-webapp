package gr.pf.team2.constructionwebapp.models;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.enums.Role;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static gr.pf.team2.constructionwebapp.enums.Role.USER;

public class OwnerModel {
    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
    private static final String AFM_PATTERN = "^[0-9]*$";
    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";
    private static final int PASSWORD_MIN_SIZE = 6;
    private static final int PASSWORD_MAX_SIZE = 20;
    private static final int AFM_SIZE = 9;
    private static final int TELEPHONE_SIZE = 10;
    private static final String TELEPHONE_PATTERN = "^[0-9]*$";




    @Pattern(regexp = AFM_PATTERN, message = "{registerOwner.afm.pattern.invalid}")
    @Size( min = AFM_SIZE, max= AFM_SIZE, message = "{registerOwner.afm.size.invalid}")
    private String afm;

    @NotEmpty(message = "{registerOwner.firstName.not.null}")
    private String name;

    @NotEmpty(message = "{registerOwner.lastNAme.not.null}")
    private String surname;

    private String address;

    @Pattern(regexp = TELEPHONE_PATTERN, message = "{registerOwner.tel.pattern.invalid}")
    @Size( min = TELEPHONE_SIZE, max= TELEPHONE_SIZE, message = "{registerOwner.tel.size.invalid}")
    private String tel;

    @Pattern(regexp = MAIL_PATTERN, message = "{registerOwner.email.pattern.invalid}")
    @NotEmpty(message = "{registerOwner.email.not.null}")
    private String email;

    @Pattern(regexp = PASSWORD_PATTERN, message = "{registerOwner.password.pattern.invalid}")
    @Size(min = PASSWORD_MIN_SIZE, max = PASSWORD_MAX_SIZE, message = "{registerOwner.password.size.invalid}")
//    @NotEmpty(message = "{registerOwner.password.not.null}")
    private String password;

    private Role role;

    private Long id;

    public OwnerModel(String afm, String name, String surname, String address, String tel, String email, String password, Long id, Role role) {
        this.afm = afm;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.password = password;
        this.id = id;
        this.role = USER;
    }
    public OwnerModel(){

    }
    public String getAfm() {
        return afm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
