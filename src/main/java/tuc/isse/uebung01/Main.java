package tuc.isse.uebung01;

/**
 * Klasse zur Funktionendefinition
 */
class Heart {
/**
 * Funktion zur Ausgabe eines Herzens
 */
    static void printheart(){
        System.out.println(
            " __  __ \n"+
            "/  \\/  \\ \n"+
            "\\      / \n" +
            " \\    / \n"+
            "  \\  / \n"+
            "   \\/ \n"
        );
    }
/**
 * Funktion(vom Typ void) zur Berechnung und Ausgabe von f(a,b)=(a*b)-(a+b)
 * @param a 
 * @param b
 */
    static void diff(int a, int b){
        int result = (a*b)-(a+b);
        System.out.println("Ergebnis: "+result);
    }
}

/**
 * Definition des Hauptprogramms
 */
public class Main {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("I heart you");
        Heart.printheart();
        Heart.diff(x, y);

    }
}
