package gr.pf.team2.constructionwebapp.models;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


public class PropertyModel {
    private static final String AFM_PATTERN = "^[0-9]*$";


    private static final String YEAR_PATTERN = "^[12][0-9]{3}$";



    @NotEmpty(message = "{createProperty.propertyE9.not.null}")
    private String propertyE9;

    private Long id;



    @NotEmpty(message = "{createProperty.address.not.null}")
    private String address;


    @Pattern(regexp=YEAR_PATTERN,message = "{createProperty.year.pattern.invalid}")
    @NotEmpty(message="{createProperty.year.not.null}")
    private String year;

    private TypeOfProperty typeOfProperty;


    @Pattern(regexp = AFM_PATTERN,message="{createProperty.afm.pattern.invalid}")
    @NotEmpty(message = "{createProperty.afm.not.null}")
    private String afm;

    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}