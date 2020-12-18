package gr.pf.team2.constructionwebapp.controller.admin.crud.property;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class PropertyEditDelete {

    private static final String EDIT_PROPERTY = "editProperty";
    private static final String ERROR_MESSAGE = "errormessage";

    @Autowired
    private PropertyService propertyService;

    @GetMapping(value = "/property/{id}/edit")
    public String editPropertyById(@PathVariable Long id, Model model){
        PropertyModel propertyModel = propertyService.findPropertyById(id);
        model.addAttribute(EDIT_PROPERTY, propertyModel);
        return "pages/property_edit";
    }

    @PostMapping(value = "/property/{id}/delete")
    public String deleteProperty(@PathVariable Long id) {
       propertyService.deleteById(id);
        return "redirect:/property";
    }


    @PostMapping(value = "/property/edit")
    public String editProperty(@Valid @ModelAttribute(EDIT_PROPERTY) PropertyModel propertyModel , BindingResult bindingResult , Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/property_edit";
        }
        Optional<Property> property = propertyService.findPropertyByAddress(propertyModel.getAddress());


        return "redirect:/AdminHomePage";
    }
}
