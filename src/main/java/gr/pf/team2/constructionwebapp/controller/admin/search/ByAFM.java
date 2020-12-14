package gr.pf.team2.constructionwebapp.controller.admin.search;

import gr.pf.team2.constructionwebapp.models.RepairModelByAfm;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ByAFM {

    private static final String SEARCH_AFM = "searchAFM";

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repair/search")
    public String searchByAfm() {
        return "pages/searchmodalbyafm";
    }

    @PostMapping(value = "/repair/search")
    public String searchByAfm(Model model,@RequestParam String afm){
        List<RepairModelByAfm> repairs = repairService.searchByAfm(afm);
        model.addAttribute(SEARCH_AFM,repairs);
        return "pages/searchpage";
    }
}
