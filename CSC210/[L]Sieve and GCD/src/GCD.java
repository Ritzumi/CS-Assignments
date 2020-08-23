public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD_BruteForce(60,90));
        System.out.println(GCD_Factor(99,90));
        System.out.println(GCD_commonFactor(90,12));
        int[] prime = new int[100];
        sieveOfEratosthenes(100, prime);
        for (int i:
             prime) {
            if (i != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static int GCD_BruteForce(int n1, int n2){
        int result = 1;
        for (int i = 2; i <= Math.min(n1, n2); i++) {
            if (n1%i == 0 && n2%i == 0){
                result = i;
            }
        }
        return result;
    }

    public static int GCD_Factor(int n1, int n2){
        int result = 1;
            for (int i = 2; i <= Math.min(n1, n2); i++) {
                while (n1%i == 0 && n2%i == 0){
                    result *= i;
                    n1 /= i;
                    n2 /= i;
                }
            }
        return result;
    }

    public static void sieveOfEratosthenes(int n, int[] L){
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int p = 2; p < (int) Math.sqrt(n); p++) {
            if (arr[p] != 0){
                int j = p*p;
                while (j <= n){
                    arr[j] = 0;
                    j = j+p;
                }
            }
            
        }

        for (int i = 0, p =2; p <= n; p++) {
            if(arr[p] != 0){
                L[i] = arr[p];
                i++;
            }
        }
    }

    public static int GCD_commonFactor(int n1, int n2){
        int answer = 1;
        int[] n1_factors = new int[(int)(Math.log10(n1)/Math.log10(2))+1];
        int[] n2_factors = new int[(int)(Math.log10(n2)/Math.log10(2))+1];

        factoring(n1 ,n1_factors);
        factoring(n2, n2_factors);

//        for (int i = 0, usage = 0; i < n1_factors.length && n1_factors[i] != 0; i++) {
//            for (int j = usage; j < n2_factors.length && n2_factors[j] != 0 && n2_factors[j] <= n1_factors[i]; j++) {
//                if (n1_factors[i] == n2_factors [j]){
//                    answer *= n1_factors[i];
//                    usage++;
//                    break;
//                }
//            }
//        }

        int pn1 = 0, pn2 = 0;
        while ((n1_factors[pn1] != 0 && n2_factors[pn2] != 0)){
//             && (pn1 != n1_factors.length && pn2 != n2_factors.length )
            if(n1_factors[pn1] == n2_factors [pn2]){
                answer *= n1_factors[pn1];
                pn1++;
                pn2++;
            } else if (n1_factors[pn1] < n2_factors[pn2]){
                pn1++;
            } else {
                pn2++;
            }
        }
    return answer;
    }

    public static void factoring(int num, int[]  arr){
        for (int i = 2, count = 0; i <= num; i++) {
            while (num%i == 0){
                arr[count] = i;
                count++;
                num /= i;
            }
        }
    }
}
