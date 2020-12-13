package gr.pf.team2.constructionwebapp.forms;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;

import java.time.LocalDate;

public class RepairForm {

    private LocalDate scheduledDate;

    private StateOfRepair state;

    private TypeOfRepair typeOfRepair;

    private double cost;

    private String address;

    private String textDesc;

    private String ownerFirstName;

    private String ownerLastName;



    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
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

    public String getOwnerFirstName() { return ownerFirstName; }

    public void setOwnerFirstName(String ownerFirstName) { this.ownerFirstName = ownerFirstName; }

    public String getOwnerLastName() { return ownerLastName; }

    public void setOwnerLastName(String ownerLastName) { this.ownerLastName = ownerLastName; }



}
