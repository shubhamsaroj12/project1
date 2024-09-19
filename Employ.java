class Shubham {
    private int empid = 3;
    private int ph;
    private String name;
    private int basicsal = 20000;
    private int incentive = 200;

    void countsalaries() {
        System.out.println(basicsal + incentive);
    }

    // getter & setter
    int getph() {
        return ph = 345678989;
    }

    String getName() {
        return name = "shubham";

    }

    int setph() {
        return ph = 98765432;
    }

    String setName() {
        return name = "shubham,sdxfcgvhjblk";
    }
}

public class Employ {
    public static void main(String[] args) {
        Shubham engineer = new Shubham();
        // System.out.println(engineer.getph());
        // System.out.println(engineer.getName());
        System.out.println(engineer.setph());
        System.out.println(engineer.setName());
    }
}
