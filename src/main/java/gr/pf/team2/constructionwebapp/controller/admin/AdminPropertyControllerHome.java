package gr.pf.team2.constructionwebapp.controller.admin;

import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminPropertyControllerHome {


    private static final String PROPERTIES = "properties";
    private static final String PROPERTY_FORM = "registerRepairForm";

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/admin/property")
    public String RepairsShowoff(Model model) {
        List<PropertyModel> properties = propertyService.firstTenProperties();
        model.addAttribute(PROPERTIES, properties);
        model.addAttribute(PROPERTY_FORM, new CreatePropertyForm());
        return "Admin/AdminPropertyPage";
    }
}