package gr.pf.team2.constructionwebapp.controller.admin.crud;

import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class AdminEdit {
    private static final String EDIT_SERVICE = "editService";
    private static final String REPAIR_STATE = "repairStates";
    private static final String REPAIR_TYPE = "repairTypes";

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repair/{id}/edit")
    public String editGetById(@PathVariable Long id, Model model) {
        RepairModel repairModel = repairService.findRepairById(id);
        model.addAttribute(EDIT_SERVICE,repairModel);
        model.addAttribute(REPAIR_STATE, StateOfRepair.values());
        model.addAttribute(REPAIR_TYPE, TypeOfRepair.values());
        return "pages/editmodal";
    }

    @PostMapping(value = "/repair/edit")
    public String editBook(RepairModel repairModel) {

        return "redirect:/pages/AdminHomePage";
    }

}
