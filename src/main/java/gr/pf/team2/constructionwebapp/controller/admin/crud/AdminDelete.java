package gr.pf.team2.constructionwebapp.controller.admin.crud;

import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class AdminDelete {

    @Autowired
    private RepairService repairService;

    @PostMapping(value = "/repair/{id}/delete")
    public String deleteRepairById(@PathVariable Long id) {
        repairService.deleteById(id);
        return "redirect:/pages/AdminHomePage";
    }
}
