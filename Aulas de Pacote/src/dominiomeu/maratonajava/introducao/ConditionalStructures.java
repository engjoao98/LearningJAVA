package dominiomeu.maratonajava.introducao;

public class ConditionalStructures {
    static void main() {

        int age = 18;

        if (age >= 18){
            System.out.println("Authorized to buy alcoholic");
        }

        if (age < 18){
            System.out.println("Not Authorized to buy alcoholic ");
        }

        int age2 = 18;
        boolean verifyAge = age2 >= 18;

        if (verifyAge){
            System.out.println("Authorized to buy alcoholic 2");
        }

        if (!verifyAge){
            System.out.println("Not Authorized to buy alcoholic 2");
        }
    }
}
