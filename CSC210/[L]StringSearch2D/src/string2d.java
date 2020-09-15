public class string2d {
    public static void main(String[] args) {
        char[][] puzzle = {
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'},
                {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'},
                {'e', 'f', 'r', 'o', 'p', 'o', 'k', 'l'},
                {'a', 'b', 'c', 'd', 'e', 'c', 'a', 'n'},
                {'a', 'p', 'e', 'e', 'm', 'f', 'g', 'h'},
                {'d', 'n', 'a', 's', 'm', 'a', 'r', 't'},
                {'a', 'y', 'o', 'b', 'e', 'f', 'g', 'h'},
                {'m', 'n', 'o', 'p', 'q', 'r', 's', 't'}
        };
        int[] position = new int[2];
        System.out.println(puzzle.length);
        position = search(puzzle, "agt");
        System.out.println("" + position[0] + " " + position[1]);
    }

    public static int[] search(char[][] a, String key) {
        int[] location = {-1,-1};
        for (int row = 0; row < a.length; row++){
            for (int column = 0; column < a[0].length; column++){
                boolean T = row - key.length() + 1 >= 0;
                boolean B = (a.length - (row + 1)) - (key.length() - 1) >= 0;
                boolean L = column - key.length() + 1 >= 0;
                boolean R = (a[0].length - (column + 1)) - (key.length() - 1)  >= 0;
                int count = 0;
                // Horizontal Forward
                //column+count < key.length
                while ((R) && count < key.length() && a[row][column+count] == key.charAt(count)) {
                    count++;
                }
                if (key.length() == count){
                    location[0] = row;
                    location[1] = column;
                    return location;
                }
                count = 0;
                // Horizontal Backward
                while ((L) && count < key.length() && a[row][column-count] == key.charAt(count)) {
                    count++;
                }
                if (key.length() == count){
                    location[0] = row;
                    location[1] = column;
                    return location;
                }
                // Vertical TopDown
                count = 0;
                while ((B) && count < key.length() && a[row+count][column] == key.charAt(count)) {
                    count++;
                }
                if (key.length() == count){
                    location[0] = row;
                    location[1] = column;
                    return location;
                }
                // Vertical BottomUp
                count = 0;
                //row-count > -1
                while ((T) && count < key.length() && a[row-count][column] == key.charAt(count)) {
                    count++;
                }
                if (key.length() == count){
                    location[0] = row;
                    location[1] = column;
                    return location;
                }
                //TL
                count = 0;
                //row-count > -1 && column-count > -1
                //
                while ((T & L)
                        && count < key.length() && a[row-count][column-count] == key.charAt(count)) {
                    count++;
                }
                if (key.length() == count){
                    location[0] = row;
                    location[1] = column;
                    return location;
                }
                //TR
                count = 0;
                //row-count > -1 && column+count < a[0].length
                while ((T & R)
                        && count < key.length() && a[row-count][column+count] == key.charAt(count)) {
                    count++;
                }
                if (key.length() == count){
                    location[0] = row;
                    location[1] = column;
                    return location;
                }
                //BL
                count = 0;
                //row+count < a.length && column-count > -1
                while ((B & L)
                        &&  count < key.length() && a[row+count][column-count] == key.charAt(count) ) {
                    count++;
                }
                if (key.length() == count){
                    location[0] = row;
                    location[1] = column;
                    return location;
                }
                //BR
                count = 0;
                while ((B & R)
                        && count < key.length() && a[row+count][column+count] == key.charAt(count)) {
                    count++;
                }
                if (key.length() == count){
                    location[0] = row;
                    location[1] = column;
                    return location;
                }

            }
        }

        return location;
    }
}
