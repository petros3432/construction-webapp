package gr.pf.team2.constructionwebapp.models;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class RepairModel {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate scheduledDate;

    private StateOfRepair state;

    private TypeOfRepair typeOfRepair;

    private double cost;

    private String address;

    private String textDesc;

    private Long id;

    private String ownerFirstName;

    private String ownerLastName;

    private String ownerAFM;

    private Long ownerID;


    public String getOwnerFirstName() { return ownerFirstName; }

    public void setOwnerFirstName(String ownerFirstName) { this.ownerFirstName = ownerFirstName; }

    public String getOwnerLastName() { return ownerLastName; }

    public void setOwnerLastName(String ownerLastName) { this.ownerLastName = ownerLastName; }

    public Long getOwnerID() { return ownerID; }

    public void setOwnerID(Long ownerID) { this.ownerID = ownerID; }

    public String getOwnerAFM() {
        return ownerAFM;
    }

    public void setOwnerAFM(String ownerAFM) {
        this.ownerAFM = ownerAFM;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public StateOfRepair getState() {
        return state;
    }

    public TypeOfRepair getTypeOfRepair() {
        return typeOfRepair;
    }

    public double getCost() {
        return cost;
    }

    public String getAddress() {
        return address;
    }

    public String getTextDesc() {
        return textDesc;
    }

    public Long getId() {
        return id;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public void setState(StateOfRepair state) {
        this.state = state;
    }

    public void setTypeOfRepair(TypeOfRepair typeOfRepair) {
        this.typeOfRepair = typeOfRepair;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
