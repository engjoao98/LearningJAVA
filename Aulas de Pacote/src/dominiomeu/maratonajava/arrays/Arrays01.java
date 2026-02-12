package dominiomeu.maratonajava.arrays;

public class Arrays01 {
    static void main() {

        // type + [] + name = new* type [number]

        int [] ages = new int[3];  // create an object with 3 "spaces".

        ages [0] = 22;
        ages [1] = 31;  // The allocation always starts with bloc zero
        ages [2] = 33;

        // byte, long, float, double, int = 0
        // boolean = false
        // char = '  '
        // String = null

        System.out.println(ages[0]);
        System.out.println(ages[1]);  // The empty can be represented with "null = string" ou 0 = others
        System.out.println(ages[2]);  // Or, with the object does not exist = memory address number

        String names [] = new String[3];

        names[0] = "Michael";
        names[1] = "Mark";
        names[2] = "Josh";

        for (int i = 0; i < names.length; i++) {  //Automatic method to print all arrays
            System.out.println(names[i]);
        }

        //Another Ways - Foreach to print

        int [] numbers = new int[]{1, 2, 3, 4};
        int [] numbers1 = {4, 3, 2};

        for (int num : numbers) {      // The local variable "read" array
            System.out.println(num);
        }

    }
}
