package tuc.isse.uebung01;

import javax.swing.JOptionPane;

public class Verkehr {

    public static final double  = 0;

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
        return 0;
    }

    /**
     * b) Hier wied die Mindestabstandes berechnet.
     * @param Xs
     * @param Vs
     * @param A Dabei soll A negativ sein.
     * @return
     */
    public static double minDistance(double Xs, double Vs, double A) {
        return 0;
    }

    /**
     * c) Erhält eine Zahl und gibt die Eingabe als Text aus. (z.B. Eingabe: 30, Ausgabe: Drei Null)
     * @param number
     */
    public static void readWord(int number) {
        System.out.print("readWord:");
        System.out.println("");
    }

    /**
     * d) Berechnet die Summe i*i.
     * @param number
     * @return
     */
    public static int sumOfSquares(int number) {
        return 0;
    }

    /**
     * e) Berechnet die Anzahl und Summe aller ganzen Zahlen zwischen 73 und 220 die durch Xs teilbar sind.
     * @param Xs
     * @return
     */
    public static int sumAndCount(int Xs) {
        return 0;
    }

    /**
     * f) Die Methode bekommt eine Integer Zahl Uebergeben (z.B. 133135)
     * und zahlt die einzelnen ziffer (i.B. 0=0, 1=2, 2=0, 3=3, 4=0, 5=1, 6=0, 7=0, 8=0, 9=0).
     * Erstellen Sie eine entsprechende Konsolenausgabe.
     * @param number
     */
    public static void frequencys(int number) {
        System.out.print("fequencys: 0="+0);
        System.out.print(" ,1="+0);
        System.out.print(" ,2="+0);
        System.out.print(" ,3="+0);
        System.out.print(" ,4="+0);
        System.out.print(" ,5="+0);
        System.out.print(" ,6="+0);
        System.out.print(" ,7="+0);
        System.out.print(" ,8="+0);
        System.out.println(" ,9="+0);
    }

}
