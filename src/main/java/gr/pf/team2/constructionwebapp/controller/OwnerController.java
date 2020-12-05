package gr.pf.team2.constructionwebapp.controller;


import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping({"/"})
    public String OwnersShowoff(Model model, @RequestParam(value = "id", required = false, defaultValue = "1") Long id) {

        Owner owner = ownerService.findOwner(id).get();

        model.addAttribute("owner", owner);

        return "hello";
    }

}
