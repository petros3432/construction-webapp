package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.exceptions.ExceptionsHandling;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;

import java.util.List;

public interface RepairService {

    RepairModel createRepair(RepairForm repairForm);

    List<RepairModel> firstTenRepairs();

    RepairModel findRepairById(Long id);

    RepairModel updateRepair(RepairModel repairModel);

    void deleteById(Long id);

    List<RepairModel> findRepairByProperty(List<Property> propertys);

    void updateAddressFromProperty(Long id, String address);

    List<RepairModel> searchAdvanced(SearchForm searchForm) throws ExceptionsHandling;

}
