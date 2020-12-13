package gr.pf.team2.constructionwebapp.enums;

public enum TypeOfProperty {

    MONOKATOIKIA("Μονοκατοικία"),
    POLIKATOIKIA("Πολυκατοικία"),
    MEZONETA("Μεζονέτα");

    private String fullName;

    TypeOfProperty(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
