package dominiomeu.maratonajava.introducao;

public class AssignmentOperators {
    static void main() {

    // = += -= *= %= /=
    double bonus = 1000;
    double adBonus = 10;

    bonus = bonus + adBonus;
    bonus += 10;

        System.out.println(++bonus);
        System.out.println(bonus++);
        System.out.println(bonus);

    }
}
