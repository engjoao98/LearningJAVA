package dominiomeu.maratonajava.introducao;

public class ConditionalStructures2 {
    static void main() {

        // If age < 15 == Children's
        // If age >= 15 && < 18 == Youth
        // If age >= 18 == Adult

        int age = 25;

        if (age < 15) {
            System.out.println("This player belongs to the Children's category.");
        } else {
            if (age >= 15 && age < 18) {
                System.out.println("This player belongs to the Youth category.");
            } else {
                System.out.println("This player belongs to the Adult category.");
            }
        }

        int age2 = 18;
        String category = "";

        if (age2 < 15) {
            category = ("This player belongs to the Children's category.");
        } else if (age2 >= 15 && age2 < 18) {
            category = ("This player belongs to the Youth category.");
        } else {
            category = ("This player belongs to the Adult category.");
        }

        System.out.println("\n" + category);
    }
}