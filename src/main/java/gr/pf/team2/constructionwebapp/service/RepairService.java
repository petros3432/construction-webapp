package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;
import gr.pf.team2.constructionwebapp.models.RepairModelDetails;

import java.util.List;

public interface RepairService {

    List<RepairModel> firstTenRepairs();

    RepairModelDetails seById(Long id);

    void updateRepair(RepairModelDetails repairModelDetails);

    void deleteById(Long id);

    void createRepair(RepairForm repairForm);

    List<RepairModelByAfm> searchByAfm(String afm);

}
