package gr.pf.team2.constructionwebapp.controller.admin.crud.property;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import gr.pf.team2.constructionwebapp.validators.RegistrationRepairValidation;
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

@Controller
public class PropertyCreate {

    private static final String PROPERTY_CREATE_FORM = "propertyCreateForm";
    private static final String ERROR_MESSAGE = "errorMessage";

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private RegistrationRepairValidation registrationRepairValidation;

    @InitBinder(PROPERTY_CREATE_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(registrationRepairValidation);
    }

    @GetMapping(value = "/property/create")
    public  String propertyDynamic(Model model){
        model.addAttribute(PROPERTY_CREATE_FORM,new CreatePropertyForm());
        return "pages/property_create";
    }

    @PostMapping(value = "/property/create")
    public String createProperty(Model model, @Valid @ModelAttribute(PROPERTY_CREATE_FORM) CreatePropertyForm createPropertyForm, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/repair_create";
        }

        propertyService.createProperty(createPropertyForm);
        return "pages/property_create";
    }

}
