package gr.pf.team2.constructionwebapp.enums;

public enum StateOfRepair {
    DEFAULT("Waiting"),
    IN_PROGRESS("In progress"),
    COMPLETED("Completed");

    private String fullName;

    StateOfRepair(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

}

