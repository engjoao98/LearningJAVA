package dominiomeu.maratonajava.estruturasderepeticao;


    // The test consists of creating a setup to check how many times it is possible to
    // divide the value of a car by a thousand; I added remainders, input, and other things.


public class TestBreak1 {
    static void main() {

        double carPrice = 30000;
        double minimumCote = 1000;
        double parcilResult = 0;
        int divisionTimes = 0;
        double rest = 0;

        if (carPrice < minimumCote){
            System.out.println("The amount is not enough to be split.");
        }else {

            while (carPrice >= minimumCote) {
                parcilResult = carPrice / minimumCote;
                carPrice = carPrice - minimumCote;


                if (carPrice < minimumCote) {
                    rest = rest + carPrice;

                    if (rest > 0) {
                        System.out.println("A " + rest + " down payment will be required.");
                    }
                }

                divisionTimes += 1;

            }

            System.out.println("The remainder/totally will be split into " + divisionTimes + " equal installments.");
        }

    }

}
