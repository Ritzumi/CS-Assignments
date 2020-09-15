import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        int[][] table = {
                {7,0,0,5,8,3,0,0,6},
                {0,0,6,0,0,1,4,0,5},
                {0,5,2,0,0,6,0,8,3},
                {3,0,0,2,0,0,9,5,8},
                {5,0,0,0,7,8,0,6,0},
                {6,4,8,0,1,0,3,0,0},
                {0,6,0,8,0,2,5,0,0},
                {0,0,3,1,5,0,0,7,2},
                {2,1,5,6,0,0,0,3,0}
        };
        int filled = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (table[i][j] != 0){
                    filled++;
                }
            }
        }

        System.out.println(filled);

        while (filled < 81){
            for (int i = 0; i < 9 && filled < 81; i++) {
                for (int j = 0; j < 9 && filled < 81; j++) {
                    if (table[i][j] == 0){
                        int[] num = {1,2,3,4,5,6,7,8,9};
                        int count = 0;
                        int temp  = 0;
                        for (int z: num) {
                            if (check(table, z, i, j) && count < 2){
                                count++;
                                temp = z;
                            }
                        }
                        if (count == 1){
                            table[i][j] = temp;
                            filled++;
                        }
                    }
                }
            }
        }

        System.out.println(filled);

        for (int[] i: table) {
            System.out.println(Arrays.toString(i));
        }

    }

    public static boolean check(int[][] board,int num, int x, int y){
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == num || board[i][y] == num){
                return false;
            }
        }
        x = x - x%3;
        y = y - y%3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[x+i][y+j] == num){
                    return false;
                }
            }
        }
        return true;
    }

//    public static void oneOnly(int[][] board, int x, int y, int fill ){
//        int[] num = {1,2,3,4,5,6,7,8,9};
//        int count = 0;
//        int temp  = 0;
//        for (int i: num) {
//            if (check(board, i, x, y) && count <2){
//                count++;
//                temp = i;
//            }
//        }
//        if (count == 1){
//            board[x][y] = temp;
//            fill++;
//        }
//    }

}
