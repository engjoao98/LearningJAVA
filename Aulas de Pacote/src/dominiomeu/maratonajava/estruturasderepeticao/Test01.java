package dominiomeu.maratonajava.estruturasderepeticao;

public class Test01 {
    static void main() {

        //Print par numbers --> 1000

        int number = 0;

       while(number <= 100){

           int result2 = number % 2;

           if(result2 == 0) {
               System.out.println("The number " + number + " is Par.");
               number = number + 1;
           }else{
               number = number + 1;
           }
       }

    }
}
