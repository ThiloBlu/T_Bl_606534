package tuc.isse.uebung03;

import java.util.Arrays;


import javax.swing.JOptionPane;

public class SpassMitArrays {

    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 4, 1, 3, 5 };
        int[] arr2 = { 2, 3, 4, 2, 2, 5 };

        String input = JOptionPane.showInputDialog("Monatsname", "Januar");

        Monat monat = StringToMonat(input);

        System.out.println("b) StringToMonat: " +  monat);

        if(monat==Monat.ERROR) {
            System.out.println("Eingabe "+ input + " falsch!");
            return;
        }

        int days = anzahlTage(monat);
        System.out.println("c) anzahlTage:" + days);

        int MAX= findeGroesstesElement(arr1);
        System.out.println("d) das Größte element :" + MAX);

        int[] evenOdd = splitEvenOdd(arr1);
        System.out.print("e) EvenOdd: ");
        for (int i = 0; i < evenOdd.length; i++) {
            System.out.print(evenOdd[i] + " ");
        }
        System.out.println();

        findeFehlendesElement(arr1, arr2);
        findeWiederholung(arr1);

        System.out.println("f) Fehlendes Element: "+ findeFehlendesElement(arr1, arr2));
        System.out.println("g) findeWiederholung: " + findeWiederholung(arr1));
        System.out.println("h) gemeinsameElemente:"+ Arrays.toString(findeGemeinsameElemente(arr1, arr2))); // Arrays.toString gibt alle Elemente des Arrays aus.

    }

    public static Monat StringToMonat(String input) {
        Monat result = Monat.ERROR;
        return result;
    }

    public static int anzahlTage(Monat monat) {
        return 0;
    }

    public static int findeGroesstesElement(int[] array) {
        return 0;
    }

    public static int[] splitEvenOdd(int array[]) {
        return array;
    }

    public static int findeFehlendesElement(int array1[], int array2[]) {
        return 0;
    }

    public static int findeWiederholung(int array[]) {
        return 0;
    }

    public static int[] findeGemeinsameElemente(int array1[], int array2[]) {
        return array1;
    }
}

