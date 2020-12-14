package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;

import java.util.List;
import java.util.Optional;

public interface RepairService {

    RepairModel createRepair(RepairForm repairForm);

    List<RepairModel> firstTenRepairs();

    RepairModel findRepairById(Long id);

    RepairModel updateRepair(RepairModel repairModel);

    void deleteById(Long id);

    List<RepairModelByAfm> searchByAfm(String afm);

    List<RepairModel> searchAdvanced(SearchForm searchForm);

}
