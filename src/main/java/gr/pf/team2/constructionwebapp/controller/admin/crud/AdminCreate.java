package gr.pf.team2.constructionwebapp.controller.admin.crud;

import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import static gr.pf.team2.constructionwebapp.utils.GlobalVariables.ERROR_MESSAGE;

public class AdminCreate {

    private static final String REPAIR_FORM = "repairForm";

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repair/create")
    public String repairDynamic(Model model) {
        model.addAttribute(REPAIR_FORM, new RepairForm());
        return "partials/createmodal";
    }

    @PostMapping(value = "/repair/create")
    public String createRepair(Model model, @Valid @ModelAttribute(REPAIR_FORM) RepairForm repairForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "partials/createmodal";
        }
        repairService.createRepair(repairForm);
        return "redirect:/pages/AdminHomePage";
    }
}
