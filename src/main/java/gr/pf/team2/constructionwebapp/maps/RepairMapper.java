package gr.pf.team2.constructionwebapp.maps;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepairMapper {
    @Autowired
    private OwnerService ownerService;
    private Owner formOwner;

    public RepairModel repairToModel(Repair repair){
        RepairModel repairModel = new RepairModel();

        repairModel.setScheduledDate(repair.getScheduledDate());
        repairModel.setState(repair.getState());
        repairModel.setTypeOfRepair(repair.getTypeOfRepair());
        repairModel.setAddress(repair.getAddress());
        repairModel.setCost(repair.getCost());
        repairModel.setId(repair.getId());
        repairModel.setTextDesc(repair.getTextDesc());
        repairModel.setOwnersName(repair.getOwner().getName() + " " + repair.getOwner().getSurname());
        repairModel.setOwnersAFM(repair.getOwner().getAfm());

        return repairModel;
    }

    public Repair repairFormToRepair(RepairForm repairForm){
        Repair repair = new Repair();
        repair.setScheduledDate(repairForm.getScheduledDate());
        repair.setTextDesc(repairForm.getTextDesc());
        repair.setTypeOfRepair(repairForm.getTypeOfRepair());
        repair.setState(repairForm.getState());

        repair.setCost(repairForm.getCost());
        repair.setAddress(repairForm.getAddress());
        if(ownerService.findOwnerByAfm(repairForm.getOwnersAfm()).isPresent()){
            formOwner = ownerService.findOwnerByAfm(repairForm.getOwnersAfm()).get();
        }
        repair.setOwner(formOwner);

        //repair.setOwner(ownerService.findOwnerByAfm(repairForm.getOwnersAfm()));

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
