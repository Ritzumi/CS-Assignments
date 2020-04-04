package end2019;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student_num = sc.nextInt();
        int question_num = sc.nextInt();
        ArrayList<Integer> student = new ArrayList<>();
        for (int i = 0; i < student_num; i++) {
            student.add(sc.nextInt());
        }
        for (int i = 0; i < question_num; i++) {
            int temp = sc.nextInt();
            isHappy(temp,student);
        }
        sc.close();
    }

    public static void isHappy(int target, ArrayList<Integer> student){
        boolean isMatch = false;
        for (int i = 0; i < student.size(); i++) {
            ArrayList<Integer> student2 = new ArrayList<>(student);
            int temp = target;
            temp -= student2.get(i);
            student2.remove(i);
            if(student2.contains(temp)){
                isMatch = true;
                break;
            }
        }
        if(isMatch){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }



}