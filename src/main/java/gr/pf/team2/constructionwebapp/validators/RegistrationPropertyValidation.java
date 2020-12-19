package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
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

    @Override
    public boolean supports(Class<?> aClass) {
        return CreatePropertyForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CreatePropertyForm createPropertyForm = (CreatePropertyForm)  target;


    }
}
