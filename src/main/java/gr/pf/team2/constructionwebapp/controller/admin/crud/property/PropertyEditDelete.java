package gr.pf.team2.constructionwebapp.controller.admin.crud.property;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import gr.pf.team2.constructionwebapp.validators.EditPropertyValidation;
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
public class PropertyEditDelete {

    private static final String EDIT_PROPERTY = "editProperty";
    private static final String PROPERTY_TYPES = "propertyTypes";
    private static final String ERROR_MESSAGE = "errormessage";

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private EditPropertyValidation editPropertyValidation;

    @InitBinder(EDIT_PROPERTY)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(editPropertyValidation);
    }

    @GetMapping(value = "/property/{id}/edit")
    public String editPropertyById(@PathVariable Long id, Model model){
        PropertyModel propertyModel = propertyService.findPropertyById(id);
        model.addAttribute(EDIT_PROPERTY, propertyModel);
        model.addAttribute(PROPERTY_TYPES, TypeOfProperty.values());
        return "pages/property_edit";
    }

    @PostMapping(value = "/property/{id}/delete")
    public String deleteProperty(@PathVariable Long id) {
       propertyService.deleteById(id);
        return "redirect:/admin/property";
    }


    @PostMapping(value = "/property/edit")
    public String editProperty(@Valid @ModelAttribute(EDIT_PROPERTY) PropertyModel propertyModel , BindingResult bindingResult , Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute(PROPERTY_TYPES, TypeOfProperty.values());
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/property_edit";
        }

        Optional<Owner> owner = ownerService.findOwnerByAfmOwner(propertyModel.getAfm());
        if (owner.isPresent()) {
            propertyModel.setOwner(owner.get());
            propertyService.updateProperty(propertyModel);
        }

        return "redirect:/admin/property";
    }
}
