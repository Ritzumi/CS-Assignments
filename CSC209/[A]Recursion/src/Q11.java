/**
 * Q11
 */
public class Q11 {

    public static void main(String[] args) {
        new Q11().r_cubes(8);
    }

    void cubes(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(i * i * i + " ");
    }

    public void r_cubes(int n){
        if(n == 1){
            System.out.print(1 + " ");
        } else {
            r_cubes(n-1);
            System.out.print(n*n*n + " ");
        }
    }

}