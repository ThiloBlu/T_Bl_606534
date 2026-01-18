package exercise3;

public class math {
    
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
    public static void main(String[] args){
        fcn(Integer.parseInt(args[0]), Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
    
}
