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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AdminOwnerEdit {

    private static final String EDIT_SERVICE = "owner";
    private static final String PROPERTY_TYPE = "PropertyTypes";

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private OwnerMapper ownerMapper;

    @GetMapping(value = "/owner/{id}/edit")
    public String editGetByAfm(@PathVariable Long id, Model model) {
//        Optional<Owner> owner = ownerService.findOwnerById(id);
//        OwnerModel ownerModel = ownerMapper.ownerToModel(owner.get());
        OwnerModel ownerModel = ownerService.findOwnerById(id);
        model.addAttribute(EDIT_SERVICE, ownerModel);
        model.addAttribute(PROPERTY_TYPE, TypeOfProperty.values());
        return "pages/owner_edit";
    }

    @PostMapping(value = "/owner/edit")
    public String editBook(OwnerModel ownerModel) {
        ownerService.updateOwner(ownerModel);
        return "redirect:/AdminOwnerPage";
    }

}
