package gr.pf.team2.constructionwebapp.controller;


import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

}
