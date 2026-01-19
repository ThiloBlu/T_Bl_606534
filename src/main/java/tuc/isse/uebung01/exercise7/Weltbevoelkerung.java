package tuc.isse.uebung01.exercise7;

import javax.swing.JOptionPane;

public class Weltbevoelkerung {
    public static void main(String[] args)
    {   
        int input = Integer.parseInt(JOptionPane.showInputDialog("Bitte übergeben Sie ein n zur Ausgabe der n-ten Zahlen bei der Numerierung aller Menschen der Weltbevoelkerung.", 50000));
        if(input<50000){
            input = 50000;
            System.out.println("n wurde zu Zwecken der Zeitoptimierung der Numerierung auf 100.000 gesetzt. Ihre Eingabe war in dieser Hinsicht zu niedrig.");
        }

        for (long i =0; i < 7694561082L; i+=input) {
            System.out.println(i);
        }
    }
}

/*
Variable Längenrepräsentation(Variable-width representation):

In einer mischtypisierten Form der Speicherung wären es 
(2 bit+256*8 bit+65535*16 bit +4294967296*32 bit+3399527993*64 bit)/(8*1000000000 bit/GB) = 41.32857961044646799564361572265625 GB
unter Verwendung der Typen boolean, byte, short, int, long

Einheitlicher Datentyp:

7694561082*64 bit/(8*1000000000 bit/GB) = 57.32894749939441680908203125 GB


*/