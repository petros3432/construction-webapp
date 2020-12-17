package gr.pf.team2.constructionwebapp.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SearchFormOwner {

    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
    private static final String AFM_PATTERN = "^[0-9]*$";


    private static final int AFM_SIZE = 9;

    @Pattern(regexp = AFM_PATTERN, message = "{registerOwner.afm.pattern.invalid}")
    @Size( min = AFM_SIZE, max= AFM_SIZE, message = "{registerOwner.afm.size.invalid}")
    private String afm;

    @Pattern(regexp = MAIL_PATTERN, message = "{registerOwner.email.pattern.invalid}")
    @NotEmpty(message = "{registerOwner.email.not.null}")
    private String email;

    public String getAfm() { return afm; }

    public void setAfm(String afm) { this.afm = afm; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

}
