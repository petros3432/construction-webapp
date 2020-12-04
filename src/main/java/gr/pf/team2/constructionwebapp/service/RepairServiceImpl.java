package gr.pf.team2.constructionwebapp.service;


import gr.pf.team2.constructionwebapp.repository.RepairRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairRepositiry repairRepository;

}
