package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
    /* Methode qui permet d'ajouter du texte */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }
    /* Methode qui permet de remplacer du texte entre deux points donnés */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }
    /* Methode qui permet de mettre du texte en majuscule entre deux points donnés */
    public void majuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        String remplacement = this.texte.substring(start,end);
        this.texte = leftPart + remplacement.toUpperCase() + rightPart;
    }

    /* Methode qui permet d'éffacer entre deux points donnés */
    public void effacer(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + rightPart;
    }

    /* Methode qui permet de tout supprimer */
    public void clear() {
        this.texte = "";
    }
}
