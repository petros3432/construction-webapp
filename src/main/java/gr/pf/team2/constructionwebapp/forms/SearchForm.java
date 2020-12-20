package gr.pf.team2.constructionwebapp.forms;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SearchForm {



    private String scheduledDateStart;

    private String scheduledDateEnd;

//    @Pattern(regexp = AFM_PATTERN, message = "{registerOwner.afm.pattern.invalid}")
//    @Size( min = AFM_SIZE, max= AFM_SIZE, message = "{registerOwner.afm.size.invalid}")
    private String afm;

    public String getScheduledDateStart() {
        return scheduledDateStart;
    }

    public void setScheduledDateStart(String scheduledDateStart) {
        this.scheduledDateStart = scheduledDateStart;
    }

    public String getScheduledDateEnd() {
        return scheduledDateEnd;
    }

    public void setScheduledDateEnd(String scheduledDateEnd) {
        this.scheduledDateEnd = scheduledDateEnd;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }
}
