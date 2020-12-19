package gr.pf.team2.constructionwebapp.validators;


import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class RegistrationOwnerValidation implements Validator {

    @Autowired
    private OwnerService ownerService;

    @Override
    public boolean supports(Class<?> aClass) {
        return RegisterOwnerForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RegisterOwnerForm registerOwnerForm = (RegisterOwnerForm)  target;

        Owner ownersWithTheGivenEmail = ownerService.findOwnerByEmail(registerOwnerForm.getEmail());
        if(ownersWithTheGivenEmail !=null){
            errors.rejectValue("email", "ownerCreate.Existing.Email");
        }

        Optional<Owner> ownersWithTheGivenAFM = ownerService.findOwnerByAfmOwner(registerOwnerForm.getAfm());
        if(!ownersWithTheGivenAFM.isEmpty()){
            errors.rejectValue("afm", "ownerCreate.Existing.AFM");
        }

    }
}
