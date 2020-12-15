package gr.pf.team2.constructionwebapp.validators;




import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class RegistrationOwnerValidator implements Validator {

//    @Autowired
//    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return RegisterOwnerForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RegisterOwnerForm registerOwnerForm = (RegisterOwnerForm)  target;
        // Here we add our custom validation logic
//        List<UserModel> usersWithGivenEmail = userService.findByEmail(registrationForm.getEmail());
//        if (!usersWithGivenEmail.isEmpty()) {
//            errors.rejectValue("email", "register.email.taken.error");
//        }
        // Or use reject if empty or whitespace
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "registerOwner.name.not.null");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "surname", "registerOwner.name.not.null");
    }
}
