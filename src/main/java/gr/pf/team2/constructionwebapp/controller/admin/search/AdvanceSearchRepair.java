package gr.pf.team2.constructionwebapp.controller.admin.search;

import gr.pf.team2.constructionwebapp.exceptions.ExceptionsHandling;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AdvanceSearchRepair {

    private static final String SEARCH = "top10rep";

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repair/search")
    public String searchDynamic(Model model) {
        model.addAttribute(SEARCH, new SearchForm());
        return "pages/repair_search";
    }

    @PostMapping(value = "/repair/search")
    public String searchAll(Model model, @Valid @ModelAttribute(SEARCH) SearchForm searchForm){


        List<RepairModel> repairs = null;
        try {
            repairs = repairService.searchAdvanced(searchForm);
        } catch (ExceptionsHandling exceptionsHandling) {
            model.addAttribute("error",exceptionsHandling.getMessage());
            return "pages/AdminHomePage";
        }

        if(repairs.isEmpty()){
            return "redirect:/AdminHomePage";
        }
        model.addAttribute(SEARCH,repairs);
        return "pages/AdminHomePage";
    }
}
