import java.util.Scanner;
public class Menu {





    public void menu (){
        Scanner sc =new Scanner(System.in);
        PoupeeRusse p1 = new PoupeeRusse(6);
        PoupeeRusse p2 = new PoupeeRusse(4);
        PoupeeRusse p3 = new PoupeeRusse(2);

        int choix , tailleP;
        do {
            System.out.println("|===========================================================================|");
            System.out.println("|=============              Gestion Poupée Russe              ==============|");
            System.out.println("|===========================================================================|");
            System.out.println("|-------------  1: Ouvre la poupée                              ------------|");
            System.out.println("|-------------  2: Ferme la poupée                              ------------|");
            System.out.println("|-------------  3: Place la poupée dans une autre poupée        ------------|");
            System.out.println("|-------------  4: Sort la poupée d'une autre poupée            ------------|");
            System.out.println("|-------------  5: Quitter application                          ------------|");
            System.out.println("|===========================================================================|");

            System.out.println("1:Size = " + p1.getTaille());
            System.out.println("2:Size = " + p2.getTaille());
            System.out.println("3:Size = " + p3.getTaille());

            System.out.println("Enter votre choix: ");
            // int sc = new Scanner(System.in).nextInt();
            choix = sc.nextInt();
            switch (choix){
                case 1:
                    System.out.print("Taille de la poupée à ouvrir: ");
                    tailleP = sc.nextInt();
                    p1.ouvrir();
                    //dollToOpen(tailleP, p1, p2, p3);
                    break;
                case 2:
                    System.out.print("Taille de la poupée à ferme: ");
                    tailleP = sc.nextInt();
                    // dollToClose(tailleP, p1, p2, p3);
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


