package gr.pf.team2.constructionwebapp.controller.admin.search;

import gr.pf.team2.constructionwebapp.exceptions.ExceptionsHandling;
import gr.pf.team2.constructionwebapp.forms.SearchFormProperty;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import gr.pf.team2.constructionwebapp.validators.SearchPropertyValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdvanceSearchProperty {

    private static final String ERROR_MESSAGE = "errormessage";
    private static final String SEARCHFORM = "propertySearchForm";

    @Autowired
    private PropertyService propertyService;


    @Autowired
    private SearchPropertyValidation searchPropertyValidation;

    @InitBinder(SEARCHFORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(searchPropertyValidation);
    }


    @GetMapping(value = "/property/search")
    public String searchDynamic(Model model) {
        model.addAttribute(SEARCHFORM, new SearchFormProperty());
        return "pages/property_search";
    }



    @PostMapping(value = "/property/search")
    public String searchAll(Model model, @Valid @ModelAttribute(SEARCHFORM) SearchFormProperty searchFormProperty, BindingResult bindingResult) throws ExceptionsHandling {

        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/property_search";
        }

        List<PropertyModel> properties = propertyService.searchAdvanced(searchFormProperty);

        if(properties.isEmpty()){
            return "pages/notfoundpage";
        }

        model.addAttribute(SEARCHFORM,properties);
        return "Admin/AdminPropertyPage";
    }
}
