import java.util.Scanner;

public class Fonctions {
    //  methode de saisie
    public static int saisirInt(){
        Scanner input = new Scanner(System.in);
        boolean valide = false;
        Integer i = null;
        while (!valide){
            System.out.println("Veuillez saisir un entier :");
            try{
                i=input.nextInt();
                valide=true;
            }catch (Exception e){
                System.out.println("Erreur dans la saisie.");
                input.next();
            }
        }
        return i;
    }
    public static double saisirDouble(){
        Scanner input = new Scanner(System.in);
        boolean valide = false;
        Double d = null;
        while (!valide){
            System.out.println("Veuillez saisir un réel :");
            try{
                d=input.nextDouble();
                valide=true;
            }catch (Exception e){
                System.out.println("Erreur dans la saisie.");
                input.next();
            }
        }
        return d;
    }
    public static String saisirString(){
        Scanner input = new Scanner(System.in);
        boolean valide = false;
        String s = null;
        while (!valide){
            System.out.println("Veuillez saisir une chaine de caractère :");
            try{
                s=input.nextLine();
                valide=true;
            }catch (Exception e){
                System.out.println("Erreur dans la saisie.");
                input.next();
            }
        }
        return s;
    }
    public static String saisirChar(){
        Scanner input = new Scanner(System.in);
        boolean valide = false;
        String s = null;
        while (!valide){
            System.out.println("Veuillez saisir un caractère :");
            try{
                s=input.nextLine();
                if(s.length()==1){
                    valide=true;
                }else{
                    System.out.print("Erreur, la longueur de la chaine est supérieur à 1.");
                }
            }catch (Exception e){
                System.out.println("Erreur dans la saisie.");
                input.next();
            }
        }
        return s;
    }

    // RessourcesEleve.Fonctions de saisies recursives (moins optimisées)
    /* public static int saisirIntR(){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Veuillez saisir un entier :");
        try{
            i = input.nextInt();
        }catch (Exception e){
            System.out.println("Erreur dans la saisie. Veuillez saisir un entier :");
            i = saisirIntR();
        }
        return i;
    }

    public static double saisirDoubleR(){
        Scanner input = new Scanner(System.in);
        double d;
        try{
            d = input.nextDouble();
        }catch (Exception e){
            System.out.println("Erreur dans la saisie. Veuillez saisir un réèl :");
            d = saisirDoubleR();
        }
        return d;
    }

    public static String saisirStringR(){
        Scanner input = new Scanner(System.in);
        String s;
        try{
            System.out.println("Veuillez saisir une chaine de caractère :");
            s = input.next();
        }catch (Exception e){
            System.out.println("Erreur dans la saisie. Veuillez saisir une chaine de caractère :");
            s = saisirStringR();
        }
        return s;
    }

     */
    public static int saisirNote(){
        Scanner input = new Scanner(System.in);
        int note;
        try{
            System.out.println("Veuillez saisir une note entre 0 et 20");
            note = input.nextInt();
            if(note<0){
                System.out.println("La note est inférieur à 0. Veuillez recommencer.");
                note = saisirNote();
            }else if( note > 20 ){
                System.out.println("La note est supérieur à 20. Veuillez recommencer.");
                note = saisirNote();
            }
        }catch (Exception e){
            System.out.println("Erreur dans la saisie. Veuillez recommencer.");
            note = saisirNote();
        }
        return note;
    }

    // methode d'affichage de tableau
    public static void afficheTabInt(int[] tableau){
        System.out.print("|");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + "|");
        }
        System.out.println();
    }
    public static void afficheTabChar(char[] tableau){
        System.out.print("|");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + "|");
        }
        System.out.println();
    }
    public static void afficheTabInt2d(int[][] tab2d){

        for(int i =0; i<tab2d.length; i++){
            for(int j=0; j<tab2d[i].length; j++){
                System.out.print(tab2d[i][j]+"|");
            }
            System.out.println();
        }
    }

    // methode mathématiques
    public static int random(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    public static double arrondir (double chiffre, int nbChiffreApresVirgule){
        double chiffreArrond;
        String nbC = "1";
        for (int i=0; i<nbChiffreApresVirgule; i++){
            nbC+="0";
        }
        Integer arrond = Integer.parseInt(nbC);
        chiffreArrond = (double)Math.round(chiffre * arrond) / arrond;
        return chiffreArrond;
    }
    public static int puissanceInt(int v, int p){
        return (int) Math.pow((double) v, (double) p);
    }
}
