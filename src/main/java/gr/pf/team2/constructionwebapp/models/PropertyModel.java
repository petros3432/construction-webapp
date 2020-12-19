package gr.pf.team2.constructionwebapp.models;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;


public class PropertyModel {

    private Long id;

    private String propertyE9;

    private String address;

    private String year;

    private String afm;

    private TypeOfProperty typeOfProperty;

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
