package lr5.Example3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        Point point1 = new Point(3);
        Point point2 = new Point(1, 5);
        System.out.println(point.x + " " + point.y);
        System.out.println(point1.x + " " + point1.y);
        System.out.println(point2.x + " " + point2.y);
    }
}
