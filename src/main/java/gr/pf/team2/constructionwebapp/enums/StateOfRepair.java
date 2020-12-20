package gr.pf.team2.constructionwebapp.enums;

public enum StateOfRepair {
    WAITING("WAITING"),
    IN_PROGRESS("IN PROGRESS"),
    COMPLETED("COMPLETED");

    private String fullName;

    StateOfRepair(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

}

