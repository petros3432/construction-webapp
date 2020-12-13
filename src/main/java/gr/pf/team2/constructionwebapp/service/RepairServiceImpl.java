package gr.pf.team2.constructionwebapp.service;


import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.maps.RepairMapper;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;
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
//
//    @Override
//    public RepairModelDetails seById(Long id) {
//        return repairMapper.repairToModelDetails(repairRepository.findById(id).orElseThrow());
//    }
//
//    @Override
//    public void updateRepair(RepairModelDetails repairModelDetails) {
//        repairRepository.save(repairMapper.repairSetToRepair(repairRepository.findById(repairModelDetails.getId()).get(),repairModelDetails));
//    }

    @Override
    public void deleteById(Long id) { repairRepository.deleteById(id); }

    @Override
    public void createRepair(RepairForm repairForm) {
        repairRepository.save(repairMapper.repairFormToRepair(repairForm));
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
