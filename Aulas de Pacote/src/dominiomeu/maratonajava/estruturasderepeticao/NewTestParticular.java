package dominiomeu.maratonajava.estruturasderepeticao;

public class NewTestParticular {
    static void main() {

        double productValue = 2000;
        double installment = 0;

        for (int i = 1; i <= 12 ; i++) {

            installment = productValue / i;

            System.out.println(i + " installment x " + "$" + installment);

            installment = installment - productValue;
        }

    }
}
