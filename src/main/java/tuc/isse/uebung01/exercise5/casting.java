package exercise5;

public class casting {
    public static void cast_char_to_float(char x, char y){
        System.out.println((float) x + y);
    }
    public static void cast_to_float(int x){
        long number = x;
        System.out.println((float) number);
    }
    public static void cast_to_double(int x, short y, byte z){
        double number3 = x / y + z;
        System.out.println(number3);
    }

    public static void main(String[] args){
        char signV = 'V';
        char signw = 'w';
        System.out.println(signV);
        cast_char_to_float(signV, signw);
        int var = (int) 3.215621e5;
        cast_to_float(var);
        short var2 = (short) 7.5;
        byte var3 = (byte) 257;
        int var4 = (int) 3000;
        System.out.println(var2);
        cast_to_double(var4, var2, var3);
    }
    
}

/*
Java types:

integral Number types:
    boolean 1-bit
    char 16-bit from 0 to 65,535 (only natural numbers)
    byte 8-bit from -128 to 127
    short 16-bit from -32,768 to 32,767
    int 32-bit from  -2,147,483,648 to 2,147,483,647
    long 63-bit from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

floating point Numbers:
    float 32-bit
    double 64-bit

a)

'V' has ASCII/Unicode value 86

'w' has ASCII/Unicode value 119

(float)86 + 119 → 86.0f + 119.0f = 205.0


b)

3.215621e5 is a double literal → 321562.1

(int) 321562.1 truncates → 321562

Converting that to float prints 321562.0


c)

Arithmetic uses at least int, so x / y is integer division.

x / y occurs before adding z.

Final result is stored in double.

*/
