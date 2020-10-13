public class Main {
    public static void main(String[] args) {
        int[][] points = {{0, 3}, {1, 1}, {2, 2}, {4, 4},
                {0, 0}, {1, 2}, {3, 1}, {3, 3}};

        int[][] answer = new int[points.length][2];
        int index = 0;
        int[] Xmax = points[0], Xmin = points[0];

        for (int[] ints : points) {
            if (ints[0] > Xmax[0]) {
                Xmax = ints;
            } else if (ints[0] < Xmin[0]) {
                Xmin = ints;
            }
        }


    }

    public static void quickHull(int[][] points, int[][] answer,int[] point1, int[] point2, int index){
        if (points.length == 0){

        } else {
            double Line_m = (point1[1] - point2[1]) /(double)(point1[0] - point2[0]);
            double Line_c = point1[1] - Line_m*point1[0];
            double Perpendicular_m = -1/Line_m;
            double distance = 0;
            int[] furthest = new int[2];
            for (int[] point : points) {
                if (point != point2 || point != point1) {
                    double Perpendicular_c = point[1] - Perpendicular_m * point[0];
                    double X_intersect = (Perpendicular_c - Line_c)/(Line_m - Perpendicular_m);
                    double Y_intersect = Perpendicular_m*X_intersect + Perpendicular_c;
                    double temp = Math.sqrt(Math.pow(X_intersect-point[0], 2) + Math.pow(Y_intersect-point[1], 2));
                    if (temp < distance){
                        distance = temp;
                        furthest = point;
                    }
                }
            }

            for (int[] point : points) {
                if (point != point2 || point != point1 || point != furthest) {

                }
            }


        }

    }

    static double area(int x1, int y1, int x2, int y2,
                       int x3, int y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2.0);
    }

    /* A function to check whether point P(x, y) lies
       inside the triangle formed by A(x1, y1),
       B(x2, y2) and C(x3, y3) */
    static boolean isInside(int x1, int y1, int x2,
                            int y2, int x3, int y3, int x, int y)
    {
        /* Calculate area of triangle ABC */
        double A = area (x1, y1, x2, y2, x3, y3);

        /* Calculate area of triangle PBC */
        double A1 = area (x, y, x2, y2, x3, y3);

        /* Calculate area of triangle PAC */
        double A2 = area (x1, y1, x, y, x3, y3);

        /* Calculate area of triangle PAB */
        double A3 = area (x1, y1, x2, y2, x, y);

        /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }

    public static boolean isIn(int a, int b, int c, int p){
        return false;
    }


}
