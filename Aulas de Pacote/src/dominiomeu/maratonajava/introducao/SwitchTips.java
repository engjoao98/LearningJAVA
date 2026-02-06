package dominiomeu.maratonajava.introducao;

public class SwitchTips {
    static void main() {

        // Press F = Female
        // Press M = Male

        char sex = 'M';

        switch (sex){
            case 'M': {
                System.out.println("Male");
                break;
            }
            case 'F': {
                System.out.println("Female");
                break;
            }
            default: {
                System.out.println("Invalid");
                break;
            }
        }

        String key = "HOMEWORK1";

        switch (key){
            case "HOMEWORK":{
                System.out.println("Congrats !");
                break;
            }
            default: {
                System.out.println("Wrong Pass, please, try again!");
                break;
            }
        }


    }
}
