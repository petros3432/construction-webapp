package gr.pf.team2.constructionwebapp.controller;


import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class OwnerController {

    @Autowired
    private OwnerService ownerService;


    @GetMapping({"ownerByAfm/{afm}"})
    public String OwnerByAfm(Model model,@PathVariable String afm) {
        Owner owner = ownerService.findOwnerByAfm(afm).orElseThrow();
        model.addAttribute("owner", owner);
        return "hello";
    }

    @GetMapping({"ownerByEmail/{email}"})
    public String OwnerByEmail(Model model,@PathVariable String email) {
        Owner owner = ownerService.findOwnerByEmail(email).orElseThrow();
        model.addAttribute("owner", owner);
        return "hello";
    }

    @PatchMapping({"ownerUpdate/{id}"})
    public String UpdateOwnerProperty(Model model,@ModelAttribute Owner owner) {
        Owner databaseOwner = ownerService.findOwnerById(owner.getId()).orElseThrow();
        databaseOwner = ownerService.updateOwner(owner,databaseOwner);
        model.addAttribute("owner", databaseOwner);
        return "hello";
    }


    @PostMapping({"addOwnerProperty"})
    public String doAddOwnerProperty(Model model,@ModelAttribute Owner owner){
        owner=ownerService.addOwnerProperty(owner);
        model.addAttribute(owner);
        return "hello";
    }

}
