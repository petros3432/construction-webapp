package gr.pf.team2.constructionwebapp.enums;

public enum TypeOfRepair {

    PAINTING("PAINTING"),
    INSULATION("INSULATION"),
    FRAMES("FRAMES"),
    PLUMBING("PLUMPING TASK"),
    ELECTRICAL("ELECTRICAL TASKS");


    private String fullName;

    TypeOfRepair(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
