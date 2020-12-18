package gr.pf.team2.constructionwebapp.controller.admin;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.forms.RepairForm;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class HomeController {
    private static final String TOP_10_REPAIRS = "top10rep";
    private static final String REGISTER_FORM = "registerRepairForm";
    private static final String OWNERS_REPAIRS = "repairs";


    @Autowired
    private RepairService repairService;

    @Autowired
    private OwnerService ownerService;

    @GetMapping(path = "/")
    public String home() {

        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().contains("ADMIN"))) {
            return "redirect:/admin/home";
        }
        return "redirect:/user/home";
    }

    @GetMapping(path = "/admin/home")
    public String RepairsShowoff(Model model) {
        List<RepairModel> repairs = repairService.firstTenRepairs();
        model.addAttribute(TOP_10_REPAIRS, repairs);
        model.addAttribute(REGISTER_FORM, new RepairForm());
        return "Admin/AdminHomePage";
    }


    @GetMapping("/user/home")
    public String OwnerByEmail(Model model) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        Owner owner = ownerService.findOwnerByEmail(email);
        model.addAttribute(OWNERS_REPAIRS, owner.getRepairs());
        return "User/OwnerHomePage";
    }

}
