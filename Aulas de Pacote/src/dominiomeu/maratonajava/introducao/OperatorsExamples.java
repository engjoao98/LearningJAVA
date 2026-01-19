package dominiomeu.maratonajava.introducao;

public class OperatorsExamples {
    static void main() {

        int number1 = 10;
        int number2 = 20;
        double number3 = 20;

        // +*/- The Arithmetic Operators

        int result = number1 + number2;

        // Casting can be applied

        System.out.println(result);
        System.out.println(number2-number1);
        System.out.println(number2/number1);
        System.out.println(number1/number3);

        // + operator has multiple functions depending on the presence of string

        System.out.println(number1+number2);
        System.out.println("String add " + number1+number2);
    }
}
