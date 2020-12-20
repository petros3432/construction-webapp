package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.service.OwnerService;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class EditOwnerValidation implements Validator {


    @Autowired
    private OwnerService ownerService;


    @Override
    public boolean supports(Class<?> aClass) {
        return OwnerModel.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        OwnerModel ownerModel = (OwnerModel) target;


        Optional<Owner> owner = ownerService.findOwnerByAfmOwner(ownerModel.getAfm());


      String emailModel= ownerModel.getEmail();

        if(!owner.isEmpty()) {
            String email = owner.get().getEmail();

            String afm = owner.get().getAfm();
            String AFM = ownerModel.getAfm();
            boolean isNotTheSame = (!AFM.equals(afm));

            if (!isNotTheSame&&(!emailModel.equals(email))){
                errors.rejectValue("afm", "editOwner.afm.in.use");
            }
        }
    }
}
