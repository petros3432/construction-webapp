package gr.pf.team2.constructionwebapp.controller.admin.crud.owner;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.maps.OwnerMapper;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class OwnerEditDelete {

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
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/owner_edit";
        }

        ownerService.updateOwner(ownerModel);
        return "redirect:/AdminOwnerPage";
    }

}
