import java.util.Scanner;
public class Menu {





    public void menu (){
        Scanner sc =new Scanner(System.in);
        PoupeeRusse p1 = new PoupeeRusse(6);
        PoupeeRusse p2 = new PoupeeRusse(4);
        PoupeeRusse p3 = new PoupeeRusse(2);

        int choix , taille;
        do {
            System.out.println("|===========================================================================|");
            System.out.println("|=============              Gestion Poupée Russe              ==============|");
            System.out.println("|===========================================================================|");
            System.out.println("|  1: Ouvre la poupée                                                       |");
            System.out.println("|  2: Ferme la poupée                                                       |");
            System.out.println("|  3: Place la poupée dans une autre poupée                                 |");
            System.out.println("|  4: Sort la poupée d'une autre poupée                                     |");
            System.out.println("|  5: Quitter application                                                   |");
            System.out.println("|===========================================================================|");

            System.out.println("Size = " + p1.getTaille());
            System.out.println("Size = " + p2.getTaille());
            System.out.println("Size = " + p3.getTaille());

            System.out.println("Enter votre choix: ");

            choix = sc.nextInt();
            switch (choix){
                case 1:
                    System.out.print("Taille de la poupée à ouvrir: ");
                    taille = sc.nextInt();
                    if(taille ==6){
                        p1.ouvrir();}
                    else if (taille ==4){
                        p2.ouvrir();}
                    else if (taille ==2){
                        p3.ouvrir();
                    }
                    else {
                        System.out.println("la Taille Invalide Essayer ");}
                    break;

                case 2:
                    System.out.print("Taille de la poupée à ferme: ");
                    taille = sc.nextInt();
                    if(taille ==6){
                        p1.fermer();}
                    else if (taille ==4){
                        p2.fermer();}
                    else if (taille ==2){
                        p3.fermer();
                    }
                    else {
                        System.out.println("la Taille Invalide Essayer ");}
                    break;
                case 3:
                    System.out.print("Taille de la poupée à placer: ");
                    int sizePlace = sc.nextInt();
                    System.out.print("la taille de la poupée dans laquelle vous voulez placer: ");
                    int sizeDestination = sc.nextInt();
                    // placeInDoll(sizePlace, sizeDestination, p1, p2, p3);
                    break;
                case 4:
                    System.out.println("Merci pour l'Utilisation de Notre Application ");
                    break ;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer. ");
                    break ;
            }
        }while (choix != 4);
    }



}


