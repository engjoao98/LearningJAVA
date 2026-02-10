package dominiomeu.maratonajava.estruturasderepeticao;

public class Repetition01 {
    static void main() {

        //while, do while and for (3 structures)

        int cont1 = 0;

        while(cont1 <= 10){
            System.out.println("Using while the cont1 is " + cont1);
            cont1 = cont1 + 1;
        }

        int cont2 = 0;

        do {
            System.out.println("Using do while the cont2 is " + cont2);
            cont2 = cont2 + 1;
        } while (cont2 <= 10);

        for(int i = 0;i <= 10;i = i + 1){
            System.out.println("Using for the i is " + i);
        }
    }
}
