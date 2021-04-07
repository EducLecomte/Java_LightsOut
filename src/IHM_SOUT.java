public class IHM_SOUT {
    public static void  lancerSOUT(){
        LightsOut jeu = new LightsOut();
        jeu.ledTest();
        System.out.println(jeu.affichageSOUT());
        jeu.choisirLed(1,1);
        jeu.choisirLed(4,4);
        System.out.println(jeu.toString());
        System.out.println(""+jeu.isFini());
        jeu.choisirLed(4,4);
        System.out.println(jeu.toString());
        System.out.println(""+jeu.isFini());
        jeu.ledRandom(5);
        System.out.println(jeu.affichageSOUT());
    }

    public void choisirCase(){

    }
}
