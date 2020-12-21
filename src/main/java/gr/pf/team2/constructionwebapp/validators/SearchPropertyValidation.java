package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.forms.SearchFormProperty;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class SearchPropertyValidation implements Validator {

    private static final String AFM_PATTERN = "^[0-9]*$";
    private static final String E9_PATTERN = "^[0-9]*$";
    private static final int E9_SIZE = 11;



    @Override
    public boolean supports(Class<?> aClass) {
        return SearchFormProperty.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SearchFormProperty searchFormProperty = (SearchFormProperty)  target;
        String afm = searchFormProperty.getAfm();
        String e9 = searchFormProperty.getPropertyE9();

        if(searchFormProperty.getAfm().equals("")&&(searchFormProperty.getPropertyE9().equals(""))){
            errors.rejectValue("afm", "ownerSearch.All.Attributes.AreNull");
         }

        if(!afm.equals("")){
        if(afm.length()!=9){
            errors.rejectValue("afm", "repairCreate.afmOwner.size.invalid");

        }
        if(!afm.matches(AFM_PATTERN)){
            errors.rejectValue("afm", "createProperty.afm.pattern.invalid");
        }
    }

        if (!e9.equals("")) {
            if (e9.length() != 11) {
                errors.rejectValue("propertyE9", "E9.must.be.11.numbers");

            }
            if (!e9.matches(E9_PATTERN)) {
                errors.rejectValue("propertyE9", "E9.must.contain.only.numbers");
            }

        }


    }
}
