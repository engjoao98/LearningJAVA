package dominiomeu.maratonajava.introducao;

public class SwitchTipsTest {
    static void main() {

        // Print if the day (1 to 7) is Weekday or Weekend
        // Consider 1 == Sunday

        byte day = 2;

        switch (day){
            case 1, 7:{
                System.out.println("Weekend");
                break;
            }
            case 2, 3, 4, 5, 6: {
                System.out.println("Weekday");
                break;
            }
            default:{
                System.out.println("Invalid number");
                break;
            }
        }



    }
}
