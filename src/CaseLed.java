public class CaseLed extends Case{
    // attributs
    private boolean estAllumée;

    // constructeur
    /**
     * Constructeur par default de la classe Case.
     * La valeur estAllumée est automatiquement initialisé à false.
     */
    public CaseLed(){
        this.estAllumée = false;
    }
    /**
     * Methode de construction des objets de type Case
     * @param estAllumée correspond à la valeur determiné de la case
     */
    public CaseLed(boolean estAllumée) {
        this.estAllumée = estAllumée;
    }

    // methodes perso
    /**
     * methode qui permet de connaitre l'état d'une led
     * @return
     */
    public boolean isEstAllumée() {
        return estAllumée;
    }
    /**
     * methode qui permet de modifier l'état d'une led, avec la valeur souhaitée
     * @param estAllumée
     */
    public void setEstAllumée(boolean estAllumée) {
        this.estAllumée = estAllumée;
    }
    /**
     * Methode permettant de passer une case d'un état à l'autre (allumée/true et eteinte/false)
     */
    public void changerEtat(){
        this.estAllumée= !this.estAllumée;
    }

    @Override
    public String toString() {
        String etat = ""+'\u26AA';
        if(estAllumée){
            etat=""+'\u26AB';
        }
        return etat;
    }
}
