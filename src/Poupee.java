abstract public class Poupee {
    // les propriétés
    private int taille;
    private boolean ouverte;


    // constructeur
    public Poupee(int taille){
        this.taille= taille;
        this.ouverte = false;
    }

    // les getter et setter)
    public int getTaille() {

        return taille;
    }

    public void setTaille(int taille) {

        this.taille = taille;
    }

    public boolean isOuverte() {
        return ouverte;}

    public void setOuverte(boolean ouverte) {

        this.ouverte = ouverte;
    }


    // méthodes abstraites
    public abstract  void ouvrir();

    public abstract void fermer();

    public abstract void placerDans(Poupee p);

    public abstract void sortirDe(Poupee p);


}
