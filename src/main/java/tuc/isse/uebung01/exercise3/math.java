package exercise3;

/**
 * Methode zur Ausführung der Berechnung f(x,y,z) = 6 - x/2 + x*(y + z/x*y)
 * @author Thilo Blumenberg
 * @version 1.1 
*/

public class math {

    /**
     * Definition der Funktion f(x,y,z) = 6 - x/2 + x*(y + z/x*y)
     * @param x
     * @param y
     * @param z
     * @return
     */

    public static float fcn(int x, int y, int z){
        if(x == 0){
            return 0;
        } 
        else{

            float result = 6 - x/2 + x*(y + z/x*y); /* float result = 6 - x/2 + x*y + z/x*y;*/
            System.out.println("Ergebins: " + result);

            return result;
        }

    } 

    /**
     * Main Methode
     * @param args[0]: Operand 1 
     * @param args[1]: Operand 2
     * @param args[2]: Operand 3
     */
    public static void main(String[] args){
        fcn(Integer.parseInt(args[0]), Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
    
}
