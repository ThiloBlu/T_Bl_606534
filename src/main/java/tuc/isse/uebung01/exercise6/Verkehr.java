package exercise6;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Verkehr {

    public static final double V  = 0;

    /**
     * Fragt Xs, Vx, und A ab und ruft alle methoden aus.
     * @param args
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Xs");
        double Xs = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Vx");
        double Vs = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("A");
        double A = Double.parseDouble(input);

        System.out.println("Mindesthaltezeit:"+minstopTime(Vs, A));
        System.out.println("Mindestabstandes:"+minDistance(Xs, Vs, A));

        int number = (int)Xs;

        readWord(number);
        System.out.println("sumOfSquares:"+sumOfSquares(number));
        System.out.println("sumAndCount:"+sumAndCount(number));
        frequencys(number);
    }

    /**
     * a) Hier wied die Mindesthaltezeit berechnet.
     * @param Vs
     * @param A Dabei soll A negativ sein.
     * @return Mindesthaltezeit
     */
    public static double minstopTime(double Vs, double A) {
        if(A<0){
            return (V - Vs)/A;
        }
        else{
            return Double.POSITIVE_INFINITY;
        }
    }

    /**
     * b) Hier wied die Mindestabstandes berechnet.
     * @param Xs
     * @param Vs
     * @param A Dabei soll A negativ sein.
     * @return
     */
    public static double minDistance(double Xs, double Vs, double A) {
        if(A<0){
            return Xs + (Math.pow(V,2) - Math.pow(Vs,2))/(2*A);
        }
        else{
            return Double.POSITIVE_INFINITY;
        }
    }

    /**
     * c) Erhält eine Zahl und gibt die Eingabe als Text aus. (z.B. Eingabe: 30, Ausgabe: Drei Null)
     * @param number
     */
    public static void readWord(int number) {
        String s = String.valueOf(number);
        
        System.out.print("readWord:");
        for(int i=0; i<s.length(); i++){

            switch (s.charAt(i)) {
                case '0':
                    System.out.print("Null ");
                    break;
                case '1':
                    System.out.print("Eins ");
                    break;
                case '2':
                    System.out.print("Zwei ");
                    break;
                case '3':
                    System.out.print("Drei ");
                    break;
                case '4':
                    System.out.print("Vier ");
                    break;
                case '5':
                    System.out.print("Fünf ");
                    break;
                case '6':
                    System.out.print("Sechs ");
                    break;
                case '7':
                    System.out.print("Sieben ");
                    break;
                case '8':
                    System.out.print("Acht ");
                    break;
                case '9':
                    System.out.print("Neun ");
                    break;
            
                default:
                    break;
            }
        }
    }

    /**
     * d) Berechnet die Summe i*i.
     * @param number
     * @return
     */
    public static int sumOfSquares(int number) {
        int sum = 0;
        for(int i = 1; i<=number; i++){
            sum += i*i;
        }
        return sum;
    }

    /**
     * e) Berechnet die Anzahl und Summe aller ganzen Zahlen zwischen 73 und 220 die durch Xs teilbar sind.
     * @param Xs
     * @return
     */
    public static int[] sumAndCount(int Xs) {
        int sum = 0;
        int k=0;
        for(int i = 73; i <= 220; i++){
            if(i%Xs==0){
                sum += i;
                k += 1;
            }
            else{
                continue;
            }
        }
        System.out.println(k);
        System.out.println(sum);
        int[] result = {k,sum};
        return result;
    }

    /**
     * f) Die Methode bekommt eine Integer Zahl Uebergeben (z.B. 133135)
     * und zahlt die einzelnen ziffer (i.B. 0=0, 1=2, 2=0, 3=3, 4=0, 5=1, 6=0, 7=0, 8=0, 9=0).
     * Erstellen Sie eine entsprechende Konsolenausgabe.
     * @param number
     */
    public static void frequencys(int number) {
        int[] freq = new int[10]; 

        String s = String.valueOf(number);
        
        System.out.print("readWord:");
        for(int i=0; i<s.length(); i++){

            switch (s.charAt(i)) {
                case '0':
                    freq[0]++;
                    break;
                case '1':
                    freq[1]++;
                    break;
                case '2':
                    freq[2]++;
                    break;
                case '3':
                    freq[3]++;
                    break;
                case '4':
                    freq[4]++;
                    break;
                case '5':
                    freq[5]++;
                    break;
                case '6':
                    freq[6]++;
                    break;
                case '7':
                    freq[7]++;
                    break;
                case '8':
                    freq[8]++;
                    break;
                case '9':
                    freq[9]++;
                    break;
            
                default:
                    break;
            }
        }

        System.out.print("fequencys: 0="+freq[0]);
        System.out.print(" ,1="+freq[1]);
        System.out.print(" ,2="+freq[2]);
        System.out.print(" ,3="+freq[3]);
        System.out.print(" ,4="+freq[4]);
        System.out.print(" ,5="+freq[5]);
        System.out.print(" ,6="+freq[6]);
        System.out.print(" ,7="+freq[7]);
        System.out.print(" ,8="+freq[8]);
        System.out.print(" ,9="+freq[9]);
    }

}
