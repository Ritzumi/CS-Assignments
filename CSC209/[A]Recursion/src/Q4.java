/**
 * Q4a.
 */
public class Q4 {

    public static void main(String[] args) {
        System.out.println(new Q4().odd(10));
    }

    public String odd(int n) {
        n = n % 2 == 0 ? n - 1 : n;
        return odd_innner(n);
    }

    public String odd_innner(int n) {
        if (n == 1) {
            return "1";
        } else {
            return odd_innner(n - 2) + String.valueOf(n);
        }
    }

    public String odd_innner2(int n) {
        if (n == 1) {
            return "1";
        } else {
            return String.valueOf(n) + odd_innner(n - 2);
        }
    }
}