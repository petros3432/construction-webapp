package gr.pf.team2.constructionwebapp.models;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;

import java.time.LocalDate;

public class RepairModelDetails {

    private LocalDate scheduledDate;

    private StateOfRepair state;

    private TypeOfRepair typeOfRepair;

    private double cost;

    private String address;

    private String textDesc;

    private Long id;


    public LocalDate getScheduledDate() {
        return this.scheduledDate;
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

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

}
