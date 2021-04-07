public class LightsOut {
    // attributs
    private PlateauLed plateau;
    private Integer tour;

    // constructeur
    public LightsOut(){
        plateau = new PlateauLed(5, 5);
        tour=1;
    }
    public LightsOut(int hauteur, int largeur){
        plateau = new PlateauLed(hauteur, largeur);
        tour=1;
    }

    // getter & setter

    // methodes perso
    /**
     * allume un nombre précis de led aléatoirement sur le plateau
     * @param nbLed nombre de led à allumer
     */
    public void ledRandom(int nbLed){
        int i =0;
        while (i<nbLed){
            int ry  = Fonctions.random(0, plateau.getGrille().length-1);
            int rx  = Fonctions.random(0, plateau.getGrille()[ry].length-1);
            if(!plateau.getLed(ry, rx).isEstAllumée()){
                plateau.getLed(ry, rx).changerEtat();
                i++;
            }
        }
    }
    /**
     * allume un test de led (pour debbug)
     */
    public void ledTest(){
        plateau.getLed(0,1).changerEtat();
        plateau.getLed(1,0).changerEtat();
        plateau.getLed(1,1).changerEtat();
        plateau.getLed(1,2).changerEtat();
        plateau.getLed(2,1).changerEtat();
    }
    /**
     * methode qui permet de choisir une led pour changer son état
     * @param y
     * @param x
     */
    public void choisirLed(int y, int x){
        changerEtat(y, x);
        changerVoisin(y, x);
        incrementeTour();
    }
    /**
     * methode pour changer l'état d'une Led
     * @param y
     * @param x
     */
    public void changerEtat(int y, int x){
        plateau.getLed(y,x).changerEtat();
    }
    /**
     * methode pour changer l'état des led voisines
      * @param y
     * @param x
     */
    public void changerVoisin(int y , int x){
        if(existeVoisinH(y,x)){
            plateau.getLed(y-1,x).changerEtat();
        }
        if(existeVoisinB(y,x)){
            plateau.getLed(y+1,x).changerEtat();
        }
        if(existeVoisinG(y,x)){
            plateau.getLed(y,x-1).changerEtat();
        }
        if(existeVoisinD(y,x)){
            plateau.getLed(y,x+1).changerEtat();
        }
    }
    /**
     * methodes qui testent l'existance des led voisines selon leurs positions
     * @param y
     * @param x
     * @return
     */
    public boolean existeVoisinH(int y, int x){
        boolean existe = true;
        if(y==0){
            existe=false;
        }
        return existe;
    }
    public boolean existeVoisinB(int y, int x){
        boolean existe = true;
        if(y==plateau.getGrille().length-1){
            existe=false;
        }
        return existe;
    }
    public boolean existeVoisinG(int y, int x){
        boolean existe = true;
        if(x==0){
            existe=false;
        }
        return existe;
    }
    public boolean existeVoisinD(int y, int x){
        boolean existe = true;
        if(x==plateau.getGrille()[y].length-1){
            existe=false;
        }
        return existe;
    }
    /**
     * methode qui test si le jeu est fini c'est à dire, si toutes les led sont éteintes
     * @return
     */
    public boolean isFini(){
        return plateau.isEteint();
    }
    /**
     * methode qui incrémente le tour de jeu (pour obtenir le nombre de coup joué)
     */
    public void incrementeTour(){
        this.tour++;
    }
    /**
     * methode pour remettre à zéro le jeu
     */
    public void reinitJeu(){
        plateau.initEteint();
        tour=1;
    }
    /**
     * Methode qui ressort une chaine pour un belle affichage en SOUT
     * @return
     */
    public String affichageSOUT(){
        String affichage ="";
        affichage += plateau.toString();
        affichage += "Nombre de coup joué : "+tour;
        return affichage;
    }

    /**
     * methode pour afficher le jeu (plateau + nb de coup joué)
     */
    @Override
    public String toString() {
        return "LightsOut{" +
                "plateau=\n" + plateau +
                "tour=" + tour +
                '}';
    }
}