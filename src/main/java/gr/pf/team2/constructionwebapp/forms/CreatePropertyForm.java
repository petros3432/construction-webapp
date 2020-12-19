package gr.pf.team2.constructionwebapp.forms;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class CreatePropertyForm {

    private String propertyE9;

    private String address;

    private String year;

    @NotEmpty(message = "{registerOwner.firstName.not.null}")
    private String afm;

    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    private TypeOfProperty typeOfProperty;

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

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public TypeOfProperty getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(TypeOfProperty typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

}
