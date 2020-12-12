package gr.pf.team2.constructionwebapp.controller.admin;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.models.RepairModelDetails;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminControllerHome {
    private static final String TOP_10_REPAIRS = "top10rep";

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    @GetMapping({"/" , "/admin"})
    public String OwnersShowoff(Model model) {
        List<RepairModel> repairs = repairService.firstTenRepairs();
        model.addAttribute(TOP_10_REPAIRS, repairs);
        return "pages/AdminHomePage";
    }
}
