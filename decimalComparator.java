public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double m, double n){

        if ((int) (m * 1000) == (int) (n * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}

// TEST:

public class Main {

    public static void main(String[] args) {
        boolean test1 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(test1);

        boolean test2 = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(test2);

        boolean test3 = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(test3);

        boolean test4 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(test4);
    }
}
