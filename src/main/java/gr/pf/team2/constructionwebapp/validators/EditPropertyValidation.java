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


        Optional<Property> pr = propertyService.findPropertyByAfm(propertyModel.getPropertyE9());
        Optional<Property> pr2 = propertyService.findPropertyByAfm(propertyModel.getAddress());


        String afmModel = propertyModel.getAfm();

        if (!pr.isEmpty()) {
            String afm = pr.get().getAfm();

            String e9 = pr.get().getPropertyE9();
            String E92 = propertyModel.getPropertyE9();

            String address = pr2.get().getAddress();
            String address2 = propertyModel.getAddress();

            boolean isNotTheSameE9 = (!e9.equals(E92));
            boolean isNotTheSameAddress = (!address.equals(address2));


            if (!isNotTheSameE9 && (!afmModel.equals(afm))) {
                errors.rejectValue("e9", "e9.is.already.used");
            }

            if (!isNotTheSameAddress && (!afmModel.equals(afm))) {
                errors.rejectValue("address", "address.already.used");
            }


        }
    }


}

