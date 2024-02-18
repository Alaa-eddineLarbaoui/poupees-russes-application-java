import java.util.Scanner;
public class Menu {





    public void menu (){
        Scanner sc =new Scanner(System.in);
        PoupeeRusse p1 = new PoupeeRusse(6);
        PoupeeRusse p2 = new PoupeeRusse(4);
        PoupeeRusse p3 = new PoupeeRusse(2);

        int choix , taille;
        do {
            System.out.println();
            System.out.println("|===========================================================================|");
            System.out.println("|=============              Gestion Poupée Russe              ==============|");
            System.out.println("|===========================================================================|");
            System.out.println("|  1: Ouvre la poupée                                                       |");
            System.out.println("|  2: Ferme la poupée                                                       |");
            System.out.println("|  3: Place la poupée dans une autre poupée                                 |");
            System.out.println("|  4: Sort la poupée d'une autre poupée                                     |");
            System.out.println("|  5: Quitter application                                                   |");
            System.out.println("|===========================================================================|");
            System.out.println();


            System.out.println("Enter votre choix: ");

            choix = sc.nextInt();
            switch (choix){
                case 1:
                    System.out.println("|====================|");
                    System.out.println("| p1 : Taille = "  + p1.getTaille());
                    System.out.println("| p2 : Taille = "  + p2.getTaille());
                    System.out.println("| p3 : Taille = "  + p3.getTaille());
                    System.out.println("|====================|");
                    System.out.println();
                    System.out.print("Entrer la taille de la poupée à ouvrir: ");
                    taille = sc.nextInt();
                    if(taille ==6){
                        p1.ouvrir();}
                    else if (taille ==4){
                        p2.ouvrir();}
                    else if (taille ==2){
                        p3.ouvrir();
                    }
                    else {
                        System.out.println("La taille invalide essayer ");}
                    break;

                case 2:
                    System.out.print("Entrer Taille de la poupée à ferme: ");
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
                    int ChoixPlace;
                    System.out.println("+------------------------------------+");
                    System.out.println("|       Placer une Poupée Russe      |");
                    System.out.println("+------------------------------------+");
                    System.out.println("|  1. Placer poupée 1 dans poupée 2. |");
                    System.out.println("|  2. Placer poupée 1 dans poupée 3. |");
                    System.out.println("|  3. Placer poupée 2 dans poupée 1. |");
                    System.out.println("|  4. Placer poupée 2 dans poupée 3. |");
                    System.out.println("|  5. Placer poupée 3 dans poupée 1. |");
                    System.out.println("|  6. Placer poupée 3 dans poupée 2. |");
                    System.out.println("+------------------------------------+");
                    System.out.print("Enter votre choix pour deplacer une poupee russe: ");
                    ChoixPlace = sc.nextInt();
                    switch (ChoixPlace){
                        case 1 :
                            p1.placerDans(p2);
                            break;
                        case 2 :
                            p1.placerDans(p3);
                            break;
                        case 3 :
                            p2.placerDans(p1);
                            break;
                        case 4 :
                            p2.placerDans(p3);
                            break;
                        case 5 :
                            p3.placerDans(p1);
                            break;
                        case 6 :
                            p3.placerDans(p2);
                            break;
                        default:
                            System.out.println("Choix invalide. Veuillez réessayer.");
                            break;
                    }
                    break;
                case 4:
                int ChoixDeSortir;
                System.out.println("+------------------------------------+");
                System.out.println("|       Placer une Poupée Russe      |");
                System.out.println("+------------------------------------+");
                System.out.println("|  1. Sortir poupée 1 de poupée 2. |");
                System.out.println("|  2. Sortir poupée 1 de poupée 3. |");
                System.out.println("|  3. Sortir poupée 2 de poupée 1. |");
                System.out.println("|  4. Sortir poupée 2 de poupée 3. |");
                System.out.println("|  5. Sortir poupée 3 de poupée 1. |");
                System.out.println("|  6. Sortir poupée 3 de poupée 2. |");
                System.out.println("+------------------------------------+");
                System.out.print("Enter votre choix pour deplacer une poupee russe: ");
                    ChoixDeSortir = sc.nextInt();
                switch (ChoixDeSortir){
                    case 1 :
                        p1.sortirDe(p2);
                        break;
                    case 2 :
                        p1.sortirDe(p3);
                        break;
                    case 3 :
                        p2.sortirDe(p1);
                        break;
                    case 4 :
                        p2.sortirDe(p3);
                        break;
                    case 5 :
                        p3.sortirDe(p1);
                        break;
                    case 6 :
                        p3.sortirDe(p2);
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                        break;
                }
                break;
                case 5:
                    System.out.println("Merci pour l'Utilisation de Notre Application ");
                    break ;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer. ");
                    break ;
            }
        }while (choix != 5);
    }
}


