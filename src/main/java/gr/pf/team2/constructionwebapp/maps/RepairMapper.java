package gr.pf.team2.constructionwebapp.maps;

import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.models.RepairModel;

public class RepairMapper {

    public RepairModel repairToModel(Repair repair){
        RepairModel repairModel = new RepairModel();

        repairModel.setAddress(repair.getAddress());
        repairModel.setScheduledDate(repair.getScheduledDate());
        repairModel.setCost(repair.getCost());
        repairModel.setState(repair.getState());
        repairModel.setTextDesc(repair.getTextDesc());
        repairModel.setTypeOfRepair(repair.getTypeOfRepair());

        return repairModel;
    }
}
