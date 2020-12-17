package gr.pf.team2.constructionwebapp.forms;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SearchForm {
    private static final String AFM_PATTERN = "^[0-9]*$";
    private static final int AFM_SIZE=9;

    private String scheduledDateStart;

    private String scheduledDateEnd;

    @Pattern(regexp = AFM_PATTERN,message = "{repairCreate.afmOwner.pattern.invalid}")
    @NotEmpty(message = "{repairCreate.afmOwner.not.null}")
    @Size( min = AFM_SIZE, max= AFM_SIZE, message = "{repairCreate.afmOwner.size.invalid}")
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
