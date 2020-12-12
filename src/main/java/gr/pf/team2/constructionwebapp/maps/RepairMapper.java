package gr.pf.team2.constructionwebapp.maps;

import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;
import gr.pf.team2.constructionwebapp.models.RepairModelDetails;
import org.springframework.stereotype.Component;

@Component
public class RepairMapper {

    public RepairModel repairToModel(Repair repair){
        RepairModel repairModel = new RepairModel();

        repairModel.setScheduledDate(repair.getScheduledDate());
        repairModel.setState(repair.getState());
        repairModel.setTypeOfRepair(repair.getTypeOfRepair());

        return repairModel;
    }

    public RepairModelDetails repairToModelDetails(Repair repair){
        RepairModelDetails repairModelDetails = new RepairModelDetails();

        repairModelDetails.setScheduledDate(repair.getScheduledDate());
        repairModelDetails.setState(repair.getState());
        repairModelDetails.setTypeOfRepair(repair.getTypeOfRepair());
        repairModelDetails.setCost(repair.getCost());
        repairModelDetails.setTextDesc(repair.getTextDesc());
        repairModelDetails.setAddress(repair.getAddress());
        repairModelDetails.setId(repair.getId());

        return repairModelDetails;
    }

    public Repair repairSetToRepair(Repair repair, RepairModelDetails repairModelDetails){
        repair.setAddress(repairModelDetails.getAddress());
        repair.setCost(repairModelDetails.getCost());
        repair.setScheduledDate(repairModelDetails.getScheduledDate());
        repair.setState(repairModelDetails.getState());
        repair.setTypeOfRepair(repairModelDetails.getTypeOfRepair());
        repair.setTextDesc(repairModelDetails.getTextDesc());

        return repair;
    }

    public Repair repairFormToRepair(RepairForm repairForm){
        Repair repair = new Repair();

        repair.setTextDesc(repairForm.getTextDesc());
        repair.setTypeOfRepair(repairForm.getTypeOfRepair());
        repair.setState(repairForm.getState());
        repair.setScheduledDate(repairForm.getScheduledDate());
        repair.setCost(repairForm.getCost());
        repair.setAddress(repairForm.getAddress());

        return repair;
    }

    public RepairModelByAfm repairToModelByAfm(Repair repair){
        RepairModelByAfm repairModelByAfm = new RepairModelByAfm();

        repairModelByAfm.setScheduledDate(repair.getScheduledDate());
        repairModelByAfm.setState(repair.getState());
        repairModelByAfm.setTypeOfRepair(repair.getTypeOfRepair());
        repairModelByAfm.setCost(repair.getCost());
        repairModelByAfm.setTextDesc(repair.getTextDesc());
        repairModelByAfm.setAddress(repair.getAddress());
        repairModelByAfm.setOwner(repair.getOwner());

        return repairModelByAfm;

    }

}
