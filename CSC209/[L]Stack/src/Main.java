/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(6);
        s.push(10);
        s.push(3001);
        s.push(4);
        System.out.println(s.pop() + " " + s.getSize());
        System.out.println(s.pop() + " " + s.getSize());
        System.out.println(s.pop() + " " + s.getSize());
        System.out.println(s.pop() + " " + s.getSize());
        System.out.println(s.pop() + " " + s.getSize());
        System.out.println(s.pop() + " " + s.getSize());
        System.out.println("-----Phase 2-----");
        AddLargeNumber bigInt = new AddLargeNumber(100);
        System.out.println(bigInt.add("120", "253"));
        System.out.println(bigInt.add("128", "293"));
        System.out.println(bigInt.add("999", "999"));
        System.out.println(bigInt.add("123456789012345678901234567890", "9876543210987654321098765432109876543210"));
        System.out.println(bigInt.add("111111111111111111111111111111111111111111111", "111111111111111111111111111111111111111111111")); 
        System.out.println(bigInt.add("5555555555555555555555555555555555555555555555555555555", "5555555555555555555555555555555555555555555555555555555")); 
    }
}