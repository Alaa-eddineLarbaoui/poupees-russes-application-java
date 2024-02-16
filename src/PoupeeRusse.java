import java.sql.SQLOutput;

public class PoupeeRusse extends Poupee{

    Poupee poupee;

    PoupeeRusse(int tailleP) {
        super(tailleP);
        poupee = null;
    }

    @Override
    public void ouvrir() {
        if (isOuverte() == false){
            setOuverte(true);
            System.out.println("la poupee a ete ouverte");
        }
        else {
            System.out.println("est deja ouverte");
        }
    }

    @Override
    public void fermer() {
        if (isOuverte() == true){
            setOuverte(false);
            System.out.println("la poupee a ete fermer");
        }
        else {
            System.out.println("est deja fermer");
        }
    }

    @Override
    public void placerDans(Poupee p) {
        if (p.getTaille() <= getTaille()){
            System.out.println("impossible");
        }
        else if (isOuverte() == false){
            System.out.println("ouvrir tout d'abord la popee");
        }
        else {
            poupee = p;
            System.out.println("placemment de la poupee");
        }
    }

    @Override
    public void sortirDe(Poupee p) {
        if (isOuverte()==false){
            System.out.println("la popee est fermer,ouvrir tout d'abord la poupee");
        }
        else if (p != poupee){
            System.out.println("la poupee est vide  ");
        }
        else {
           poupee = null;
            System.out.println(" la poupee est sortie");
        }
    }
}
