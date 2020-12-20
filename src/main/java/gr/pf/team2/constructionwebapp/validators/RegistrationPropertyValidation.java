package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
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
public class RegistrationPropertyValidation implements Validator {

    @Autowired
    private PropertyService propertyService;
    @Autowired
    private OwnerService ownerService;

    @Override
    public boolean supports(Class<?> aClass) {
        return CreatePropertyForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CreatePropertyForm createPropertyForm = (CreatePropertyForm)  target;
        Optional<OwnerModel> owner = ownerService.findOwnerByAfm(createPropertyForm.getAfm());
        Optional<Property> property =  propertyService.findPropertyByE9Property(createPropertyForm.getPropertyE9());
        if(!owner.isPresent()){
            errors.rejectValue("afm","createProperty.afm.not.existing");

        }
        if (property.isPresent()){
            errors.rejectValue("propertyE9","createProperty.propertyE9.in.use");
        }




    }
}
