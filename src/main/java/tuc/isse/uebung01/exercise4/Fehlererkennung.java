package exercise4;

import javax.swing.JOptionPane;
/**
* Klasse mit Fehlern.
* @author Fehlererkennung
*
*/
public class Fehlererkennung {
    public static void main (String[] args) {
        String input1 = JOptionPane.showInputDialog ("Bitte geben Sie Eingabe A");
        String input2 = JOptionPane.showInputDialog ("Bitte geben Sie Eingabe B");
        int x1 = Integer.parseInt(input1); /*error: class expected float x1 = char.parseInt(input1); */
        int x2 = Integer.parseInt(input2); 
        System.out.println("Before swapping, A = " + x1 + ", B = " + x2); /* error: ';' expected & error: ')' expected */
        swap(x1, x2); /*  error: incompatible types: possible lossy conversion from float to int */
    }
    public static void swap(int x1, int x2) {
        int x3 = x1; /* (the redundant variable x3 is correctly defined and not used) error: cannot find symbol */
        x1 = x2;
        x2 = x3;
        System.out.println("After swapping, A = " + x1 + " , B = " + x2); /*error: ')' expected */
    }
}
