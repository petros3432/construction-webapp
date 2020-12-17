package gr.pf.team2.constructionwebapp.controller.owner;


import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

//    private static final String OWNERS_REPAIRS = "repairs";
//
//
//    @GetMapping({"/owner_user/{afm}"})
//    public String OwnerByAfm(Model model,@PathVariable String afm) {
//        OwnerModel ownerModel = ownerService.findOwnerById(id);
//        Owner owner = ownerService.findOwnerByAfmOwner(afm).orElseThrow();
//        model.addAttribute(OWNERS_REPAIRS, owner.getRepairs());
//        return "pages/OwnerHomePage";
//    }

}
