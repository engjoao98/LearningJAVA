package dominiomeu.maratonajava.estruturasderepeticao;

public class Test2Break {
    static void main() {

        // Print the first 25 numbers

        /*int firstNumber = 25;
        int lastNumber = 100;
        int currentNumber = firstNumber;
        int position = firstNumber + 25;

        while (currentNumber >= firstNumber && currentNumber <= lastNumber){
            if(currentNumber <= position){
                System.out.println(currentNumber);
                currentNumber = currentNumber + 1;
            }else {
                currentNumber = currentNumber + 1;
            }
        }*/

        int fNumber = 50;
        int lNumber = 100;

        for (int i = fNumber; i <= lNumber; i++) {

            int position = fNumber + 25;

            if(i <= position) {
                System.out.println(i);
            } else {
                break;
            }


        }


    }
}
