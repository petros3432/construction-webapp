package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class EditPropertyValidation implements Validator {

    @Autowired
    private PropertyService propertyService;


    @Override
    public boolean supports(Class<?> aClass) {
        return PropertyModel.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PropertyModel propertyModel = (PropertyModel) target;

        Optional<Property> property = propertyService.findPropertyByE9Property(propertyModel.getPropertyE9());
        String addressModel = propertyModel.getAddress();

        if(!property.isEmpty()) {
            String address = property.get().getAddress();
            String e9 = property.get().getPropertyE9();
            String e92 = propertyModel.getPropertyE9();



            boolean isNotTheSame = (!e9.equals(e92));


            if (!isNotTheSame&&(!addressModel.equals(address))){
                errors.rejectValue("propertyE9", "createProperty.propertyE9.in.use");
            }
        }



    }
}
