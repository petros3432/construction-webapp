package gr.pf.team2.constructionwebapp.controller.admin.crud;

import gr.pf.team2.constructionwebapp.models.RepairModelDetails;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class AdminDetails {
    private static final String DETAILS = "details";

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repair/{id}/details")
    public String getDetailsById(Model model, @PathVariable Long id){
        RepairModelDetails repairModelDetails = repairService.seById(id);
        model.addAttribute(DETAILS,repairModelDetails);
        return "pages/detailsmodal";
    }
}
