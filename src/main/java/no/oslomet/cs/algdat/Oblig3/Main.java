package no.oslomet.cs.algdat.Oblig3;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {



       // Et eksempel på hvordan det skal virke:
        int[] a = {4,7,2,9,4,10,8,7,4,6,1};
        SBinTre<Integer> tre = new SBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) tre.leggInn(verdi);
        System.out.println(tre.fjernAlle(4)); // 3
        tre.fjernAlle(7); tre.fjern(8);
        System.out.println(tre.antall()); // 5
        //System.out.println(tre + " " + tre.omvendtString());





        /*
//Lag et nytt binærtre
        SBinTre<Integer> tre =
                new SBinTre<>(Comparator.naturalOrder());
        int[] a = {10, 14, 6, 8, 1, 12, 7, 3, 11, 9, 13, 5, 2, 4};
        for (int verdi : a) { tre.leggInn(verdi); }
//Gjør om treet til et array
        ArrayList<Integer> data = tre.serialize();
//Lag nytt tre fra arrayet over
        SBinTre<Integer> tre2 = SBinTre.deserialize(data, Comparator.naturalOrder());
//Utskriften av tre og tre2 skal være identiske
        System.out.println(tre.toStringPostOrder());
        System.out.println(tre2.toStringPostOrder());




         */






        /*
        //Lag et nytt binærtre
        SBinTre<Integer> tre =
                new SBinTre<>(Comparator.naturalOrder());
        int[] a = {10, 14, 6, 8, 1, 12, 7, 3, 11, 9, 13, 5, 2, 4};
        for (int verdi : a) { tre.leggInn(verdi); }
//Gjør om treet til et array
        ArrayList<Integer> data = tre.serialize();
//Lag nytt tre fra arrayet over
        SBinTre<Integer> tre2 = SBinTre.deserialize(data, Comparator.naturalOrder());
//Utskriften av tre og tre2 skal være identiske
        System.out.println(tre.toStringPostOrder());
        System.out.println(tre2.toStringPostOrder());




         */


/*
        Integer[] a = {4,7,2,9,4,10,8,7,4,6};
        SBinTre<Integer> tre = new SBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) { tre.leggInn(verdi); }
        System.out.println(tre.antall()); // Utskrift: 10
        System.out.println(tre.antall(5)); // Utskrift: 0
        System.out.println(tre.antall(4)); // Utskrift: 3
        System.out.println(tre.antall(7)); // Utskrift: 2
        System.out.println(tre.antall(10)); // Utskrift: 1



 */


        /*
           test for oppgave 1:
        Integer[] a = {4,7,2,9,5,10,8,1,3,6};
        SBinTre<Integer> tre = new SBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) {tre.leggInn(verdi); }
        System.out.println(tre.antall()); // Utskrift: 10

         */
    }
}
