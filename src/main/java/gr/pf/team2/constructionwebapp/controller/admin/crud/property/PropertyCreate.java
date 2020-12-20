package gr.pf.team2.constructionwebapp.controller.admin.crud.property;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import gr.pf.team2.constructionwebapp.validators.RegistrationPropertyValidation;
import gr.pf.team2.constructionwebapp.validators.RegistrationRepairValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("admin")
public class PropertyCreate {

    private static final String PROPERTY_CREATE_FORM = "createPropertyForm";
    private static final String PROPERTY_TYPES = "propertyTypes";
    private static final String ERROR_MESSAGE = "errorMessage";


    @Autowired
    private PropertyService propertyService;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RegistrationPropertyValidation registrationPropertyValidation;

    @InitBinder(PROPERTY_CREATE_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(registrationPropertyValidation);
    }

    @GetMapping(value = "/property/create")
    public String propertyDynamic(Model model) {
        model.addAttribute(PROPERTY_CREATE_FORM, new CreatePropertyForm());
        model.addAttribute(PROPERTY_TYPES, TypeOfProperty.values());
        return "pages/property_create";
    }

    @PostMapping(value = "/property/create")
    public String createProperty(Model model, @Valid @ModelAttribute(PROPERTY_CREATE_FORM)CreatePropertyForm createPropertyForm, BindingResult bindingResult) {
//
        if (bindingResult.hasErrors()) {
        model.addAttribute(PROPERTY_TYPES, TypeOfProperty.values());
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/property_create";
        }
        Optional<Owner> owner = ownerService.findOwnerByAfmOwner(createPropertyForm.getAfm());
        if(owner.isPresent()){
            createPropertyForm.setOwner(owner.get());
            propertyService.createProperty(createPropertyForm);
            return "redirect:/admin/property";
        }
        return "pages/property_create";
    }
}
