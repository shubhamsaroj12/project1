//package Mypackage1;

/**
 * Test
 */
class employ {
    // static= mean in access of allocate
    int empid = 23;
    // static int basicsal = 20000;
    int basicsal = 20000;
    int incentive = 200;

    void countsalaries() {
        System.out.println(basicsal + incentive);
    }

}

public class Test {

    public static void main(String[] args) {
        System.out.println(employ.incentive);

    }
}