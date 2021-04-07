public class PlateauLed extends Plateau{
    // attributs

    // constructeur
    /**
     * Construteur permettant de faire un plateau de taille hauteur*largeur
     * @param hauteur
     * @param largeur
     */
    public PlateauLed(int hauteur, int largeur){
        grille = new CaseLed[hauteur][largeur];
        initEteint();
    }

    // getter & setter
    public CaseLed[][] getGrille() {
        return (CaseLed[][])grille;
    }

    // methodes perso
    /**
     * Methode qui initialise le plateau avec toutes les led eteintent
     */
    public void initEteint(){
        for (int y=0; y < grille.length; y++){
            for (int x=0; x < grille[y].length; x++){
                grille[y][x]=new CaseLed();
            }
        }
    }
    /**
     * Methode qui permet de recuperer la caseLed au coordonnées précisé en parametre
     * @param y
     * @param x
     * @return
     */
    public CaseLed getLed(int y, int x){
        return this.getGrille()[y][x];
    }
    /**
     * methode qui permet de savoir si tout le plateau est éteint
     * @return
     */
    public boolean isEteint(){
        boolean eteint = true;
        for (int y=0; y < grille.length; y++){
            for (int x=0; x < grille[y].length; x++){
                if(((CaseLed)grille[y][x]).isEstAllumée()){
                    eteint=false;
                };
            }
        }
        return eteint;
    }
}
