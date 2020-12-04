package gr.pf.team2.constructionwebapp.enums;

public enum StateOfRepair {
    DEFAULT("Σε αναμονή"),
    ΣΕ_ΕΞΕΛΙΞΗ("Σε εξέλιξη"),
    ΟΛΟΚΛΗΡΩΜΕΝΗ("Ολοκληρωμένη");

    private String fullName;

    StateOfRepair(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

}

