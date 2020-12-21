package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import java.util.Optional;

@Component
public class EditRepairValidation implements Validator {

    @Autowired
    private PropertyService propertyService;


    @Override
    public boolean supports(Class<?> aClass) {
        return RepairModel.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RepairModel repairModel = (RepairModel) target;
        
        Optional<Property> property = propertyService.findPropertyByAddress(repairModel.getAddress());


        if (!property.isPresent()) {
            errors.rejectValue("address", "repair.address.edit.notExists.inProperty.Entity");
        }

    }
}
