package gr.pf.team2.constructionwebapp.controller.admin.crud.repair;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import gr.pf.team2.constructionwebapp.models.RepairModel;
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

@Controller
public class RepairEditDelete {
    private static final String EDIT_SERVICE = "rep";
    private static final String REPAIR_STATE = "repairStates";
    private static final String REPAIR_TYPE = "repairTypes";
    private static final String ERROR_MESSAGE = "errormessage";


    @Autowired
    private RepairService repairService;


    @GetMapping(value = "/repair/{id}/edit")
    public String editGetById(@PathVariable Long id, Model model) {
        RepairModel repairModel = repairService.findRepairById(id);
        model.addAttribute(EDIT_SERVICE,repairModel);
        model.addAttribute(REPAIR_STATE, StateOfRepair.values());
        model.addAttribute(REPAIR_TYPE, TypeOfRepair.values());
        return "pages/repair_edit";
    }

    @PostMapping(value = "/repair/{id}/delete")
    public String deleteRepair(@PathVariable Long id) {
        repairService.deleteById(id);
        return "redirect:/repair";
    }

    @PostMapping(value = "/repair/edit")
    public String editBook(@Valid @ModelAttribute(EDIT_SERVICE) RepairModel repairModel , BindingResult bindingResult , Model model) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model

            model.addAttribute(REPAIR_STATE, StateOfRepair.values());
            model.addAttribute(REPAIR_TYPE, TypeOfRepair.values());
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/repair_edit";
        }
        repairService.updateRepair(repairModel);
        return "redirect:/AdminHomePage";
    }

}
