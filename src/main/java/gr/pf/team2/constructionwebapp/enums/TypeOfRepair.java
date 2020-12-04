package gr.pf.team2.constructionwebapp.enums;

public enum TypeOfRepair {

    ΒΑΨΙΜΟ("Βάψιμο"),
    ΜΟΝΩΣΗ("Μόνωση"),
    ΚΟΥΦΩΜΑΤΑ("Κουφώματα"),
    ΥΔΡΑΥΛΙΚΑ("Υδραυλικές εργασίες"),
    ΗΛΕΚΤΡΟΛΟΓΙΚΑ("Ηλεκτρολογικές εργασίες");


    private String fullName;

    TypeOfRepair(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
