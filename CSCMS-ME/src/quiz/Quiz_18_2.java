package quiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Quiz_18_2 {
    public static void main(String[] args) {
        HashSet<Integer> done = new HashSet<>();
        Stack<BacteriaPod> biolab = new Stack<>();
        Scanner sc = new Scanner(System.in);
        BacteriaPod.target = sc.nextInt();
        sc.close();
        BacteriaPod.min_bac = BacteriaPod.target;

        for (int i = 1; i <= (BacteriaPod.target-1)/2 ; i++) {
            biolab.push(new BacteriaPod(i, i));
        }
        while(!biolab.empty()){
            BacteriaPod temp = biolab.pop();
            temp.multiply();

            if(temp.nowbac > BacteriaPod.target || temp.usedbac > BacteriaPod.min_bac){

            } else if (temp.nowbac == BacteriaPod.target){
                if(temp.usedbac < BacteriaPod.min_bac){
                    BacteriaPod.min_bac = temp.usedbac;
                }
            } else {
                for (int i = 0; i <= (BacteriaPod.target - temp.nowbac -1)/2 ; i++) {
                        biolab.push(new BacteriaPod(temp.nowbac+i, temp.usedbac+i));
                }
            }

        System.out.print(temp.usedbac + " ");
        }
        System.out.println();
        System.out.println(BacteriaPod.min_bac);
    }
}

class BacteriaPod{
    static int target;
    static int min_bac;
    int usedbac;
    int nowbac;

    public BacteriaPod(int bac, int used) {
        this.usedbac = used;
        this.nowbac = bac;
    }

    public void multiply(){
        nowbac *= 2;
    }

    public void addbac(int colony){
        usedbac += colony;
        nowbac += colony;
    }

}