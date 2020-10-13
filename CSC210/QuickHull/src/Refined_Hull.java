import java.util.ArrayList;

public class Refined_Hull {
    ArrayList<Point> answer = new ArrayList<>();

    public Refined_Hull(int[] points){

    }

    public double lineDist(Point p1, Point p2, Point p){
        return  Math.abs((p.y - p1.y) * (p2.x - p1.x) -
                (p2.y - p1.y) * (p.x - p1.x));
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}

class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
