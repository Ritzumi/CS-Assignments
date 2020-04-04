public class FractionDriver {
    public static void main(String[] args) {
        // Test Constructors
        Fraction f1 = new Fraction();
        System.out.println(f1.toString());
        System.out.println("-------------------------");
        Fraction f2 = new Fraction(0.0, 1.0);
        System.out.println(f2.toString());
        System.out.println("-------------------------");
        Fraction f3 = new Fraction(20.1);
        System.out.println(f3.toString());
        System.out.println("-------------------------");
        Fraction f4 = new Fraction(-5,2);
        System.out.println(f4.toString());
        System.out.println("-------------------------");

        // Test Fraction with integer parameter
        System.out.println("Test Integer Input");
        System.out.println("-------------------------");
        f1.divide(2);
        System.out.println(f1.toString());
        System.out.println("-------------------------");
        f1.add(5);
        System.out.println(f1.toString());
        System.out.println("-------------------------");
        f1.substract(3);
        System.out.println(f1.toString());
        System.out.println("-------------------------");
        f1.multiply(850);
        System.out.println(f1.toString());
        System.out.println("-------------------------");
        f1.divide(75);
        System.out.println(f1.toString());
        System.out.println("-------------------------");
        f1.reduce();
        System.out.println(f1.toString());
        System.out.println("-------------------------");

        // Test Fraction with double parameter
        System.out.println("Test Double Input");
        System.out.println("-------------------------");
        f2.add(5.6);
        System.out.println(f2.toString());
        System.out.println("-------------------------");
        f2.substract(3.2);
        System.out.println(f2.toString());
        System.out.println("-------------------------");
        f2.multiply(85.3);
        System.out.println(f2.toString());
        System.out.println("-------------------------");
        f2.divide(64.2);
        System.out.println(f2.toString());
        System.out.println("-------------------------");
        f2.reduce();
        System.out.println(f2.toString());
        System.out.println("-------------------------");

        // Test Fraction with nominator and denominator parameter
        System.out.println("Test Fraction Input");
        System.out.println("-------------------------");
        f3.add(54, 2);
        System.out.println(f3.toString());
        System.out.println("-------------------------");
        f3.substract(34 , 6);
        System.out.println(f3.toString());
        System.out.println("-------------------------");
        f3.multiply(85, 10);
        System.out.println(f3.toString());
        System.out.println("-------------------------");
        f3.divide(43, 8);
        System.out.println(f3.toString());
        System.out.println("-------------------------");
        f3.reduce();
        System.out.println(f3.toString());
        System.out.println("-------------------------");
        // Test Fraction with negative value
        System.out.println("Test Negative value");
        System.out.println("-------------------------");
        f4.add(10,2);
        System.out.println(f4.toString());
        System.out.println("-------------------------");
        f4.substract(20, 2);
        System.out.println(f4.toString());
        System.out.println("-------------------------");
        f4.multiply(-65,2);
        System.out.println(f4.toString());
        System.out.println("-------------------------");
        f4.divide(10, 2);
        System.out.println(f4.toString());
        System.out.println("-------------------------");
        f4.reduce();
        System.out.println(f4.toString());
        System.out.println("-------------------------");
    }
}