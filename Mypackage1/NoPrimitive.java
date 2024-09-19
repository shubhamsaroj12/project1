public class NoPrimitive {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 500;
        num1.print();
    }
}

class Complex {
    int a, b;
    // int sum = a + b;

    void print() {
        System.out.println(a + "+" + b + "i");

    }
}
