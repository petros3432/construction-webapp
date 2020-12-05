package gr.pf.team2.constructionwebapp.controller;

import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private RepairService repairService;

    @GetMapping({"/","hello"})
    public String adminHomePageRepairs(Model model){
        List<Repair> repairs = repairService.returnFirstTenRepairs();
        model.addAttribute("TenRepairs",repairs.get(1));
        return "hello";
    }
}
