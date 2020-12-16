package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.forms.SearchFormOwner;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SearchOwnerValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return SearchFormOwner.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SearchFormOwner ownerSearchForm = (SearchFormOwner)  target;

        if(ownerSearchForm.getAfm().equals("")&&ownerSearchForm.getEmail().equals("")){
            errors.rejectValue("email", "ownerSearch.All.Attributes.AreNull");
        }
    }


}
