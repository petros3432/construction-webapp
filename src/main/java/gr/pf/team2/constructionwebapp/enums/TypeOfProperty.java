package gr.pf.team2.constructionwebapp.enums;

public enum TypeOfProperty {

    ΜΟΝΟΚΑΤΟΙΚΙΑ("Μονοκατοικία"),
    ΠΟΛΥΚΑΤΟΙΚΙΑ("Πολυκατοικία"),
    ΜΕΖΟΝΕΤΑ("Μεζονέτα");

    private String fullName;

    TypeOfProperty(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
