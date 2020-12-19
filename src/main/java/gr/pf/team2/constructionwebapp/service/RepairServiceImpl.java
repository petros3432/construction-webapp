package gr.pf.team2.constructionwebapp.service;


import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.maps.RepairMapper;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private RepairMapper repairMapper;


    @Override
    public List<RepairModel> firstTenRepairs() {
        return repairRepository
                .firstTenRepairs()
                .stream()
                .map(repair -> repairMapper.repairToModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public RepairModel findRepairById(Long id) {
        return repairMapper.repairToModel(repairRepository.findById(id).orElseThrow());
    }

    @Override
    public RepairModel updateRepair(RepairModel repairModel) {
        Repair repair = repairRepository.findById(repairModel.getId()).get();
        repair.setAddress(repairModel.getAddress());
        repair.setCost(repairModel.getCost());
        repair.setState(repairModel.getState());
        repair.setTypeOfRepair(repairModel.getTypeOfRepair());
        repair.setScheduledDate(repairMapper.parseLocalDateFromString(repairModel.getScheduledDate()));
        repair.setTextDesc(repairModel.getTextDesc());
        repair.setProperty(repairModel.getProperty());
        Repair repair1 = repairRepository.save(repair);
        return repairMapper.repairToModel(repair);
    }

    @Override
    public void deleteById(Long id) { repairRepository.deleteById(id); }

    @Override
    public void updateAddressFromProperty(Long id, String address) {
            repairRepository.updateRepair(id,address);
    }

    @Override
    public RepairModel createRepair(RepairForm repairForm) {
        Repair repair = repairMapper.repairFormToRepair(repairForm);
        Repair repair1 = repairRepository.save(repair);
        return repairMapper.repairToModel(repair1);
    }


    @Override
    public List<RepairModel> searchAdvanced(SearchForm searchForm) {

        if (!searchForm.getAfm().equals("") && searchForm.getScheduledDateStart().equals("") && searchForm.getScheduledDateEnd().equals(""))
        {
            return repairRepository.advSearchAfm(searchForm.getAfm())
                    .stream()
                    .map(repair -> repairMapper.repairToModel(repair))
                    .collect(Collectors.toList());
        }

        if (!searchForm.getAfm().equals("") && !searchForm.getScheduledDateStart().equals("") && searchForm.getScheduledDateEnd().equals(""))
        {
            return repairRepository.advSearchAfmDate(searchForm.getAfm(),
                    repairMapper.parseLocalDateFromString(searchForm.getScheduledDateStart()))
                    .stream()
                    .map(repair -> repairMapper.repairToModel(repair))
                    .collect(Collectors.toList());
        }

        if (!searchForm.getAfm().equals("") && !searchForm.getScheduledDateStart().equals("") && !searchForm.getScheduledDateEnd().equals(""))
        {
            return repairRepository.advSearchAfmDateBandwidth(searchForm.getAfm(),
                    repairMapper.parseLocalDateFromString(searchForm.getScheduledDateStart()),
                    repairMapper.parseLocalDateFromString(searchForm.getScheduledDateEnd()))
                    .stream()
                    .map(repair -> repairMapper.repairToModel(repair))
                    .collect(Collectors.toList());
        }

        if (searchForm.getAfm().equals("") && !searchForm.getScheduledDateStart().equals("") && searchForm.getScheduledDateEnd().equals(""))
        {
            return repairRepository.advSearchDate(repairMapper.parseLocalDateFromString(searchForm.getScheduledDateStart()))
                    .stream()
                    .map(repair -> repairMapper.repairToModel(repair))
                    .collect(Collectors.toList());
        }

        if (searchForm.getAfm().equals("") && !searchForm.getScheduledDateStart().equals("") && !searchForm.getScheduledDateEnd().equals(""))
        {
            return repairRepository.advSearchDateBandwidth(
                    repairMapper.parseLocalDateFromString(searchForm.getScheduledDateStart()),
                    repairMapper.parseLocalDateFromString(searchForm.getScheduledDateEnd()))
                    .stream()
                    .map(repair -> repairMapper.repairToModel(repair))
                    .collect(Collectors.toList());
        }

        return null;
    }


}
