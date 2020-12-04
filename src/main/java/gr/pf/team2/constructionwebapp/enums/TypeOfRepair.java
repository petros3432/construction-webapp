package gr.pf.team2.constructionwebapp.enums;

public enum TypeOfRepair {

    PAINTING("Painting"),
    INSULATION("Insulation"),
    FRAMES("Frames"),
    PLUMBING("Plumbing tasks"),
    ELECTRICAL("Electrical tasks");


    private String fullName;

    TypeOfRepair(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
