package gr.pf.team2.constructionwebapp.controller.owner;


import gr.pf.team2.constructionwebapp.domain.Owner;
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




    @GetMapping({"ownerByEmail/{email}"})
    public String OwnerByEmail(Model model, @PathVariable String email) {
        Owner owner = ownerService.findOwnerByEmail(email).orElseThrow();
        model.addAttribute("owner", owner);
        return "pages/AdminHomePage";
    }
//
//    @GetMapping({"ownerUpdate/{id}"})
//    public String UpdateOwnerProperty(Model model, @ModelAttribute Owner owner) {
//        Owner databaseOwner = ownerService.findOwnerById(owner.getId()).orElseThrow();
//        databaseOwner = ownerService.updateOwner(owner, databaseOwner);
//        model.addAttribute("owner", databaseOwner);
//        return "pages/AdminHomePage";
//    }

}