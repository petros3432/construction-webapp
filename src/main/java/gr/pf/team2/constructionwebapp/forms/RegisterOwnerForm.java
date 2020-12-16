package gr.pf.team2.constructionwebapp.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegisterOwnerForm {

    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";
    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
    private static final String TELEPHONE_PATTERN = "^[0-9]*$";
    private static final String AFM_PATTERN = "^[0-9]*$";

    private static final int PASSWORD_MIN_SIZE = 6;
    private static final int PASSWORD_MAX_SIZE = 20;
    private static final int TELEPHONE_SIZE = 10;
    private static final int AFM_SIZE = 9;




    @Pattern(regexp = PASSWORD_PATTERN, message = "{registerOwner.password.pattern.invalid}")
    @Size(min = PASSWORD_MIN_SIZE, max = PASSWORD_MAX_SIZE, message = "{registerOwner.password.size.invalid}")
    @NotEmpty(message = "{registerOwner.password.not.null}")
    private String password;

    @Pattern(regexp = MAIL_PATTERN, message = "{registerOwner.email.pattern.invalid}")
    @NotEmpty(message = "{registerOwner.email.not.null}")
    private String email;



    @Pattern(regexp = TELEPHONE_PATTERN, message = "{registerOwner.tel.pattern.invalid}")
    @Size( min = TELEPHONE_SIZE, max= TELEPHONE_SIZE, message = "{register.tel.size.invalid}")
    private String tel;



    @Pattern(regexp = AFM_PATTERN, message = "{registerOwner.afm.pattern.invalid}")
    @Size( min = AFM_SIZE, max= AFM_SIZE, message = "{registerOwner.afm.size.invalid}")
    private String afm;

    @NotEmpty(message = "{registerOwner.firstName.not.null}")
    private String name;


    @NotEmpty(message = "{registerOwner.lastName.not.null}")
    private String surname;

    private String userType;

    private String address;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType ;
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

    private String typeOfProperty;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(String typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
