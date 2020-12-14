package gr.pf.team2.constructionwebapp.controller.admin;


import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class AdminOwnerControllerHome {


    private static final String TOP_10_OWNERS = "top10owners";
    private static final String REGISTER_FORM = "registerOwnerForm";

    @Autowired
    private OwnerService ownerService;


    @GetMapping({"/AdminOwnerPage", "/owner"})
    public String OwnersShowoff(Model model) {
        List<OwnerModel> owners = ownerService.firstTenOwners();
        model.addAttribute(TOP_10_OWNERS, owners);
        model.addAttribute(REGISTER_FORM, new RegisterOwnerForm());
        return "pages/AdminOwnerPage";
    }


}
