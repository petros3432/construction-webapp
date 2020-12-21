package gr.pf.team2.constructionwebapp.forms;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;

import javax.validation.constraints.*;

public class RepairForm {


    private static final String COST_PATTERN = "(?!0\\.00)[1-9]\\d{0,9}(\\.(\\d|\\d\\d))?";



    @NotEmpty(message = "{repairCreate.scheduledDate.not.null}")
    private String scheduledDate;


    private StateOfRepair state;

    private TypeOfRepair typeOfRepair;


    @Pattern(regexp = COST_PATTERN, message = "{repairCreate.cost.pattern.invalid}")
    private String cost;

    @NotEmpty(message="{repairCreate.address.not.null}")
    private String address;

    private String textDesc;

    private Property property;

    public Property getProperty() { return property; }

    public void setProperty(Property property) { this.property = property; }



    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public StateOfRepair getState() {
        return state;
    }

    public void setState(StateOfRepair state) {
        this.state = state;
    }

    public TypeOfRepair getTypeOfRepair() {
        return typeOfRepair;
    }

    public void setTypeOfRepair(TypeOfRepair typeOfRepair) {
        this.typeOfRepair = typeOfRepair;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTextDesc() {
        return textDesc;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }





}
