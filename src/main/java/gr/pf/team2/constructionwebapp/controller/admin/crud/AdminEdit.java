package gr.pf.team2.constructionwebapp.controller.admin.crud;

import gr.pf.team2.constructionwebapp.models.RepairModelDetails;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class AdminEdit {
    private static final String EDIT_SERVICE = "editService";

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repair/{id}/edit")
    public String editGetById(@PathVariable Long id, Model model) {
        RepairModelDetails repairModelDetails = repairService.seById(id);
        model.addAttribute(EDIT_SERVICE,repairModelDetails);
        return "pages/editmodal";
    }

    @PostMapping(value = "/repair/edit")
    public String editBook(RepairModelDetails repairModelDetails) {
        repairService.updateRepair(repairModelDetails);
        return "redirect:/pages/AdminHomePage";
    }

}
