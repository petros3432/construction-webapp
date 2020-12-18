package gr.pf.team2.constructionwebapp.controller.admin.crud;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import gr.pf.team2.constructionwebapp.validators.RegistrationRepairValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

import static gr.pf.team2.constructionwebapp.utils.GlobalVariables.ERROR_MESSAGE;
@Controller
@RequestMapping("admin")
public class AdminCreateRepair {

    private static final String REPAIR_STATE = "repairStates";
    private static final String REPAIR_TYPE = "repairTypes";
    private static final String REPAIR_CREATE_FORM = "repairCreateForm";
    private static final String ERROR_MESSAGE = "errorMessage";

    @Autowired
    private RepairService repairService;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RegistrationRepairValidation registrationRepairValidation;

    @InitBinder(REPAIR_CREATE_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(registrationRepairValidation);
    }

    @GetMapping(value = "/repair/create")
    public String repairDynamic(Model model) {
        model.addAttribute(REPAIR_CREATE_FORM, new RepairForm());
        model.addAttribute(REPAIR_STATE, StateOfRepair.values());
        model.addAttribute(REPAIR_TYPE, TypeOfRepair.values());
        return "pages/repair_create";
    }

    @PostMapping(value = "/repair/create")
    public String createRepair(Model model, @Valid @ModelAttribute(REPAIR_CREATE_FORM) RepairForm repairCreateForm, BindingResult bindingResult) {
//
        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            model.addAttribute(REPAIR_STATE, StateOfRepair.values());
            model.addAttribute(REPAIR_TYPE, TypeOfRepair.values());
            return "pages/repair_create";
        }
        Optional<Owner> owner = ownerService.findOwnerByAfmOwner(repairCreateForm.getAfmOwner());
        if(owner.isPresent()){
            repairCreateForm.setOwner(owner.get());
            repairService.createRepair(repairCreateForm);
            return "redirect:/admin/home";
        }
        return "pages/repair_create";
    }
}
