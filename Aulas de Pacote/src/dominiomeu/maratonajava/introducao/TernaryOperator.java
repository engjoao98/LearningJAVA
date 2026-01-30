package dominiomeu.maratonajava.introducao;

public class TernaryOperator {
    static void main() {

        // If payment > 2000 == pay
        // If payment <= 2000 == notPay

        // It is perfectly possible to do this with If and Else

        double payment = 2000;

        String pay = "I will pay you";
        String notPay = "I will not pay you";
        String result = payment > 2000 ? pay : notPay;

        System.out.println(result);

    }
}
