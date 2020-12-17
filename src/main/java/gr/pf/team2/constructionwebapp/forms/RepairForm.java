package gr.pf.team2.constructionwebapp.forms;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class RepairForm {
//    private static final int COST_MIN_VALUE = 0;
//    private static final int COST_MAX_VALUE = 1000000000;
    private static final String AFM_PATTERN = "^[0-9]*$";
    private static final int AFM_SIZE=9;
//  private static final String COST_PATTERN = "^[?!0\.00][1-9]\d{0,2}[,\d{3}]*[\.\d\d]?$"
    private static final String COST_PATTERN = "(?!0\\.00)[1-9]\\d{0,9}(\\.(\\d|\\d\\d))?";



    @NotEmpty(message = "{repairCreate.scheduledDate.not.null}")
    private String scheduledDate;


    private StateOfRepair state;

    private TypeOfRepair typeOfRepair;

//    @Positive(message = "{repairCreate.cost.not.negative}")
//    @NotNull(message = "{repairCreate.cost.not.null")
//    @Max(value=COST_MAX_VALUE,message = "{cost cannot be over 1000000000 }")
//    @Min(value=COST_MIN_VALUE,message = "{cost must be more than zero}")
    @Pattern(regexp = COST_PATTERN, message = "{repairCreate.cost.pattern.invalid}")
    private String cost;
    @NotEmpty(message="{repairCreate.address.not.null}")
    private String address;


    private String textDesc;

    private String ownerFirstName;

    private String ownerLastName;
    @Pattern(regexp = AFM_PATTERN,message = "{repairCreate.afmOwner.pattern.invalid}")
    @NotEmpty(message = "{repairCreate.afmOwner.not.null}")
    @Size( min = AFM_SIZE, max= AFM_SIZE, message = "{repairCreate.afmOwner.size.invalid}")
    private String afmOwner;

    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    public String getAfmOwner() {
        return afmOwner;
    }

    public void setAfmOwner(String afmOwner) {
        this.afmOwner = afmOwner;
    }

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

    public String getOwnerFirstName() { return ownerFirstName; }

    public void setOwnerFirstName(String ownerFirstName) { this.ownerFirstName = ownerFirstName; }

    public String getOwnerLastName() { return ownerLastName; }

    public void setOwnerLastName(String ownerLastName) { this.ownerLastName = ownerLastName; }



}
