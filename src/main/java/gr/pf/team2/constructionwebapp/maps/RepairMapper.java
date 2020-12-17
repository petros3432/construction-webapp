package gr.pf.team2.constructionwebapp.maps;

import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class RepairMapper {

    public RepairModel repairToModel(Repair repair){
        RepairModel repairModel = new RepairModel();

        repairModel.setScheduledDate(parseStringFromLocalDate(repair.getScheduledDate()));
        repairModel.setState(repair.getState());
        repairModel.setTypeOfRepair(repair.getTypeOfRepair());
        repairModel.setAddress(repair.getAddress());
        repairModel.setCost(repair.getCost());
        repairModel.setId(repair.getId());
        repairModel.setTextDesc(repair.getTextDesc());


        return repairModel;
    }

    public Repair repairFormToRepair(RepairForm repairForm){
        Repair repair = new Repair();

        repair.setScheduledDate(parseLocalDateFromString(repairForm.getScheduledDate()));
        repair.setTextDesc(repairForm.getTextDesc());
        repair.setTypeOfRepair(repairForm.getTypeOfRepair());
        repair.setState(repairForm.getState());
        repair.setCost(repairForm.getCost());
        repair.setAddress(repairForm.getAddress());
        repair.setProperty(repairForm.getProperty());
        return repair;
    }


    public LocalDate parseLocalDateFromString(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //ex: '1939-01-01'
        return LocalDate.parse(date, formatter);
    }

    public String parseStringFromLocalDate(LocalDate date) {
        return date.toString();

    }

}
