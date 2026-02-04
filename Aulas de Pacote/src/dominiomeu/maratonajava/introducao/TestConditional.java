package dominiomeu.maratonajava.introducao;

public class TestConditional {
    static void main() {

        double bruteSalary = 20000;
        int currentYear = 2020;
        double taxes1 = 0.0970;
        double taxes2 = 0.3735;
        double taxes3 = 0.4950;
        
        double liquidSalary = 0;

        if(bruteSalary <= 34712){
            liquidSalary = bruteSalary * taxes1;
        } else if (bruteSalary > 34712 && bruteSalary <=68507) {
            liquidSalary = bruteSalary * taxes2;
        } else {
            liquidSalary = bruteSalary * taxes3;
        }

        System.out.println("The total amount of taxes that you will pay is $" + liquidSalary);
    }
    
}
