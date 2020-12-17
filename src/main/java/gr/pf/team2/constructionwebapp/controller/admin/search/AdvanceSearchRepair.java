package gr.pf.team2.constructionwebapp.controller.admin.search;

import gr.pf.team2.constructionwebapp.exceptions.ExceptionsHandling;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
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
import java.util.Optional;

@Controller
public class AdvanceSearchRepair {

    private static final String ERROR_MESSAGE = "errormessage";
    private static final String SEARCHFORM = "repairSearchForm";

    @Autowired
    private RepairService repairService;


    @Autowired
    private SearchRepairValidation searchRepairValidation;

    @InitBinder(SEARCHFORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(searchRepairValidation);
    }


    @GetMapping(value = "/repair/search")
    public String searchDynamic(Model model) {
        model.addAttribute(SEARCHFORM, new SearchForm());
        return "pages/repair_search";
    }



    @PostMapping(value = "/repair/search")
    public String searchAll(Model model, @Valid  @ModelAttribute(SEARCHFORM) SearchForm repairSearchForm, BindingResult bindingResult) throws ExceptionsHandling {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/repair_search";
        }

        List<RepairModel> repairs = repairService.searchAdvanced(repairSearchForm);

        if(repairs.isEmpty()){
            return "pages/notfoundpage";
        }


        model.addAttribute(SEARCHFORM,repairs);
        return "pages/AdminHomePage";
    }
}
