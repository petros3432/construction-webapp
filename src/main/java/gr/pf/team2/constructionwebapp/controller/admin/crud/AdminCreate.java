package gr.pf.team2.constructionwebapp.controller.admin.crud;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

import static gr.pf.team2.constructionwebapp.utils.GlobalVariables.ERROR_MESSAGE;
@Controller
public class AdminCreate {

    private static final String REPAIR_FORM = "repairForm";
    private static final String REPAIR_STATE = "repairStates";
    private static final String REPAIR_TYPE = "repairTypes";
    private static final String OWNER_NAMES = "onomataOwner";

    @Autowired
    private RepairService repairService;

    @Autowired
    private OwnerService ownerService;

    @GetMapping(value = "/repairs/create")
    public String repairDynamic(Model model) {
        model.addAttribute(REPAIR_FORM, new RepairForm());
        model.addAttribute(REPAIR_STATE, StateOfRepair.values());
        model.addAttribute(REPAIR_TYPE, TypeOfRepair.values());
        return "pages/repairs_create";
    }

    @PostMapping(value = "/repairs/create")
    public String createRepair(Model model, @Valid @ModelAttribute(REPAIR_FORM) RepairForm repairForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/repairs_create";
        }
        Optional<Owner> owner = ownerService.findOwnerByAfm(repairForm.getAfmOwner());
        if(owner.isPresent()){
            repairForm.setOwner(owner.get());
            repairService.createRepair(repairForm);
            return "redirect:pages/AdminHomePage";
        }
        return "redirect:pages/AdminHomePage";
    }
}
