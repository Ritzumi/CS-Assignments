package end2019;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room_num = sc.nextInt();
        int guest_num = sc.nextInt();
        Integer[] room = new Integer[room_num];
        Integer[] room_time = new Integer[room_num];
        Arrays.fill(room_time, 0);
        for (int i = 0; i < room.length; i++) {
            room[i] = sc.nextInt();
        }
        int max = new TreeSet<>(Arrays.asList(room)).last();
        Integer[] order = new Integer[guest_num];
        Integer[] order_time = new Integer[guest_num];
        for (int i = 0; i < guest_num; i++) {
            order[i] = sc.nextInt();
            order_time[i] = sc.nextInt();
        }
        for (int i = 0; i < guest_num; i++) {
            int guest = order[i];
            int time = order_time[i];
            if (max - guest < 0) {
                System.out.println("-1");
            } else {
                int index = bestRoom(guest, room, room_time);

                System.out.println(index+1 + " " + room_time[index]);
                room_time[index] += time;
            }

        }
        sc.close();
    }

    public static int bestRoom(int guest, Integer[] room, Integer[] room_time) {
        int index = 0;
        for (int i = 0; i < room.length; i++) {
            int dindex = room[index] - guest < 0 ? Integer.MAX_VALUE : room[index] - guest;
            int di = room[i] - guest;
            if(dindex < 0){
                continue;
            }
            if(di < 0){
                continue;
            }
            if(dindex > di){
                index = i;
            }
            if(di == 0){
                break;
            }

        }
        for (int i = 0; i < room.length; i++) {
            if(room[index] == room[i] && room_time[index] > room_time[i]){
                index = i;
            }
        }
        return index;
    }
}