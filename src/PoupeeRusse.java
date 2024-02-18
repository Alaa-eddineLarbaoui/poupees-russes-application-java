import java.sql.SQLOutput;

public class PoupeeRusse extends Poupee{

    Poupee poupee;

    public PoupeeRusse(int taille) {
        super(taille);
        poupee = null;
    }

    @Override
    public void ouvrir() {
        if (isOuverte() == false){
            setOuverte(true);
            System.out.println("la poupée a été ouverte");
        }
        else {
            System.out.println("la poupee est deja ouverte");
        }
    }

    @Override
    public void fermer() {
        if (isOuverte() == true){
            setOuverte(false);
            System.out.println("la poupée a été fermer ");
        }
        else {
            System.out.println("La poupee est deja fermer");
        }
    }

    @Override
    public void placerDans(Poupee p) {
        if (p.getTaille() >= getTaille()){
            System.out.println("Impossible de placer ");
        }
        else if (isOuverte() == false){
            System.out.println("Ouvrir tout d'abord la Poupee");
        }
        else {
            poupee = p;
            System.out.println("Voilà, le placement est réussi !! ");
        }
    }

    @Override
    public void sortirDe(Poupee p) {
        if (isOuverte()==false){
            System.out.println("La poupée est fermée. Veuillez d'abord l'ouvrir");
        }
        else if (p != poupee){
            System.out.println("La poupée est vide, elle ne contient aucune poupée.");
        }
        else {
           poupee = null;
            System.out.println(" Voilà, la Sortir de la poupee est réussi !!");
        }
    }
}
