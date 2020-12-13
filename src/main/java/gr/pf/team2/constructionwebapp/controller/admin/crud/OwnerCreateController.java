//package gr.pf.team2.constructionwebapp.controller.admin.crud;
//
//import gr.pf.team2.constructionwebapp.enums.StateOfRepair;
//import gr.pf.team2.constructionwebapp.enums.TypeOfRepair;
//import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
//import gr.pf.team2.constructionwebapp.forms.RepairForm;
//import gr.pf.team2.constructionwebapp.service.OwnerService;
//import gr.pf.team2.constructionwebapp.service.RepairService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.validation.Valid;
//
//import static gr.pf.team2.constructionwebapp.utils.GlobalVariables.ERROR_MESSAGE;
//
//@Controller
//public class OwnerCreateController {
//
//
//    private static final String OWNER_FORM = "RegisterOwnerForm";
//
//
//    @Autowired
//    private OwnerService ownerService;
//
//    @GetMapping(value = "/owners/create")
//    public String repairDynamic(Model model) {
//        model.addAttribute(OWNER_FORM, new RegisterOwnerForm());
//
//        return "pages/owners_create";
//    }
//
//    @PostMapping(value = "/owners/create")
//    public String createRepair(Model model, @Valid @ModelAttribute(OWNER_FORM) RegisterOwnerForm registerOwnerForm, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            model.addAttribute(ERROR_MESSAGE, "an error occurred");
//            return "pages/owners_create";
//        }
//        ownerService.addOwner(registerOwnerForm);
//        return "redirect:pages/AdminHomePage";
//    }
//}
