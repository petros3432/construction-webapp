package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.forms.SearchFormOwner;
import gr.pf.team2.constructionwebapp.forms.SearchFormProperty;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class SearchPropertyValidation implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return SearchFormProperty.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SearchFormProperty searchFormProperty = (SearchFormProperty)  target;

        if(searchFormProperty.getAfm().equals("")){
            errors.rejectValue("afm", "ownerSearch.All.Attributes.AreNull");
        }
    }
}
