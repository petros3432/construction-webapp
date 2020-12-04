package gr.pf.team2.constructionwebapp.enums;

public enum TypeOfProperty {

    MONOKATOIKIA("Monokatoikia"),
    POLIKATOIKIA("Polikatoikia"),
    MEZONETA("Mezoneta");

    private String fullName;

    TypeOfProperty(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
