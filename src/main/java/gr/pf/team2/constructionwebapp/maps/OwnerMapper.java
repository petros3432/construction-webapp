package gr.pf.team2.constructionwebapp.maps;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import org.springframework.stereotype.Component;

@Component
public class OwnerMapper {

    public OwnerModel ownerToModel(Owner owner){
        OwnerModel ownerModel = new OwnerModel();
        ownerModel.setName(owner.getName());
        ownerModel.setSurname(owner.getSurname());
        ownerModel.setAfm(owner.getAfm());
        ownerModel.setAddress(owner.getAddress());
        ownerModel.setTel(owner.getTel());
        ownerModel.setEmail(owner.getEmail());
        ownerModel.setTypeOfProperty(owner.getTypeOfProperty());
        ownerModel.setUserType(owner.getUserType());
        return ownerModel;
    }

//    public Repair repairFormToRepair(RepairForm repairForm){
//        Repair repair = new Repair();
//        repair.setScheduledDate(repairForm.getScheduledDate());
//        repair.setTextDesc(repairForm.getTextDesc());
//        repair.setTypeOfRepair(repairForm.getTypeOfRepair());
//        repair.setState(repairForm.getState());
//
//        repair.setCost(repairForm.getCost());
//        repair.setAddress(repairForm.getAddress());
//
//        return repair;
//    }
//
//    public RepairModelByAfm repairToModelByAfm(Repair repair){
//        RepairModelByAfm repairModelByAfm = new RepairModelByAfm();
//
//        repairModelByAfm.setScheduledDate(repair.getScheduledDate());
//        repairModelByAfm.setState(repair.getState());
//        repairModelByAfm.setTypeOfRepair(repair.getTypeOfRepair());
//        repairModelByAfm.setCost(repair.getCost());
//        repairModelByAfm.setTextDesc(repair.getTextDesc());
//        repairModelByAfm.setAddress(repair.getAddress());
//        repairModelByAfm.setOwner(repair.getOwner());
//
//        return repairModelByAfm;
//
//    }

}
