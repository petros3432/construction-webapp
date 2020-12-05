package gr.pf.team2.constructionwebapp.controller;

import gr.pf.team2.constructionwebapp.domain.Repair;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private RepairService repairService;

    public String adminHomePageRepairs(){
        List<Repair> repairs = repairService.returnFirstTen();
        System.out.println(repairs);
        return null;
    }
}
