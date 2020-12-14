package gr.pf.team2.constructionwebapp.service;


import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.maps.RepairMapper;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;
import gr.pf.team2.constructionwebapp.repository.OwnerRepository;
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
        repair.setScheduledDate(repairModel.getScheduledDate());
        repair.setTextDesc(repairModel.getTextDesc());
        Repair repair1 = repairRepository.save(repair);
        return repairMapper.repairToModel(repair);
    }

    @Override
    public void deleteById(Long id) { repairRepository.deleteById(id); }

    @Override
    public RepairModel createRepair(RepairForm repairForm) {
        Repair repair = repairMapper.repairFormToRepair(repairForm);
        Repair repair1 = repairRepository.save(repair);
        return repairMapper.repairToModel(repair1);
    }

    @Override
    public List<RepairModelByAfm> searchByAfm(String afm) {
        return repairRepository
                .findByAfm(afm)
                .stream()
                .map(repair -> repairMapper.repairToModelByAfm(repair))
                .collect(Collectors.toList());
    }

}
