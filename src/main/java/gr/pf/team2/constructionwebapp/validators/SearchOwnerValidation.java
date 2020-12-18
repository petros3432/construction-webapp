package gr.pf.team2.constructionwebapp.validators;

import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.forms.SearchFormOwner;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SearchOwnerValidation implements Validator {
//    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
//    private static final String AFM_PATTERN = "^[0-9]*$";

    @Override
    public boolean supports(Class<?> aClass) {
        return SearchFormOwner.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SearchFormOwner ownerSearchForm = (SearchFormOwner)  target;

        if(ownerSearchForm.getAfm().equals("")&&ownerSearchForm.getEmail().equals("")){
            errors.rejectValue("afm", "ownerSearch.All.Attributes.AreNull");
        }
    }


}
