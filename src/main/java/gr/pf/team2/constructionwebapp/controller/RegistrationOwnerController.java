package gr.pf.team2.constructionwebapp.controller;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm2;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.validators.RegistrationOwnerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class RegistrationOwnerController {
    private static final String REGISTER_FORM = "registerOwnerForm";
    private static final String TYPE_OF_PROPERTIES = "typeOfProperties";
    private static final String ERROR_MESSAGE = "errorMessage";

    @Autowired
    private OwnerService ownerService;
    @Autowired
    private RegistrationOwnerValidator registrationOwnerValidator;
    @InitBinder(REGISTER_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(registrationOwnerValidator);
    }


    @GetMapping(value = "/owners/registerOwner")
    public String register(Model model) {
        model.addAttribute(REGISTER_FORM, new RegisterOwnerForm2());
        model.addAttribute(TYPE_OF_PROPERTIES, TypeOfProperty.values());
        return "pages/owner_create";
    }

    @PostMapping(value = "/owners/registerOwner")
    public String registerOwner(Model model, @Valid @ModelAttribute(REGISTER_FORM) RegisterOwnerForm2 registerOwnerForm2, BindingResult bindingResult,
                                RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/AdminHomePage";
        }
//        Owner newOwner = ownerService.register(registerOwnerForm);
        ownerService.register(registerOwnerForm2);
//        redirectAttributes.addAttribute("id", newOwner.getId());
      return "redirect:/AdminOwnerPage";
    }
}