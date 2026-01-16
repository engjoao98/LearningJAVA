package dominiomeu.maratonajava.introducao;

public class PrimitiveTips {
    static void main() {

        int momAge = 10;
        long bigNumber = 100000;
        double bigDecimalNumber = 10.2;
        float decimalNumber = 1;
        byte minimalLittleNumber = 10;
        short littleNumber = 10;
        boolean v = true;
        boolean f = false;
        char letter = 65;


        System.out.println(momAge + " = int (int + little size)");
        System.out.println(bigNumber + " = long (int + big size)");

        System.out.println(bigDecimalNumber + " = double (dec + big size)");
        System.out.println(decimalNumber + " = float (dec + little size)");

        System.out.println(minimalLittleNumber + " = byte (int + little little size)");
        System.out.println(littleNumber + " = short (int + little size)");

        System.out.println(v + " = boolean v (true)");
        System.out.println(f + " = boolean f (false)");

        System.out.println(letter + " = char (ASCII 65)");

        // Trying to do casting on tips
        //
        // int testMom = (int) 10000000000D;
        //
        // float testSon = (float) 100.2D;
        //
        // System.out.println(testMom);
        // System.out.println(testSon);
    }
}
