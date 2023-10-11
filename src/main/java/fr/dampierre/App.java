package fr.dampierre;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int minimumSalaireAnnuel = 3000;
        int minimumAnneesTravail = 2;
        System.out.println("salaire annuel : ");
        Scanner clavier = new Scanner(System.in);
        int salaireAnnuel = clavier.nextInt();
        System.out.println("années de travail : ");
        int anneesTravail = clavier.nextInt();
        clavier.close();
        if (salaireAnnuel >= minimumSalaireAnnuel && anneesTravail >= minimumAnneesTravail) {
            System.out.println("vous pouvez obtenir un prêt");
        } else if (salaireAnnuel < minimumSalaireAnnuel && anneesTravail >= minimumAnneesTravail) {
            System.out.println("vous ne disposez pas de revenus suffisants");
        } else if (salaireAnnuel >= minimumSalaireAnnuel && anneesTravail < minimumAnneesTravail) {
            System.out.println("vous ne disposez pas du minimum d'années de travail");
        } else {
            System.out.println("vous ne disposez ni de revenus suffisants ni du minimum d'années de travail");
        }
    }
}

// définir minimumSalaireAnnuel = 3000
// définir minimumAnneesTravail = 2
// demander salaireAnnuel
// demander annéesTravail
// si salaireAnnuel >= minimumSalaireAnnuel ET anneesTravail =>
// minimumAnneesTravail alors
// afficher "vous pouvez obtenir un prêt"
// sinon si salaireAnnuel < minimumSalaireAnnuel ET anneesTravail =>
// minimumAnneesTravail alors
// afficher "vous ne pouvez pas obtenir de prêt car vos revenus ne sont pass
// assez élevés"
// sinon si salaireAnnuel >= minimumSalaireAnnuel ET ann