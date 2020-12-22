package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class EditPropertyValidation implements Validator {

   private static final String E9_PATTERN = "^[0-9]*$";


    @Autowired
    private PropertyService propertyService;


    @Override
    public boolean supports(Class<?> aClass) {
        return PropertyModel.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PropertyModel propertyModel = (PropertyModel) target;


        Optional<Property> pr = propertyService.findPropertyByE9Property(propertyModel.getPropertyE9());
        Optional<Property> pr2 = propertyService.findPropertyByAddress(propertyModel.getAddress());



        String afmModel = propertyModel.getAfm();

        String e999 = propertyModel.getPropertyE9();


        if (!e999.equals("")) {
            if (e999.length() != 11) {
                errors.rejectValue("propertyE9", "E9.must.be.11.numbers");

            }
            if (!e999.matches(E9_PATTERN)) {
                errors.rejectValue("propertyE9", "E9.must.contain.only.numbers");
            }

        }

        if (!pr.isEmpty()) {
            String afm = pr.get().getAfm();

            String e9 = pr.get().getPropertyE9();
            e999 = propertyModel.getPropertyE9();

            boolean isNotTheSameE9 = (!e9.equals(e999));

            if (!isNotTheSameE9 && (!afmModel.equals(afm))) {
                errors.rejectValue("propertyE9", "e9.is.already.used");
            }
        }


        if(!pr2.isEmpty()){
            String afm2 = pr2.get().getAfm();

            String address = pr2.get().getAddress();
            String address2 = propertyModel.getAddress();

            boolean isNotTheSameAddress = (!address.equals(address2));
            if (!isNotTheSameAddress && (!afmModel.equals(afm2))) {
                errors.rejectValue("address", "address.already.used");
            }
        }


        if(!pr2.isEmpty()&&!pr.isEmpty()){
            String afm3 = pr2.get().getAfm();

            String e92 = pr.get().getPropertyE9();
            e999 = propertyModel.getPropertyE9();


            String address3 = pr2.get().getAddress();
            String address4 = propertyModel.getAddress();

            boolean isNotTheSameE92 = (!e92.equals(e999));
            boolean isNotTheSameAddress2 = (!address3.equals(address4));


            if(!isNotTheSameAddress2&&!isNotTheSameE92&&!afmModel.equals(afm3)){
                errors.rejectValue("propertyE9", "e9.is.already.used");
            }
        }






    }


}

