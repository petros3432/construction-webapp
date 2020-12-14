package gr.pf.team2.constructionwebapp.controller.admin;

import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm2;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminControllerHome {
    private static final String TOP_10_REPAIRS = "top10rep";
    private static final String REGISTER_FORM = "registerOwnerForm";

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    @GetMapping({"/" , "/AdminHomePage","/repairs"})
    public String RepairsShowoff(Model model) {
        List<RepairModel> repairs = repairService.firstTenRepairs();
        model.addAttribute(TOP_10_REPAIRS, repairs);
        model.addAttribute(REGISTER_FORM, new RegisterOwnerForm2());
        return "pages/AdminHomePage";
    }
    @GetMapping({ "/AdminOwnerPage","/owners"})
    public String OwnersShowoff(Model model) {

        return "pages/AdminOwnerPage";
    }

}
