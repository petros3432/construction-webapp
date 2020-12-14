package gr.pf.team2.constructionwebapp.controller.admin;

import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminRepairControllerHome {
    private static final String TOP_10_REPAIRS = "top10rep";
    private static final String REGISTER_FORM = "registerRepairForm";

    @Autowired
    private RepairService repairService;

    @GetMapping({"/" , "/AdminHomePage","/repair"})
    public String RepairsShowoff(Model model) {
        List<RepairModel> repairs = repairService.firstTenRepairs();
        model.addAttribute(TOP_10_REPAIRS, repairs);
        model.addAttribute(REGISTER_FORM, new RepairForm());
        return "pages/AdminHomePage";
    }
}
