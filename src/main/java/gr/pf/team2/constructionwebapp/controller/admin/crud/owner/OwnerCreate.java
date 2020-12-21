package gr.pf.team2.constructionwebapp.controller.admin.crud.owner;

import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.validators.RegistrationOwnerValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("admin")
public class OwnerCreate {
    private static final String REGISTER_FORM = "registerOwnerForm";
    private static final String ERROR_MESSAGE = "errorMessage";

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RegistrationOwnerValidation registrationOwnerValidation;

    @InitBinder(REGISTER_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(registrationOwnerValidation);
    }


    @GetMapping(value = "/owner/create")
    public String register(Model model) {
        model.addAttribute(REGISTER_FORM, new RegisterOwnerForm());
        return "pages/owner_create";
    }

    @PostMapping(value = "/owner/create")
    public String registerOwner(Model model, @Valid @ModelAttribute(REGISTER_FORM) RegisterOwnerForm registerOwnerForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "pages/owner_create";
        }
        ownerService.register(registerOwnerForm);
        return "redirect:/admin/owner";
    }
}