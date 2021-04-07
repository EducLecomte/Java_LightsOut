import java.lang.reflect.Array;
import java.util.Arrays;


public abstract class Plateau {
    // attributs
    protected Case[][] grille;

    // getter & setter

    // methodes perso

    @Override
    public String toString() {
        String affichage="";
        for (int y=0; y < grille.length; y++){
            for (int x=0; x < grille[y].length; x++){
                affichage+=grille[y][x].toString();
            }
            affichage+="\n";
        }
        return affichage;
    }

}
