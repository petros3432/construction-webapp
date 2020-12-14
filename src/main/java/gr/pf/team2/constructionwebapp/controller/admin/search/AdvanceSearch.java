package gr.pf.team2.constructionwebapp.controller.admin.search;

import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public class AdvanceSearch {

    private static final String SEARCH = "search";

    @Autowired
    private RepairService repairService;

    private OwnerService ownerService;

    @GetMapping(value = "/repair/search")
    public String searchDynamic(Model model) {
        model.addAttribute(SEARCH, new SearchForm());
        return "pages/search";
    }

    @PostMapping(value = "/repair/search")
    public String searchAll(Model model, @Valid @ModelAttribute(SEARCH) SearchForm searchForm){

        List<RepairModel> repairs = repairService.searchAdvanced(searchForm);

        if(repairs.isEmpty()){
            return "redirect:/AdminHomePage";
        }
        model.addAttribute(SEARCH,repairs);
        return "pages/searchpage";
    }
}
