package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;

import java.util.List;

public interface RepairService {

    RepairModel createRepair(RepairForm repairForm);
    List<RepairModel> firstTenRepairs();

//    RepairModelDetails seById(Long id);

//    void updateRepair(RepairModelDetails repairModelDetails);

    void deleteById(Long id);


    List<RepairModelByAfm> searchByAfm(String afm);

}
