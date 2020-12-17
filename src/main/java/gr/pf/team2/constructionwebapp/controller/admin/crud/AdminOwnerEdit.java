package gr.pf.team2.constructionwebapp.controller.admin.crud;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import gr.pf.team2.constructionwebapp.maps.OwnerMapper;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
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
public class AdminOwnerEdit {

    private static final String EDIT_SERVICE = "owner";
    private static final String PROPERTY_TYPE = "PropertyTypes";
    private static final String ERROR_MESSAGE = "errormessage";


    @Autowired
    private OwnerService ownerService;

    @Autowired
    private OwnerMapper ownerMapper;

    @GetMapping(value = "/owner/{id}/edit")
    public String editGetByAfm(@PathVariable Long id, Model model) {

        OwnerModel ownerModel = ownerService.findOwnerById(id);
        model.addAttribute(EDIT_SERVICE, ownerModel);
        model.addAttribute(PROPERTY_TYPE, TypeOfProperty.values());
        return "pages/owner_edit";
    }

    @PostMapping(value = "/owner/{id}/delete")
    public String deleteOwner(@PathVariable Long id) {
        ownerService.deleteById(id);
        return "redirect:/owner";
    }

    @PostMapping(value = "/owner/edit")
    public String editBook( @Valid @ModelAttribute(EDIT_SERVICE) OwnerModel ownerModel, BindingResult bindingResult , Model model) {


        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model

            model.addAttribute(PROPERTY_TYPE, TypeOfProperty.values());
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/owner_edit";
        }

        ownerService.updateOwner(ownerModel);
        return "redirect:/AdminOwnerPage";
    }

}
