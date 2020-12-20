package gr.pf.team2.constructionwebapp.enums;

public enum StateOfRepair {
    WAITING("WAITING"),
    ONGOING("ONGOING"),
    COMPLETED("COMPLETED");

    private String fullName;

    StateOfRepair(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

}

