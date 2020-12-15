package gr.pf.team2.constructionwebapp.controller.admin.search;

import gr.pf.team2.constructionwebapp.exceptions.ExceptionsHandling;
import gr.pf.team2.constructionwebapp.forms.SearchFormOwner;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AdvanceSearchOwner {
    private static final String SEARCH = "top10owners";

    @Autowired
    private OwnerService ownerService;

    @GetMapping(value = "/owner/search")
    public String searchDynamic(Model model) {
        model.addAttribute(SEARCH, new SearchFormOwner());
        return "pages/owner_search";
    }

    @PostMapping(value = "/owner/search")
    public String searchAll(Model model, @Valid @ModelAttribute(SEARCH) SearchFormOwner searchFormOwner){

        List<OwnerModel> owners = null;
        try {
            owners = ownerService.searchAdvanced(searchFormOwner);
        } catch (ExceptionsHandling exceptionsHandling) {
            model.addAttribute("error",exceptionsHandling.getMessage());
            return "pages/AdminOwnerPage";
        }

        if(owners.isEmpty()){
            return "redirect:/AdminOwnerPage";
        }
        model.addAttribute(SEARCH,owners);
        return "pages/AdminOwnerPage";
    }
}
