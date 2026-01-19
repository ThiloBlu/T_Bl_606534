package tuc.isse.uebung01.exercise8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;



import javax.swing.JOptionPane;



public class SpassMitArrays {

    enum Monat{
        JANUAR, FEBRUAR, MEARZ, APRIL, MAI, JUNI,JULI,AUGUST,
        SEPTEMBER,OKTOBER,NOVEMBER,DEZEMBER, ERROR
    }

    private static Map<String, Monat> s_to_M = Map.ofEntries(
        Map.entry("Januar", Monat.JANUAR),
        Map.entry("Februar", Monat.FEBRUAR),
        Map.entry("März", Monat.MEARZ),
        Map.entry("Mearz", Monat.MEARZ),
        Map.entry("April", Monat.APRIL),
        Map.entry("Mai", Monat.MAI),
        Map.entry("Juni", Monat.JUNI),
        Map.entry("Juli", Monat.JULI),
        Map.entry("August", Monat.AUGUST),
        Map.entry("September", Monat.SEPTEMBER),
        Map.entry("Oktober", Monat.OKTOBER),
        Map.entry("November", Monat.NOVEMBER),
        Map.entry("Dezember", Monat.DEZEMBER)
    );

    private static int[] M_to_days = {31,28,31,30,31,30,31,31,30,31,30,31,0};

    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 4, 1, 3, 5 };
        int[] arr2 = { 2, 3, 4, 2, 2, 5 };
        int[] arrnr = { 3, 4, 1, 5 };
        int[] test = {4,3,4,4};

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
        int[] evenOdd2 = splitEvenOdd(test);
        System.out.print("e) EvenOdd: ");
        for (int i = 0; i < evenOdd2.length; i++) {
            System.out.print(evenOdd2[i] + " ");
        }

        System.out.println();

        findeFehlendesElement(arr1, arr2);
        findeWiederholung(arr1);
        findeWiederholung(arrnr);

        System.out.println("f) Fehlende Elemente: "+ findeFehlendesElement(arr1, arr2));
        System.out.println("g) findeWiederholung: " + findeWiederholung(arr1));
        System.out.println("g) findeWiederholung: " + findeWiederholung(arrnr));
        System.out.println("h) gemeinsameElemente:"+ Arrays.toString(findeGemeinsameElemente(arr1, arr2))); // Arrays.toString gibt alle Elemente des Arrays aus.

    }

    public static Monat StringToMonat(String input) {
        Monat result = s_to_M.getOrDefault(input,Monat.ERROR);
        return result;
    }

    public static int anzahlTage(Monat monat) {
        return M_to_days[monat.ordinal()];
    }

    public static int findeGroesstesElement(int[] array) {
        int max = array[0];
        for(int i = 0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
            else{
                continue;
            }
        }
        return max;
    }

    public static int[] splitEvenOdd(int array[]) {
        int odd_index = 0;
        for(int i = 0;i<array.length;i++){
            if(i==0){
                if(array[i]%2==0){
                    odd_index++;
                }
                continue;
            }
            if(array[i]%2==0){
                int temp = array[i];
                array[i]=array[odd_index];
                array[odd_index]=temp;
                odd_index++;
                continue;
            }
            else{
                continue;
            }
        }
        return array;
    }

    public static HashSet<Integer> findeFehlendesElement(int array1[], int array2[]) {
        HashSet<Integer> missing = new HashSet<Integer>();
        for(int i = 0;i<array1.length;i++){
            int temp = array1[i];
            missing.add(temp);
            for(int k = 0;k<array2.length;k++){
                if(array2[k]==temp){
                    missing.remove(temp);
                    break;
                }
                else{
                    continue;
                }
            }
        }
        for(int i = 0;i<array2.length;i++){
            int temp = array2[i];
            missing.add(temp);
            for(int k = 0;k<array1.length;k++){
                if(array1[k]==temp){
                    missing.remove(temp);
                    break;
                }
                else{
                    continue;
                }
            }
        }
        return missing;
    }

    public static HashSet<Integer> findeWiederholung(int array[]) {
        HashSet<Integer> redundancies = new HashSet<Integer>();
        for(int i = 0;i<array.length;i++){
            int temp = array[i];
            
            for(int k = i+1;k<array.length;k++){
                if(array[k]==temp){
                    redundancies.add(temp);
                    break;
                }
                else{
                    continue;
                }
            }
        }
        if(redundancies.isEmpty()){
            redundancies.add(-1);
        }

        return redundancies;
    }

    public static int[] findeGemeinsameElemente(int array1[], int array2[]) {
        int[] temp = new int[array1.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            int val = array1[i];
            
            boolean inArray2 = false;
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == val) {
                    inArray2 = true;
                    break;
                }
            }
            
            boolean alreadyAdded = false;
            for (int k = 0; k < count; k++) {
                if (temp[k] == val) {
                    alreadyAdded = true;
                    break;
                }
            }
            if (inArray2 && !alreadyAdded) {
                temp[count] = val;
                count++;
            }
        }

        
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }



        return result;
    }
}

