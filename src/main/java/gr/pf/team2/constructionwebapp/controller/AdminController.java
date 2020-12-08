package gr.pf.team2.constructionwebapp.controller;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    @GetMapping({"/","/admin"})
    public String AdminHomePage(Model model) {

        List<Repair> repairs = repairService.findAll();

        return "AdminHomePage";
    }

}
