package gr.pf.team2.constructionwebapp.forms;


public class SearchForm {
    private String scheduledDateStart;

    private String scheduledDateEnd;

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
