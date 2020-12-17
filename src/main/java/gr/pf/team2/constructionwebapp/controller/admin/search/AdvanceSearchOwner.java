package gr.pf.team2.constructionwebapp.controller.admin.search;

import gr.pf.team2.constructionwebapp.exceptions.ExceptionsHandling;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.forms.SearchFormOwner;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import gr.pf.team2.constructionwebapp.validators.SearchOwnerValidator;
import gr.pf.team2.constructionwebapp.validators.SearchRepairValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AdvanceSearchOwner {
    private static final String SEARCH = "top10owners";
    private static final String SEARCHFORM = "ownerSearchForm";
    private static final String ERROR_MESSAGE = "errormessage";

    @Autowired
    private OwnerService ownerService;


    @Autowired
    private SearchOwnerValidator searchOwnerValidator;

    @InitBinder(SEARCHFORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(searchOwnerValidator);
    }

    @GetMapping(value = "/owner/search")
    public String searchDynamic(Model model) {
        model.addAttribute(SEARCHFORM, new SearchFormOwner());
        return "pages/owner_search";
    }

    @PostMapping(value = "/owner/search")
    public String searchAll(Model model, @Valid @ModelAttribute(SEARCHFORM) SearchFormOwner ownerSearchForm, BindingResult bindingResult) throws ExceptionsHandling {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/owner_search";
        }

        List<OwnerModel> owners = ownerService.searchAdvanced(ownerSearchForm);

        if(owners.isEmpty()){
            return "pages/notfoundpage";
        }


        model.addAttribute(SEARCHFORM,owners);
        return "pages/AdminOwnerPage";
    }
}
