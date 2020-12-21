package gr.pf.team2.constructionwebapp.enums;

public enum TypeOfProperty {

    APARTMENT("APARTMENT"),      // MONOKATOIKIA
    CONDO("CONDO"),              //POLIKATOIKIA
    DUPLEX("DUPLEX");           //MEZONETA

    private String fullName;

    TypeOfProperty(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
