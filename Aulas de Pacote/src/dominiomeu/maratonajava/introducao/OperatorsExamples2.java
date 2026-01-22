package dominiomeu.maratonajava.introducao;

public class OperatorsExamples2 {
    static void main() {

        // The rest operator %
        int isTenParNumber = 10 % 2;
        System.out.println("\nisTenParNumber 0 = true / 1 = false --> " + isTenParNumber);

        // The relational operators (< > <= >= == =!) -- All this ever return boolean values
        boolean isTenMoreThanTwenty = 10 > 20;
        boolean isTenMinorThanTwenty = 10 < 20;
        boolean isTenMoreEqualThanTwenty = 10 >= 20;
        boolean isTenMinorEqualThanTwenty = 10 <= 20;
        boolean isTenEqualThanTwenty = 10 == 20;
        boolean isTenNotEqualThanTwenty = 10 != 20;

        System.out.println("\nisTenMoreThanTwenty => " + isTenMoreThanTwenty);
        System.out.println("isTenMinorThanTwenty => " + isTenMinorThanTwenty);
        System.out.println("isTenMoreEqualThanTwenty => " + isTenMoreEqualThanTwenty);
        System.out.println("isTenMinorEqualThanTwenty => " + isTenMinorEqualThanTwenty);
        System.out.println("isTenEqualThanTwenty => " + isTenEqualThanTwenty);
        System.out.println("isTenNotEqualThanTwenty => " + isTenNotEqualThanTwenty);

        // The Logical Operators ==> (&& = AND) / (|| = OR) -- All this ever return boolean values
        int number01 = 30;
        int number02 = 35;
        int number03 = 38;
        int number04 = 37;

        boolean n3MoreN4AndN2MoreN1 = number03 > number04 && number02 > number01;
        boolean n4MoreN3AndN1MoreN2 = number04 > number03 && number01 > number02;

        System.out.println("\nn3MoreN4AndN2MoreN1 ==> " + n3MoreN4AndN2MoreN1);
        System.out.println("n4MoreN3AndN1MoreN2 ==> " + n4MoreN3AndN1MoreN2);

        boolean n3MoreN4OrN2MoreN1 = number03 > number04 || number02 > number01;
        boolean n4MoreN3OrN1MoreN2 = number04 > number03 || number01 > number02;

        System.out.println("\nn3MoreN4OrN2MoreN1 ==> " + n3MoreN4OrN2MoreN1);
        System.out.println("n4MoreN3OrN1MoreN2 ==> " + n4MoreN3OrN1MoreN2);

    }
}
